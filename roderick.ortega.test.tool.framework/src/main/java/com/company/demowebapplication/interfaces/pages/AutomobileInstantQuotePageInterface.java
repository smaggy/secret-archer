package com.company.demowebapplication.interfaces.pages;

import com.company.demowebapplication.enums.AutomobileTypeEnum;
import com.company.demowebapplication.enums.DrivingRecordTypeEnum;
import com.company.demowebapplication.enums.FinancialInfoTypeEnum;
import com.company.demowebapplication.enums.GenderTypeEnum;

public interface AutomobileInstantQuotePageInterface extends AbstractSitePageInterface, SiteTopNavigationInterface, SiteFooterNavigationInterface {
	public void setZipCode(String zipCode) throws Exception;
	public void setEmail(String email) throws Exception;
	public void selectAutomobileType(AutomobileTypeEnum automobileType) throws Exception;
	public void selectNext() throws Exception;
	public void setAge(String age) throws Exception;
	public void selectGender(GenderTypeEnum genderType) throws Exception;
	public void selectDrivingRecord(DrivingRecordTypeEnum drivingRecordType) throws Exception;
	public void setYear(String year) throws Exception;
	public void selectMake(String make) throws Exception;
	public void selectModel(String model) throws Exception;
	public void selectFinancialInfo(FinancialInfoTypeEnum financialInfoType) throws Exception;
	public String getDisplayedZipCode() throws Exception;
	public String getDisplayedAge() throws Exception;
	public String getDisplayedGender() throws Exception;
	public String getDisplayedDrivingRecord() throws Exception;
	public String getDisplayedAutomobileType() throws Exception;
	public String getDisplayedYear() throws Exception;
	public String getDisplayedMake() throws Exception;
	public String getDisplayedModel() throws Exception;
	public String getDisplayedFinancialInfo() throws Exception;
	public String getInstantQuote() throws Exception;
	public void selectNewQuote() throws Exception;
	public void selectPurchaseQuote() throws Exception;
}
