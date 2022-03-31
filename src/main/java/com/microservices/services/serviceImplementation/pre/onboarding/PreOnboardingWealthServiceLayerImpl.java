/**
 * 
 */
package com.microservices.services.serviceImplementation.pre.onboarding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.daoLayer.pre.onboarding.PreOnboardingWealthDaoLayer;
import com.microservices.entities.RequestModel.pre.onbaording.SignupLoginCustomerDetails;
import com.microservices.services.serviceInterface.pre.onboarding.PreOnboardingWealthServiceLayer;

/**
 * @author 33000005
 *
 */
@Service
public class PreOnboardingWealthServiceLayerImpl implements PreOnboardingWealthServiceLayer {

	/**
	 * 
	 */
	@Autowired
	private PreOnboardingWealthDaoLayer wealthDaoLayer;

	@Override
	public boolean registerCustomer(SignupLoginCustomerDetails customerDetails) {
		// TODO Auto-generated method stub
		return wealthDaoLayer.registerCustomer(customerDetails);
	}

}
