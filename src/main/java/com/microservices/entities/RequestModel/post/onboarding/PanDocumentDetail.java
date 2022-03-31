/**
 * 
 */
package com.microservices.entities.RequestModel.post.onboarding;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author 33000005
 *
 */
public class PanDocumentDetail {

	/**
	 * 
	 */
	@NotBlank(message = "PAN Document Number cannot be blank")
	@Pattern(regexp = "^[A-Z]{5}[0-9]{4}[A-Z]{1}", message = "Please enter the PAN document number in correct format")
	private String docNumber;
	public PanDocumentDetail() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param docNumber
	 */
	@JsonCreator
	public PanDocumentDetail(@JsonProperty("docNumber") String docNumber) {
		super();
		this.docNumber = docNumber;
	}
	public String getDocNumber() {
		return docNumber;
	}
	public void setDocNumber(String docNumber) {
		this.docNumber = docNumber;
	}
	@Override
	public String toString() {
		return "PanDocumentDetail [docNumber=" + docNumber + "]";
	}
}
