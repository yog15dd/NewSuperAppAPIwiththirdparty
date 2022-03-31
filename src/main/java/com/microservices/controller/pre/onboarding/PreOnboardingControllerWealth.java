/**
 * 
 */
package com.microservices.controller.pre.onboarding;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.entities.RequestModel.pre.onbaording.SignupLoginCustomerDetails;
import com.microservices.entities.ResponseModelGeneral.GeneralResponse;
import com.microservices.services.serviceInterface.pre.onboarding.PreOnboardingWealthServiceLayer;

/**
 * @author 33000005
 *
 */
@RestController
@RequestMapping("/api/v1/Pre/Onboarding/wealth")
public class PreOnboardingControllerWealth {

	/**
	 * 
	 */
	@Autowired
	private PreOnboardingWealthServiceLayer wealthServiceLayer;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome onboard to wealth torus";
	}
	
	@PostMapping("/RegisterCustomer")
	public GeneralResponse registerCustomer(@Valid @RequestBody SignupLoginCustomerDetails customerDetails) {
		System.out.println(customerDetails.toString());
		if(!this.wealthServiceLayer.registerCustomer(customerDetails)) {
			return new GeneralResponse(1, 0, "I", "Customer Registered Successfully");
		}
		else return new GeneralResponse(-1, 3, "", "Registration failed");
	}

}
