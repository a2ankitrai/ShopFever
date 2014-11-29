package com.shopfever.view.admin.bean;

import org.springframework.web.multipart.MultipartFile;

public class CustomerBean {

	private Integer customerId;
	private String userName;
	private String firstName;
	private String middleName;
	private String lastName;
	private String mobileNo;
	private String emailId;
	private byte[] photograph;  
	
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public byte[] getPhotograph() {
		return photograph;
	}
	public void setPhotograph(byte[] photograph) {
		this.photograph = photograph;
	}
	 

}
