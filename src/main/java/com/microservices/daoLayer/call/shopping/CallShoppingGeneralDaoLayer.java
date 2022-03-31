package com.microservices.daoLayer.call.shopping;

import java.util.List;

import com.microservices.entities.Model.call.shopping.ShoppingOffers;

public interface CallShoppingGeneralDaoLayer {

	public List<ShoppingOffers> getOffers();
}
