/**
 * 
 */
package com.microservices.controller.call.shopping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.entities.ResponseModel.call.shopping.ShoppingOfferListResponse;
import com.microservices.services.serviceInterface.call.shopping.CallShoppingGeneralServiceLayer;


/**
 * @author 33000005
 *
 */
@RestController
@RequestMapping("/api/v1/Call/Shopping")
public class CallShoppingControllerGeneral {

	/**
	 * 
	 */
	
	@Autowired
	private CallShoppingGeneralServiceLayer shoppingServiceLayer;
	
	@GetMapping("/catalog/GetOfferingList")
	public ShoppingOfferListResponse getoffers() {
		return this.shoppingServiceLayer.getOffers();
//		Response response = new Response(1, 0, "I", "Success", list);
//		return response;
	}

}
