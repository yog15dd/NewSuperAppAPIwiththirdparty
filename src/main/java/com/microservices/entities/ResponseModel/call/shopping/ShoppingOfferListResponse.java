package com.microservices.entities.ResponseModel.call.shopping;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microservices.entities.Model.call.shopping.ShoppingOffers;
import com.microservices.entities.ResponseModelGeneral.GeneralResponse;

public class ShoppingOfferListResponse extends GeneralResponse {

//	private int Status;
//	private int ErrorCode;
//	private String MessageType;
//	private String Message;
	private List<ShoppingOffers> OfferList;

	public ShoppingOfferListResponse() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param status
	 * @param errorCode
	 * @param messageType
	 * @param message
	 * @param offerList
	 */
	@JsonCreator
	public ShoppingOfferListResponse(@JsonProperty("Status") int status,@JsonProperty("ErrorCode") int errorCode,@JsonProperty("MessageType") String messageType,@JsonProperty("Message") String message,@JsonProperty("OfferList") List<ShoppingOffers> offerList) {
		super(status, errorCode, messageType, message);
		OfferList = offerList;
	}

	public List<ShoppingOffers> getOfferList() {
		return OfferList;
	}

	public void setOfferList(List<ShoppingOffers> offerList) {
		OfferList = offerList;
	}
	@Override
	public String toString() {
		return "OfferListResponse [OfferList=" + OfferList + ", status=" + status + ", errorCode=" + errorCode
				+ ", messageType=" + messageType + ", message=" + message + "]";
	}
}
