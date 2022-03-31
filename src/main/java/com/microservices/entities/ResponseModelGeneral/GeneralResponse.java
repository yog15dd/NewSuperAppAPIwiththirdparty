/**
 * 
 */
package com.microservices.entities.ResponseModelGeneral;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author 33000005
 *
 */
public class GeneralResponse {

	/**
	 * 
	 */
	public int status;
	public int errorCode;
	public String messageType;
	public String message;
	public GeneralResponse() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param status
	 * @param errorCode
	 * @param messageType
	 * @param message
	 */
	@JsonCreator
	public GeneralResponse(@JsonProperty("Status") int status,@JsonProperty("ErrorCode") int errorCode,@JsonProperty("MessageType") String messageType,@JsonProperty("Message") String message) {
		super();
		this.status = status;
		this.errorCode = errorCode;
		this.messageType = messageType;
		this.message = message;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
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
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
