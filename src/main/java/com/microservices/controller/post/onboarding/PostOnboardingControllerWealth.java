/**
 * 
 */
package com.microservices.controller.post.onboarding;

import java.io.IOException;
import java.util.HashMap;

import javax.validation.Valid;

import org.apache.tomcat.util.json.JSONParser;
import org.apache.tomcat.util.json.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import com.microservices.entities.RequestModel.post.onboarding.MutualFundsUCCCreationCustId;
import com.microservices.entities.RequestModel.post.onboarding.PanDocumentDetail;
import com.microservices.entities.ResponseModel.post.onboarding.MutualFundsUccResponse;
import com.microservices.entities.ResponseModel.post.onboarding.PanValidationResponse;
import com.microservices.entities.ResponseModelGeneral.GeneralResponse;
import com.microservices.services.serviceInterface.post.onboarding.PostOnboardingWealthServiceLayer;
import com.microservices.utility.post.FileUploadComponent;
import com.microservices.utility.post.PostOnboardingDocumentValidationPanConstants;

/**
 * @author 33000005
 *
 */
@RestController
@RequestMapping("/api/v1/Post/Onboarding")
public class PostOnboardingControllerWealth {

	/**
	 * 
	 */
	
	@Autowired
	private PostOnboardingWealthServiceLayer postOnboardingWealthServiceLayer;
	
	@Autowired
	private FileUploadComponent fileUploadComponent;
	
	private RestTemplate restTemplate;
	
	
	@PostMapping("/image-upload")
	public String uploadImage(@RequestParam("AadharFront") MultipartFile aadharFrontFile) throws IOException {
		if(!fileUploadComponent.uploadFile(aadharFrontFile).isEmpty()) {
			if(fileUploadComponent.deleteFile(aadharFrontFile)) {
				return "File uploaded and deleted successfully!!";
			}
			return "File Uploaded Successfully!!";
		}
//	--	String path = fileUploadComponent.uploadFile(aadharFrontFile);
//	--	FileSystemResource fileSystemResource = new FileSystemResource(path);
//		ClassPathResource fileStore = new ClassPathResource(path);
//		Class clazz = FileOperationsTest.class;
//		InputStream inputStream = clazz.getResourceAsStream(path);
//	    String data = readFromInputStream(inputStream);
//	   -- InputStream iStream = fileSystemResource.getInputStream();
//	   -- byte[] data = new byte[iStream.available()];
//	   -- iStream.read(data);
//	    
//	    
//	   -- return fileSystemResource;
	    //return data;
		return "File Upload Failed";
	}
	
	
	@SuppressWarnings({ "unchecked"})
	@PostMapping("/AadharPanUpload")
	public GeneralResponse uploadAadharPan(@RequestParam("AadharFront") MultipartFile aadharFrontFile, @RequestParam("Pan") MultipartFile panFile, @RequestParam("AadharBack") MultipartFile aadharBackFile, @RequestParam("IncomeProof") MultipartFile incomeProofFile, @RequestParam("CustGuId") String CustGuId) throws ParseException, IOException{
		String transID = "123444";
		String docType = "9";

		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "multipart/form-data");
		headers.add("username", "test.torus@authbridge.com");
		
//		HttpEntity<HashMap<String, Object>> entity = new HttpEntity<HashMap<String,Object>>(map, headers);
		
		String urlString = "https://www.truthscreen.com/api/v2.2/idocr/token";
		
		restTemplate = new RestTemplate(); 

        MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
        map.add("transID", transID);
        map.add("docType", docType);

        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);

        //1st 3rd party API call
        String resToken = restTemplate.postForObject(urlString, request, String.class);

		
		System.out.println(resToken);
		
		HttpHeaders headersDecrypt = new HttpHeaders();
		//headers.add("Content-Type", "multipart/form-data");
		headersDecrypt.add("username", "test.torus@authbridge.com");
		headersDecrypt.add("Content-Type", "application/json");
		
		HttpEntity<String> request2 = new HttpEntity<String>(resToken, headersDecrypt);
		
		urlString = "https://www.truthscreen.com/InstantSearch/decrypt_encrypted_string";
		
		//2nd 3rd party API call
		String resDecrypt = restTemplate.postForObject(urlString, request2, String.class);
		
		System.out.println(resDecrypt);
		
		JSONParser parser = new JSONParser(resDecrypt);
		HashMap<String, Object> decryptJsonObject = (HashMap<String, Object>) parser.parse();
		
		urlString = "https://www.truthscreen.com/api/v2.2/idocr/tokenEncrypt";
		
		HashMap<String, Object> msg = (HashMap<String, Object>) decryptJsonObject.get("msg");
		System.out.println(msg.get("secretToken"));
		
		if(msg.get("secretToken").equals(null)) {
			GeneralResponse finalResponse = new GeneralResponse(1, 0, "", "Please check with administrator!");
			return finalResponse;
		}
		
		MultiValueMap<String, String> tokenEncrypt = new LinkedMultiValueMap<String, String>();
		tokenEncrypt.add("token", (String) msg.get("secretToken"));
		
		request = new HttpEntity<MultiValueMap<String, String>>(tokenEncrypt, headers);
		
		//3rd, 3rd party API call
		String responseTokenEncrypt = restTemplate.postForObject(urlString, request, String.class);
		
		urlString = "https://www.truthscreen.com/api/v2.2/idocr/verify";
		
		String filePath = fileUploadComponent.uploadFile(aadharFrontFile);
		
		//getting file from local to send to third party API
		FileSystemResource aadharFile = new FileSystemResource(filePath);
		
		MultiValueMap<String, Object> reqVerify = new LinkedMultiValueMap<String, Object>();
		reqVerify.add("tsTransID", (String) msg.get("tsTransID"));
		reqVerify.add("secretToken", responseTokenEncrypt);
		reqVerify.add("front_image", aadharFile);
		
		HttpEntity<MultiValueMap<String, Object>> requestVerifyEntity = new HttpEntity<MultiValueMap<String, Object>>(reqVerify, headers);
		
		//4th, 3rd party API call
		String responseVerify = restTemplate.postForObject(urlString, requestVerifyEntity, String.class);
		
		fileUploadComponent.deleteFile(aadharFrontFile);
		
		System.out.println("Response Verify" + responseVerify);
		
		urlString = "https://www.truthscreen.com/InstantSearch/decrypt_encrypted_string";
		request2 = new HttpEntity<String>(responseVerify, headersDecrypt);
		
		//5th, final 3rd party API call
		ByteArrayResource responseImageBytes = restTemplate.postForObject(urlString, request2, ByteArrayResource.class);

		System.out.println(responseImageBytes);
		
		
		//getting image in bytes
		byte[] aadharDataByte = responseImageBytes.getByteArray();
		
		//To upload the masked aadhar file in local
//		if(fileUploadComponent.writeFile("MaskedAadharFront.jpeg", aadharDataByte).isEmpty()) {
//			System.out.println("File Download Failed!");
//		}
		
		byte[] panDataByte = panFile.getBytes();
		
		byte[] incomeProofByte = incomeProofFile.getBytes();
		
		System.out.println("Done");
		
		String resMessage = "Upload failed";
		
		//Saving Aadhaar image in the database
		if(postOnboardingWealthServiceLayer.saveAadharImage(CustGuId, aadharDataByte, "Aadhar"))
		{
			//GeneralResponse finalResponse = new GeneralResponse(1, 0, "", "Successfully Uploaded Aadhar!");
			resMessage = "Successfully Uploaded Aadhar";
			//returning response
			//return finalResponse;
		}
		
		//Saving Pan image in the database
		if(postOnboardingWealthServiceLayer.saveAadharImage(CustGuId, panDataByte, "Pan")) {
			resMessage += ", Pan";
		}
		
		//Saving Income Proof Document in the database
		if(postOnboardingWealthServiceLayer.saveAadharImage(CustGuId, incomeProofByte, "IncomeProof")) {
			resMessage += " and Income Proof";
		}

		if(resMessage.equals("Upload failed")) {
			GeneralResponse finalResponse = new GeneralResponse(0, 1, "", "Upload Documents Failed!");
			return finalResponse;
		}
		
		//returning response
		GeneralResponse finalResponse = new GeneralResponse(1, 0, "", resMessage + "!");
		return finalResponse;
//		return "Done";
	}
	
	@PostMapping("/Document/PanValidation")
	public PanValidationResponse getPanValidation(@Valid @RequestBody PanDocumentDetail panDetail, @RequestHeader String Token) {
		
//		map = new HashMap<String, Object>();
//		
//		String objpanDetail1Number = PostOnboardingDocumentValidationPanConstants.PostOnboardingDocumentValidationPanOR.getProperty("panDetail1Number");
//		map.put(objpanDetail1Number, panDetail.getDocNumber());
		
		HttpHeaders headers = new HttpHeaders();
		String objheaderToken = PostOnboardingDocumentValidationPanConstants.PostOnboardingDocumentValidationPanOR.getProperty("headerToken");
		headers.add(objheaderToken, Token);
		
//		HttpEntity<Map<String, Object>> entity = new HttpEntity<Map<String,Object>>(map, headers);
		
		HttpEntity<PanDocumentDetail> entity = new HttpEntity<PanDocumentDetail>(panDetail, headers);
		
		restTemplate = new RestTemplate();
		
		String objPanValidationPostURL =  PostOnboardingDocumentValidationPanConstants.PostOnboardingDocumentValidationPanOR.getProperty("PanValidationPostURL");
	    return restTemplate.postForEntity(objPanValidationPostURL, entity, PanValidationResponse.class, headers).getBody();	
	}
	
	@PostMapping("/mutualfunds/UCCcreation")
	public MutualFundsUccResponse GetDetails(@RequestBody MutualFundsUCCCreationCustId requestparameter)
	{
//		UccResponse uccresponse = uccservice.GetData();
		//System.out.println(requestparameter.getCustId());
		return postOnboardingWealthServiceLayer.getUCCCreationConfirmation(requestparameter.getCustId(), requestparameter.getRegnType());
		//return "";
		//return uccresponse;
	}
}
