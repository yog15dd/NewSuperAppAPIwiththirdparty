/**
 * 
 */
package com.microservices.entities.Model.post.onboarding;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author 33000005
 *
 */
public class PanValidationCustomerDetails {

	/**
	 * 
	 */
	private int sourceId;
	private String panNumber;
	private String name;
	private String lastUpdate;
	private String nameOnTheCard;
	private String status;
	private String statusDescription;
	private String gender;
	private String state;
	private String mobile;
	private String age;
	private String tsTransId;
	private String secretToken;
	private String captchaCode;
	private String bankAccountNumber;
	private String ifscCode;
	private String accountHolderName;
	private String bankName;
	private String bankBranchAddress;
	private String dob;
	private String docId;
	private String doi;
	private String fatherName;
	private String isScanned;
	private String minor;
	private String scanType;
	private String streetAddress;
	private String pincode;
	private String verificationResponse;
	public PanValidationCustomerDetails() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param sourceId
	 * @param panNumber
	 * @param name
	 * @param lastUpdate
	 * @param nameOnTheCard
	 * @param status
	 * @param statusDescription
	 * @param gender
	 * @param state
	 * @param mobile
	 * @param age
	 * @param tsTransId
	 * @param secretToken
	 * @param captchaCode
	 * @param bankAccountNumber
	 * @param ifscCode
	 * @param accountHolderName
	 * @param bankName
	 * @param bankBranchAddress
	 * @param dob
	 * @param docId
	 * @param doi
	 * @param fatherName
	 * @param isScanned
	 * @param minor
	 * @param scanType
	 * @param streetAddress
	 * @param pincode
	 * @param verificationResponse
	 */
	@JsonCreator
	public PanValidationCustomerDetails(@JsonProperty("source_id") int sourceId,@JsonProperty("PanNumber") String panNumber,@JsonProperty("Name") String name,@JsonProperty("LastUpdate") String lastUpdate,
		@JsonProperty("NameOnTheCard")	String nameOnTheCard,@JsonProperty("STATUS") String status,@JsonProperty("StatusDescription") String statusDescription,@JsonProperty("Gender") String gender,@JsonProperty("State") String state,@JsonProperty("Mobile") String mobile,
		@JsonProperty("Age")	String age,@JsonProperty("tsTransId") String tsTransId,@JsonProperty("secretToken") String secretToken,@JsonProperty("captchaCode") String captchaCode,@JsonProperty("BankAccountNumber") String bankAccountNumber,
		@JsonProperty("IFSCCode")	String ifscCode,@JsonProperty("AccountHolderName") String accountHolderName,@JsonProperty("BankName") String bankName,@JsonProperty("BankBranchAddress") String bankBranchAddress,@JsonProperty("dob") String dob,
		@JsonProperty("doc_id")	String docId,@JsonProperty("doi") String doi,@JsonProperty("father_name") String fatherName,@JsonProperty("is_scanned") String isScanned,@JsonProperty("minor") String minor,@JsonProperty("scan_type") String scanType,
		@JsonProperty("street_address")	String streetAddress,@JsonProperty("pincode") String pincode,@JsonProperty("verificationResponse") String verificationResponse) {
		super();
		this.sourceId = sourceId;
		this.panNumber = panNumber;
		this.name = name;
		this.lastUpdate = lastUpdate;
		this.nameOnTheCard = nameOnTheCard;
		this.status = status;
		this.statusDescription = statusDescription;
		this.gender = gender;
		this.state = state;
		this.mobile = mobile;
		this.age = age;
		this.tsTransId = tsTransId;
		this.secretToken = secretToken;
		this.captchaCode = captchaCode;
		this.bankAccountNumber = bankAccountNumber;
		this.ifscCode = ifscCode;
		this.accountHolderName = accountHolderName;
		this.bankName = bankName;
		this.bankBranchAddress = bankBranchAddress;
		this.dob = dob;
		this.docId = docId;
		this.doi = doi;
		this.fatherName = fatherName;
		this.isScanned = isScanned;
		this.minor = minor;
		this.scanType = scanType;
		this.streetAddress = streetAddress;
		this.pincode = pincode;
		this.verificationResponse = verificationResponse;
	}
	public int getSourceId() {
		return sourceId;
	}
	public void setSourceId(int sourceId) {
		this.sourceId = sourceId;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public String getNameOnTheCard() {
		return nameOnTheCard;
	}
	public void setNameOnTheCard(String nameOnTheCard) {
		this.nameOnTheCard = nameOnTheCard;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatusDescription() {
		return statusDescription;
	}
	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getTsTransId() {
		return tsTransId;
	}
	public void setTsTransId(String tsTransId) {
		this.tsTransId = tsTransId;
	}
	public String getSecretToken() {
		return secretToken;
	}
	public void setSecretToken(String secretToken) {
		this.secretToken = secretToken;
	}
	public String getCaptchaCode() {
		return captchaCode;
	}
	public void setCaptchaCode(String captchaCode) {
		this.captchaCode = captchaCode;
	}
	public String getBankAccountNumber() {
		return bankAccountNumber;
	}
	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankBranchAddress() {
		return bankBranchAddress;
	}
	public void setBankBranchAddress(String bankBranchAddress) {
		this.bankBranchAddress = bankBranchAddress;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDocId() {
		return docId;
	}
	public void setDocId(String docId) {
		this.docId = docId;
	}
	public String getDoi() {
		return doi;
	}
	public void setDoi(String doi) {
		this.doi = doi;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getIsScanned() {
		return isScanned;
	}
	public void setIsScanned(String isScanned) {
		this.isScanned = isScanned;
	}
	public String getMinor() {
		return minor;
	}
	public void setMinor(String minor) {
		this.minor = minor;
	}
	public String getScanType() {
		return scanType;
	}
	public void setScanType(String scanType) {
		this.scanType = scanType;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getVerificationResponse() {
		return verificationResponse;
	}
	public void setVerificationResponse(String verificationResponse) {
		this.verificationResponse = verificationResponse;
	}
}
