/**
 * 
 */
package com.microservices.daoLayer.call.shopping;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.microservices.entities.Model.call.shopping.ShoppingOffers;
import com.microservices.utility.call.CallShoppingGeneralConstants;

/**
 * @author 33000005
 *
 */
@Repository
public class CallShoppingGeneralDaoLayerImpl implements CallShoppingGeneralDaoLayer {

	/**
	 * 
	 */
	@Autowired
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<ShoppingOffers> getOffers(){
		
		StoredProcedureQuery query = em.createStoredProcedureQuery(CallShoppingGeneralConstants.CallShoppingGeneralOR.getProperty("GetOfferListSP"), CallShoppingGeneralConstants.CallShoppingGeneralOR.getProperty("GetOfferListSPEntity"));
		query.execute();
		return query.getResultList();
	}

}
