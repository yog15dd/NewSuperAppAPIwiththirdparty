/**
 * 
 */
package com.microservices.entities.RequestModel.pre.onbaording;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author 33000005
 *
 */
public class SignupLoginCustomerDetails {

	/**
	 * 
	 */
	@NotBlank(message = "source type must have to be provided")
	private String SourceType;
	@NotBlank(message = "Client Id must be provided")
	private String ClientId;
	@NotBlank(message = "Identity should be there")
	private String Identity;
	@NotNull(message = "")
	private String Salutation;
	@NotBlank(message = "First name must be provided")
	private String FirstName;
	private String MiddleName;
	@NotBlank(message = "Last name cannot be null")
	private String LastName;
	@NotBlank(message = "Gender must not be null")
	private String Gender;
	@NotBlank(message = "Date of Birth must be provided")
	private String DateOfBirth;
	@NotBlank(message = "Email Id must be provided")
	private String EmailId;
	@NotBlank(message = "Mobile Number must be provided")
	private String MobileNo;
	@NotBlank(message = "Currency must be provided")
	private String Currency;
	
	private String Language;
	@NotBlank(message = "Address must be provided")
	private String AddressLine1;
	private String AddressLine2;
	private String AddressLine3;
	@NotBlank(message = "Pincode must be provided")
	private String Pincode;
	@NotBlank(message = "City must be provided")
	private String City;
	@NotBlank(message = "State must be provided")
	private String State;
	@NotBlank(message = "Address type must have to be mentioned")
	private String AddressType;
	
	public SignupLoginCustomerDetails() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param sourceType
	 * @param clientId
	 * @param identity
	 * @param salutation
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 * @param gender
	 * @param dateOfBirth
	 * @param emailId
	 * @param mobileNo
	 * @param currency
	 * @param language
	 * @param addressLine1
	 * @param addressLine2
	 * @param addressLine3
	 * @param pincode
	 * @param city
	 * @param state
	 * @param addressType
	 */
	@JsonCreator
	public SignupLoginCustomerDetails(@JsonProperty("SourceType") String sourceType,@JsonProperty("ClientId") String clientId,@JsonProperty("Identity") String identity,@JsonProperty("Salutation") String salutation,@JsonProperty("FirstName") String firstName,
		@JsonProperty("MiddleName")	String middleName,@JsonProperty("LastName") String lastName,@JsonProperty("Gender") String gender,@JsonProperty("DateOfBirth") String dateOfBirth,@JsonProperty("EmailId") String emailId,@JsonProperty("MobileNo") String mobileNo,
		@JsonProperty("Currency")	String currency,@JsonProperty("Language") String language,@JsonProperty("AddressLine1") String addressLine1,@JsonProperty("AddressLine2") String addressLine2,@JsonProperty("AddressLine3") String addressLine3,
		@JsonProperty("Pincode")	String pincode,@JsonProperty("City") String city,@JsonProperty("State") String state,@JsonProperty("AddressType") String addressType) {
		super();
		SourceType = sourceType;
		ClientId = clientId;
		Identity = identity;
		Salutation = salutation;
		FirstName = firstName;
		MiddleName = middleName;
		LastName = lastName;
		Gender = gender;
		DateOfBirth = dateOfBirth;
		EmailId = emailId;
		MobileNo = mobileNo;
		Currency = currency;
		Language = language;
		AddressLine1 = addressLine1;
		AddressLine2 = addressLine2;
		AddressLine3 = addressLine3;
		Pincode = pincode;
		City = city;
		State = state;
		AddressType = addressType;
	}
	public String getSourceType() {
		return SourceType;
	}
	public void setSourceType(String sourceType) {
		SourceType = sourceType;
	}
	public String getClientId() {
		return ClientId;
	}
	public void setClientId(String clientId) {
		ClientId = clientId;
	}
	public String getIdentity() {
		return Identity;
	}
	public void setIdentity(String identity) {
		Identity = identity;
	}
	public String getSalutation() {
		return Salutation;
	}
	public void setSalutation(String salutation) {
		Salutation = salutation;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getMiddleName() {
		return MiddleName;
	}
	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}
	public String getCurrency() {
		return Currency;
	}
	public void setCurrency(String currency) {
		Currency = currency;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	public String getAddressLine1() {
		return AddressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		AddressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return AddressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		AddressLine2 = addressLine2;
	}
	public String getAddressLine3() {
		return AddressLine3;
	}
	public void setAddressLine3(String addressLine3) {
		AddressLine3 = addressLine3;
	}
	public String getPincode() {
		return Pincode;
	}
	public void setPincode(String pincode) {
		Pincode = pincode;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getAddressType() {
		return AddressType;
	}
	public void setAddressType(String addressType) {
		AddressType = addressType;
	}
	@Override
	public String toString() {
		return "CustomerDetails [SourceType=" + SourceType + ", ClientId=" + ClientId + ", Identity=" + Identity
				+ ", Salutation=" + Salutation + ", FirstName=" + FirstName + ", MiddleName=" + MiddleName
				+ ", LastName=" + LastName + ", Gender=" + Gender + ", DateOfBirth=" + DateOfBirth + ", EmailId="
				+ EmailId + ", MobileNo=" + MobileNo + ", Currency=" + Currency + ", Language=" + Language
				+ ", AddressLine1=" + AddressLine1 + ", AddressLine2=" + AddressLine2 + ", AddressLine3=" + AddressLine3
				+ ", Pincode=" + Pincode + ", City=" + City + ", State=" + State + ", AddressType=" + AddressType + "]";
	}
}
