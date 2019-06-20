package com.tandem.model;

public class User {
	
	String mUserId;
	String mUserFirstname;
	String mUserLastname;
	String mUserEmail;
	String mUserCity;
	
	
	public String getUserId() {
		return mUserId;
	}
	
	public void setUserId(String mUserId) {
		this.mUserId = mUserId;
	}
	
	public String getUserFirstname() {
		return mUserFirstname;
	}
	
	public void setUserFirstname(String mUserFirstName) {
		this.mUserFirstname = mUserFirstName;
	}
	
	public String getUserLastname() {
		return mUserLastname;
	}
	
	public void setUserLastname(String mUserLastname) {
		this.mUserLastname = mUserLastname;
	}
	
	public String getUserEmail() {
		return mUserEmail;
	}
	
	public void setUserEmail(String mUserEmail) {
		this.mUserEmail = mUserEmail;
	}
	
	public String getUserCity() {
		return mUserCity;
	}
	
	public void setUserCity(String mUserCity) {
		this.mUserCity = mUserCity;
	}
}
