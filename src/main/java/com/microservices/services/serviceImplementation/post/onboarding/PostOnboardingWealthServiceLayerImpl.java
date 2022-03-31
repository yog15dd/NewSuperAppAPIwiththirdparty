/**
 * 
 */
package com.microservices.services.serviceImplementation.post.onboarding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservices.daoLayer.post.onboarding.PostOnboardingWealthDaoLayer;
import com.microservices.entities.Model.post.onboarding.MutualFundsUccCreationRequest;
import com.microservices.entities.ResponseModel.post.onboarding.MutualFundsUccResponse;
import com.microservices.services.serviceInterface.post.onboarding.PostOnboardingWealthServiceLayer;

/**
 * @author 33000005
 *
 */
@Service
public class PostOnboardingWealthServiceLayerImpl implements PostOnboardingWealthServiceLayer {

	/**
	 * 
	 */
	@Autowired
	private PostOnboardingWealthDaoLayer postOnboardingWealthDaoLayer; 
	
	private RestTemplate restTemplate;
	
	public PostOnboardingWealthServiceLayerImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public MutualFundsUccResponse getUCCCreationConfirmation(String CustId, String regnType) {
		String Params = postOnboardingWealthDaoLayer.getParamForUCC(CustId);
		System.out.println(Params + "Service: 38");
		String url="https://bsestarmfdemo.bseindia.com/StarMFCommonAPI/ClientMaster/Registration";
		if(regnType == null) {
			regnType = "NEW";
		}
		MutualFundsUccCreationRequest request = new MutualFundsUccCreationRequest("5328901", "53289", "@1234", regnType, Params , "", "");
		restTemplate=new RestTemplate();
		System.out.println(request.toString());
		return restTemplate.postForEntity(url, request, MutualFundsUccResponse.class).getBody();
	}

	@Override
	public boolean saveAadharImage(String custGuId, byte[] imageData, String docType) {
		return postOnboardingWealthDaoLayer.saveAadharImage(custGuId, imageData, docType);
		//return false;
	}

}
