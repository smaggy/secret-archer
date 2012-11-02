package com.company.demowebapplication.data;

public class PurchaseQuotePageDto {
	
	private String loggedInUser;
	private String creditCardOwner;
	private String creditCardNumber;
	private String expirationDate;
	
	public String getLoggedInUser() {
		return loggedInUser;
	}
	public void setLoggedInUser(String loggedInUser) {
		this.loggedInUser = loggedInUser;
	}
	public String getCreditCardOwner() {
		return creditCardOwner;
	}
	public void setCreditCardOwner(String creditCardOwner) {
		this.creditCardOwner = creditCardOwner;
	}
	public String getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	
}
