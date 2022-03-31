package com.microservices.entities.ResponseModel.post.onboarding;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MutualFundsUccResponse {

	private String Status;
	private String Remarks;
	private String Filler1;
	private String Filler2;
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getRemarks() {
		return Remarks;
	}
	public void setRemarks(String remarks) {
		Remarks = remarks;
	}
	public String getFiller1() {
		return Filler1;
	}
	public void setFiller1(String filler1) {
		Filler1 = filler1;
	}
	public String getFiller2() {
		return Filler2;
	}
	public void setFiller2(String filler2) {
		Filler2 = filler2;
	}
	@JsonCreator
	public MutualFundsUccResponse(@JsonProperty("Status") String status, @JsonProperty("Remarks") String remarks, @JsonProperty("Filler1") String filler1,@JsonProperty("Filler2")  String filler2) {
		super();
		Status = status;
		Remarks = remarks;
		Filler1 = filler1;
		Filler2 = filler2;
	}
	public MutualFundsUccResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UccResponse [Status=" + Status + ", Remarks=" + Remarks + ", Filler1=" + Filler1 + ", Filler2="
				+ Filler2 + "]";
		
//		@Override
//		public String toString() {
//			return  Status + "|" + Remarks + "|" + Filler1 + "|"
//					+ Filler2;
	}
	
}
