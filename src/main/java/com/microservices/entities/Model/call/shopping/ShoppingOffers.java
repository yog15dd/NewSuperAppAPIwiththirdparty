/**
 * 
 */
package com.microservices.entities.Model.call.shopping;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author 33000005
 *
 */
@Entity(name = "offer")
@Table
@SqlResultSetMapping(name = "ShoppingOffers", classes = @ConstructorResult(targetClass = ShoppingOffers.class, 
                    columns = {@ColumnResult(name = "OfferingGuId", type = String.class), 
                    		@ColumnResult(name = "Offering", type = String.class)}))
public class ShoppingOffers {

	/**
	 * 
	 */
	@Id
	private String OfferingGUId;
	private String Offering;
	public ShoppingOffers() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param offeringGUId
	 * @param offering
	 */
	@JsonCreator
	public ShoppingOffers(@JsonProperty("OfferingGuId") String offeringGUId,@JsonProperty("Offering") String offering) {
		super();
		OfferingGUId = offeringGUId;
		Offering = offering;
	}
	public String getOfferingGUId() {
		return OfferingGUId;
	}
	public void setOfferingGUId(String offeringGUId) {
		OfferingGUId = offeringGUId;
	}
	public String getOffering() {
		return Offering;
	}
	public void setOffering(String offering) {
		Offering = offering;
	}
	
}
