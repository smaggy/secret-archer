package com.company.demowebapplication.interfaces.pages;

public interface PurchaseQuotePageInterface extends SiteFooterNavigationInterface, SiteTopNavigationInterface, AbstractSitePageInterface {
	public String getLoggedInUser();
	public void setCreditCardOwner();
	public void setCreditCardNumber();
	public void setExpirationDate();
	public void selectPurchase();
	public boolean congratulationPageExists();
	public void selectViewPurchasedQuotes();
}
