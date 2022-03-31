package com.microservices.services.serviceInterface.call.shopping;

import com.microservices.entities.ResponseModel.call.shopping.ShoppingOfferListResponse;

public interface CallShoppingGeneralServiceLayer {
	
	public ShoppingOfferListResponse getOffers();

}
