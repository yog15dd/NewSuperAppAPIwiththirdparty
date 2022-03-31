/**
 * 
 */
package com.microservices.daoLayer.pre.onboarding;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.microservices.entities.RequestModel.pre.onbaording.SignupLoginCustomerDetails;
import com.microservices.utility.pre.PreOnboardingWealthConstants;

/**
 * @author 33000005
 *
 */
@Repository
public class PreOnboardingWealthDaoLayerImpl implements PreOnboardingWealthDaoLayer {

	/**
	 * 
	 */
	@Autowired
	private EntityManager em;

	@Override
	public boolean registerCustomer(SignupLoginCustomerDetails customerDetails) {
		StoredProcedureQuery query = em.createStoredProcedureQuery(PreOnboardingWealthConstants.PreOnboardingWealthOR.getProperty("SignupLoginSP"))
				.registerStoredProcedureParameter(PreOnboardingWealthConstants.PreOnboardingWealthOR.getProperty("SourceTypeVarSignupLoginSP"), String.class, ParameterMode.IN)
				.registerStoredProcedureParameter(PreOnboardingWealthConstants.PreOnboardingWealthOR.getProperty("ClientIdVarSignupLoginSP"), String.class, ParameterMode.IN)
				.registerStoredProcedureParameter(PreOnboardingWealthConstants.PreOnboardingWealthOR.getProperty("EmailIdVarSignupLoginSP"), String.class, ParameterMode.IN)
				.registerStoredProcedureParameter(PreOnboardingWealthConstants.PreOnboardingWealthOR.getProperty("MobileNoVarSignupLoginSP"), String.class, ParameterMode.IN)
				.registerStoredProcedureParameter(PreOnboardingWealthConstants.PreOnboardingWealthOR.getProperty("IdentityVarSignupLoginSP"), String.class, ParameterMode.IN)
				.registerStoredProcedureParameter(PreOnboardingWealthConstants.PreOnboardingWealthOR.getProperty("SalutationVarSignupLoginSP"), String.class, ParameterMode.IN)
				.registerStoredProcedureParameter(PreOnboardingWealthConstants.PreOnboardingWealthOR.getProperty("FirstNameVarSignupLoginSP"), String.class, ParameterMode.IN)
				.registerStoredProcedureParameter(PreOnboardingWealthConstants.PreOnboardingWealthOR.getProperty("MiddleNameVarSignupLoginSP"), String.class, ParameterMode.IN)
				.registerStoredProcedureParameter(PreOnboardingWealthConstants.PreOnboardingWealthOR.getProperty("LastNameVarSignupLoginSP"), String.class, ParameterMode.IN)
				.registerStoredProcedureParameter(PreOnboardingWealthConstants.PreOnboardingWealthOR.getProperty("GenderVarSignupLoginSP"), String.class, ParameterMode.IN)
				.registerStoredProcedureParameter(PreOnboardingWealthConstants.PreOnboardingWealthOR.getProperty("DateOfBirthVarSignupLoginSP"), String.class, ParameterMode.IN)
				.registerStoredProcedureParameter(PreOnboardingWealthConstants.PreOnboardingWealthOR.getProperty("CurrencyVarSignupLoginSP"), String.class, ParameterMode.IN)
				.registerStoredProcedureParameter(PreOnboardingWealthConstants.PreOnboardingWealthOR.getProperty("LanguageVarSignupLoginSP"), String.class, ParameterMode.IN)
				.registerStoredProcedureParameter(PreOnboardingWealthConstants.PreOnboardingWealthOR.getProperty("AddressLine1VarSignupLoginSP"), String.class, ParameterMode.IN)
				.registerStoredProcedureParameter(PreOnboardingWealthConstants.PreOnboardingWealthOR.getProperty("AddressLine2VarSignupLoginSP"), String.class, ParameterMode.IN)
				.registerStoredProcedureParameter(PreOnboardingWealthConstants.PreOnboardingWealthOR.getProperty("AddressLine3VarSignupLoginSP"), String.class, ParameterMode.IN)
				.registerStoredProcedureParameter(PreOnboardingWealthConstants.PreOnboardingWealthOR.getProperty("PincodeVarSignupLoginSP"), String.class, ParameterMode.IN)
				.registerStoredProcedureParameter(PreOnboardingWealthConstants.PreOnboardingWealthOR.getProperty("CityVarSignupLoginSP"), String.class, ParameterMode.IN)
				.registerStoredProcedureParameter(PreOnboardingWealthConstants.PreOnboardingWealthOR.getProperty("StateVarSignupLoginSP"), String.class, ParameterMode.IN)
				.registerStoredProcedureParameter(PreOnboardingWealthConstants.PreOnboardingWealthOR.getProperty("AddressTypeVarSignupLoginSP"), String.class, ParameterMode.IN)
				.setParameter(PreOnboardingWealthConstants.PreOnboardingWealthOR.getProperty("SourceTypeVarSignupLoginSP"), customerDetails.getSourceType())
				.setParameter(PreOnboardingWealthConstants.PreOnboardingWealthOR.getProperty("ClientIdVarSignupLoginSP"), customerDetails.getClientId())
				.setParameter(PreOnboardingWealthConstants.PreOnboardingWealthOR.getProperty("EmailIdVarSignupLoginSP"), customerDetails.getEmailId())
				.setParameter(PreOnboardingWealthConstants.PreOnboardingWealthOR.getProperty("MobileNoVarSignupLoginSP"), customerDetails.getMobileNo())
				.setParameter(PreOnboardingWealthConstants.PreOnboardingWealthOR.getProperty("IdentityVarSignupLoginSP"), customerDetails.getIdentity())
				.setParameter(PreOnboardingWealthConstants.PreOnboardingWealthOR.getProperty("SalutationVarSignupLoginSP"), customerDetails.getSalutation())
				.setParameter(PreOnboardingWealthConstants.PreOnboardingWealthOR.getProperty("FirstNameVarSignupLoginSP"), customerDetails.getFirstName())
				.setParameter(PreOnboardingWealthConstants.PreOnboardingWealthOR.getProperty("MiddleNameVarSignupLoginSP"), customerDetails.getMiddleName())
				.setParameter(PreOnboardingWealthConstants.PreOnboardingWealthOR.getProperty("LastNameVarSignupLoginSP"), customerDetails.getLastName())
				.setParameter(PreOnboardingWealthConstants.PreOnboardingWealthOR.getProperty("GenderVarSignupLoginSP"), customerDetails.getGender())
				.setParameter(PreOnboardingWealthConstants.PreOnboardingWealthOR.getProperty("DateOfBirthVarSignupLoginSP"), customerDetails.getDateOfBirth())
				.setParameter(PreOnboardingWealthConstants.PreOnboardingWealthOR.getProperty("CurrencyVarSignupLoginSP"), customerDetails.getCurrency())
				.setParameter(PreOnboardingWealthConstants.PreOnboardingWealthOR.getProperty("LanguageVarSignupLoginSP"), customerDetails.getLanguage())
				.setParameter(PreOnboardingWealthConstants.PreOnboardingWealthOR.getProperty("AddressLine1VarSignupLoginSP"), customerDetails.getAddressLine1())
				.setParameter(PreOnboardingWealthConstants.PreOnboardingWealthOR.getProperty("AddressLine2VarSignupLoginSP"), customerDetails.getAddressLine2())
				.setParameter(PreOnboardingWealthConstants.PreOnboardingWealthOR.getProperty("AddressLine3VarSignupLoginSP"), customerDetails.getAddressLine3())
				.setParameter(PreOnboardingWealthConstants.PreOnboardingWealthOR.getProperty("PincodeVarSignupLoginSP"), customerDetails.getPincode())
				.setParameter(PreOnboardingWealthConstants.PreOnboardingWealthOR.getProperty("CityVarSignupLoginSP"), customerDetails.getCity())
				.setParameter(PreOnboardingWealthConstants.PreOnboardingWealthOR.getProperty("StateVarSignupLoginSP"), customerDetails.getState())
				.setParameter(PreOnboardingWealthConstants.PreOnboardingWealthOR.getProperty("AddressTypeVarSignupLoginSP"), customerDetails.getAddressType());
		return query.execute();
	}

}
