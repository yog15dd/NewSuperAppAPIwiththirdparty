package com.microservices.entities.Model.post.onboarding;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MutualFundsUccCreationRequest {

	private String UserId;
	private String MemberCode;
	private String Password;
	private String RegnType;
	private String Param;
	private String Filler1;
	private String Filler2;
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getMemberCode() {
		return MemberCode;
	}
	public void setMemberCode(String memberCode) {
		MemberCode = memberCode;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getRegnType() {
		return RegnType;
	}
	public void setRegnType(String regnType) {
		RegnType = regnType;
	}
	public String getParam() {
		return Param;
	}
	public void setParam(String param) {
		Param = param;
	}
	public String getFilter1() {
		return Filler1;
	}
	public void setFilter1(String filter1) {
		Filler1 = filter1;
	}
	public String getFilter2() {
		return Filler2;
	}
	public void setFilter2(String filter2) {
		Filler2 = filter2;
	}
	@JsonCreator
	public MutualFundsUccCreationRequest(@JsonProperty("UserId") String userId, @JsonProperty("MemberCode") String memberCode,@JsonProperty("Password") String password, @JsonProperty("RegnType") String regnType,@JsonProperty("Params") String param, @JsonProperty("Filler1") String filler1,
			@JsonProperty("Filler2") String filler2) {
		super();
		UserId = userId;
		MemberCode = memberCode;
		Password = password;
		RegnType = regnType;
		Param = param;
		Filler1 = filler1;
		Filler2 = filler2;
	}
	public MutualFundsUccCreationRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UccRequest [UserId=" + UserId + ", MemberCode=" + MemberCode + ", Password=" + Password + ", RegnType="
				+ RegnType + ", Param=" + Param + ", Filler1=" + Filler1 + ", Filler2=" + Filler2 + "]";
	}
	
}
