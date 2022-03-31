/**
 * 
 */
package com.microservices.controller.post.shopping;

import java.util.HashMap;
import java.util.Map;

import org.apache.tomcat.util.json.JSONParser;
import org.apache.tomcat.util.json.ParseException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

/**
 * @author 33000005
 *
 */
@RestController
@RequestMapping("/api/v1/Post/Shopping")
public class PostShoppingControllerWealth {

	/**
	 * @throws ParseException 
	 * 
	 */
	private RestTemplate restTemplate;
	
	@SuppressWarnings("unchecked")
	@PostMapping("/Stocks/OrderBook")
	public HashMap<String, Object> getOrderBook(@RequestBody String req) throws ParseException {
		//JSONParser parser = new JSONParser(req);  
		//JSONObject thirdPartyRequest = (JSONObject) parser.parse();
		
		//HashMap<String, Object> mapRequest = new Gson().fromJson(thirdPartyRequest.toString(), HashMap.class);
		
		String urlString = "https://tickweb.heytorus.com/RupeeSeedWS/OrderBook";
		
		restTemplate = new RestTemplate();
		String thirdPartyResponseString = restTemplate.postForObject(urlString, req, String.class);
		System.out.println(thirdPartyResponseString);
		
		JSONParser parser = new JSONParser(thirdPartyResponseString);  
		HashMap<String, Object> thirdPartyResponse = (HashMap<String, Object>) parser.parse();
		
		return thirdPartyResponse;
	}
	
	@SuppressWarnings("unchecked")
	@PostMapping("/Stocks/OrderDetails")
	public HashMap<String, Object> getOrderDetails(@RequestBody String req) throws ParseException {
		String urlString = "https://tickweb.heytorus.com/RupeeSeedWS/OrderDetails";
		
		restTemplate = new RestTemplate();
		String thirdPartyResponseString = restTemplate.postForObject(urlString, req, String.class);
		
		JSONParser parser = new JSONParser(thirdPartyResponseString);  
		HashMap<String, Object> thirdPartyResponse = (HashMap<String, Object>) parser.parse();
		
//		Gson gson = new Gson();
//		Map<Object, Object> responseJsonObject = gson.fromJson(gson.toJson(thirdPartyResponseString), Map.class);
		
		return thirdPartyResponse;
//		return responseJsonObject;
	}
	
	@SuppressWarnings("unchecked")
	@PostMapping("/Stocks/TradeBook")
	public HashMap<String, Object> getTradeBook(@RequestBody String req) throws ParseException{
		String urlString = "https://tickweb.heytorus.com/RupeeSeedWS/TradeBook";
		
		restTemplate = new RestTemplate();
		String thirdPartyResponseString = restTemplate.postForObject(urlString, req, String.class);
		
		JSONParser parser = new JSONParser(thirdPartyResponseString);  
		HashMap<String, Object> thirdPartyResponse = (HashMap<String, Object>) parser.parse();
		
		return thirdPartyResponse;
	}
}
