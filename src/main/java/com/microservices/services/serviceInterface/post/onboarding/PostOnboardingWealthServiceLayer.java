/**
 * 
 */
package com.microservices.services.serviceInterface.post.onboarding;

import com.microservices.entities.ResponseModel.post.onboarding.MutualFundsUccResponse;

/**
 * @author 33000005
 *
 */
public interface PostOnboardingWealthServiceLayer {
	public MutualFundsUccResponse getUCCCreationConfirmation(String CustId, String regnType);
	public boolean saveAadharImage(String custGuId, byte[] imageData, String docType);
}
