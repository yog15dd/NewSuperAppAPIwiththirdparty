/**
 * 
 */
package com.microservices.services.serviceImplementation.call.shopping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.daoLayer.call.shopping.CallShoppingGeneralDaoLayer;
import com.microservices.entities.Model.call.shopping.ShoppingOffers;
import com.microservices.entities.ResponseModel.call.shopping.ShoppingOfferListResponse;
import com.microservices.services.serviceInterface.call.shopping.CallShoppingGeneralServiceLayer;

/**
 * @author 33000005
 *
 */
@Service
public class CallShoppingGeneralServiceLayerImpl implements CallShoppingGeneralServiceLayer {

	/**
	 * 
	 */
	@Autowired
	private CallShoppingGeneralDaoLayer shoppingGeneralDaoLayer;
	public CallShoppingGeneralServiceLayerImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ShoppingOfferListResponse getOffers() {
		// TODO Auto-generated method stub
		List<ShoppingOffers> list = shoppingGeneralDaoLayer.getOffers();
		ShoppingOfferListResponse response = new ShoppingOfferListResponse(1, 0, "I", "Success", list);
		return response;
		//response = new Response(status, errorCode, messageType, message, list);
	}

}
