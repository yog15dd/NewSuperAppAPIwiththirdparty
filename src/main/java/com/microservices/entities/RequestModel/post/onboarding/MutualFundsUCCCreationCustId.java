package com.microservices.entities.RequestModel.post.onboarding;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MutualFundsUCCCreationCustId {

	private String UserId;
	private String regnType;

	public String getCustId() {
		return UserId;
	}

	public void setCustId(String custId) {
		UserId = custId;
	}

	@JsonCreator
	public MutualFundsUCCCreationCustId(@JsonProperty("CustGuId") String custId, @JsonProperty("RegnType") String regnType) {
		super();
		UserId = custId;
		this.regnType = regnType;
	}

	public String getRegnType() {
		return regnType;
	}

	public void setRegnType(String regnType) {
		this.regnType = regnType;
	}

	public MutualFundsUCCCreationCustId() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
