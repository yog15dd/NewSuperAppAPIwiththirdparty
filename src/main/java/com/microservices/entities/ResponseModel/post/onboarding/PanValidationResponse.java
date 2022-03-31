/**
 * 
 */
package com.microservices.entities.ResponseModel.post.onboarding;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microservices.entities.Model.post.onboarding.PanValidationCustomerDetails;

/**
 * @author 33000005
 *
 */
public class PanValidationResponse {

	/**
	 * 
	 */
	private int status;
	private PanValidationCustomerDetails msgCustomerDetails;
	private int errorCode;
	private String messageType;
	private String tstransId;
	private String message;
	private String xml;
	public PanValidationResponse() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param status
	 * @param msgCustomerDetails
	 * @param errorCode
	 * @param messageType
	 * @param tstransId
	 * @param message
	 * @param xml
	 */
	@JsonCreator
	public PanValidationResponse(@JsonProperty("Status") int status,@JsonProperty("msg") PanValidationCustomerDetails msgCustomerDetails,@JsonProperty("ErrorCode") int errorCode,
		@JsonProperty("MessageType")	String messageType,@JsonProperty("tsTransId") String tstransId,@JsonProperty("Message") String message,@JsonProperty("xml") String xml) {
		super();
		this.status = status;
		this.msgCustomerDetails = msgCustomerDetails;
		this.errorCode = errorCode;
		this.messageType = messageType;
		this.tstransId = tstransId;
		this.message = message;
		this.xml = xml;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public PanValidationCustomerDetails getMsgCustomerDetails() {
		return msgCustomerDetails;
	}
	public void setMsgCustomerDetails(PanValidationCustomerDetails msgCustomerDetails) {
		this.msgCustomerDetails = msgCustomerDetails;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	public String getTstransId() {
		return tstransId;
	}
	public void setTstransId(String tstransId) {
		this.tstransId = tstransId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getXml() {
		return xml;
	}
	public void setXml(String xml) {
		this.xml = xml;
	}

}
