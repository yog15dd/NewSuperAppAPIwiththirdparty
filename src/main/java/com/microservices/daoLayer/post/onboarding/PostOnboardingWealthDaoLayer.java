/**
 * 
 */
package com.microservices.daoLayer.post.onboarding;

/**
 * @author 33000005
 *
 */
public interface PostOnboardingWealthDaoLayer {
	public String getParamForUCC(String CustId);

	public boolean saveAadharImage(String custGuId, byte[] imageData, String docType);
}
