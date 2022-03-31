/**
 * 
 */
package com.microservices.daoLayer.post.onboarding;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author 33000005
 *
 */
@Repository
public class PostOnboardingWealthDaoLayerImpl implements PostOnboardingWealthDaoLayer {

	/**
	 * 
	 */
	
	@Autowired
	private EntityManager eManager;

	@Override
	public String getParamForUCC(String CustId) {
		// TODO Auto-generated method stub
		try {
			StoredProcedureQuery query = eManager.createStoredProcedureQuery("MF_UCCGenerationParam")
					.registerStoredProcedureParameter("CustGuId", String.class, ParameterMode.IN)
					.setParameter("CustGuId", CustId);
			query.execute();
			System.out.println(query.getSingleResult()+"Repository:35");
			return query.getSingleResult().toString();
				}
				catch(Exception ex)
				{
					return ex.toString();
				}
	}

	@Override
	public boolean saveAadharImage(String custGuId, byte[] imageData, String docType) {
		try {
			StoredProcedureQuery query = eManager.createStoredProcedureQuery("InsertNoKRADocumentDetails")
					.registerStoredProcedureParameter("CustGuId", String.class, ParameterMode.IN)
					.registerStoredProcedureParameter("SocialClientId", String.class, ParameterMode.IN)
					.registerStoredProcedureParameter("DocumentType", String.class, ParameterMode.IN)
					.registerStoredProcedureParameter("DocNumber", String.class, ParameterMode.IN)
					.registerStoredProcedureParameter("IFSCCode", String.class, ParameterMode.IN)
					.registerStoredProcedureParameter("BankName", String.class, ParameterMode.IN)
					.registerStoredProcedureParameter("Image", byte[].class, ParameterMode.IN)
					.setParameter("CustGuId", custGuId)
					.setParameter("SocialClientId", null)
					.setParameter("DocumentType", docType)
					.setParameter("DocNumber", null)
					.setParameter("IFSCCode", null)
					.setParameter("BankName", null)
					.setParameter("Image", imageData);
			System.out.println(custGuId + imageData + docType);
			System.out.println(query);
			query.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

}
