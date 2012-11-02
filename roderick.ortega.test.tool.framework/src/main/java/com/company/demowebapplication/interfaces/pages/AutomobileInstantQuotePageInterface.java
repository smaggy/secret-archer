package com.company.demowebapplication.interfaces.pages;

public interface AutomobileInstantQuotePageInterface extends AbstractSitePageInterface, SiteTopNavigationInterface, SiteFooterNavigationInterface {
	public void setZipCode();
	public void setEmail();
	public void selectCarType();
	public void selectTruckType();
	public void selectNext();
	public void setAge();
	public void selectMaleGender();
	public void selectFemaleGender();
	public void selectExcellentRecord();
	public void selectGoodRecord();
	public void selectFairRecord();
	public void selectPoorRecord();
	public void setYear();
	public void selectMake();
	public void selectModel();
	public void selectOwnFinancialInfo();
	public void selectFinancedFinancialInfo();
	public void selectLeaseFinancialInfo();
	public String getDisplayedZipCode();
	public String getDisplayedAge();
	public String getDisplayedGender();
	public String getDisplayedDrivingRecord();
	public String getDisplayedAutomobileType();
	public String getDisplayedYear();
	public String getDisplayedMake();
	public String getDisplayedModel();
	public String getDisplayedFinancialInfo();
	public String getInstantQuote();
	public void selectNewQuote();
	public void selectPurchaseQuote();
}
