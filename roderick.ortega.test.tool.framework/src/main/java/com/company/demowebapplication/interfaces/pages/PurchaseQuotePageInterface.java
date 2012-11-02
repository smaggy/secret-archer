package com.company.demowebapplication.interfaces.pages;

public interface PurchaseQuotePageInterface extends SiteFooterNavigationInterface, SiteTopNavigationInterface, AbstractSitePageInterface {
	public String getLoggedInUser() throws Exception;
	public void setCreditCardOwner() throws Exception;
	public void setCreditCardNumber() throws Exception;
	public void setExpirationDate() throws Exception;
	public void selectPurchase() throws Exception;
	public boolean congratulationPageExists() throws Exception;
	public void selectViewPurchasedQuotes() throws Exception;
}
