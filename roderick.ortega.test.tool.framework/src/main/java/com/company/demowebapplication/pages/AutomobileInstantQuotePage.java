package com.company.demowebapplication.pages;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.company.common.interfaces.factory.AbstractGuiWebFactoryInterface;
import com.company.common.interfaces.process.DataLoadableInterface;
import com.company.common.interfaces.process.FrameableInterface;
import com.company.common.types.FrameParameters;
import com.company.demowebapplication.enums.AutomobileTypeEnum;
import com.company.demowebapplication.enums.DrivingRecordTypeEnum;
import com.company.demowebapplication.enums.FinancialInfoTypeEnum;
import com.company.demowebapplication.enums.GenderTypeEnum;
import com.company.demowebapplication.interfaces.pages.AutomobileInstantQuotePageInterface;
import com.company.demowebapplication.interfaces.pages.SiteFooterNavigationInterface;
import com.company.demowebapplication.interfaces.pages.SiteTopNavigationInterface;

public class AutomobileInstantQuotePage extends AbstractSiteInteriorPage implements AutomobileInstantQuotePageInterface, FrameableInterface, DataLoadableInterface, SiteFooterNavigationInterface, SiteTopNavigationInterface {

	public AutomobileInstantQuotePage(File frameFile, AbstractGuiWebFactoryInterface webFactory) throws ParserConfigurationException, SAXException, IOException {
		super(frameFile, webFactory);
	}

	@Override
	public void setZipCode(String zipCode) throws Exception {
		if (zipCode != null) {
			getWebFactory().createWebTextField(getLocator(new FrameParameters("AutomobileInstantQuotePage","ZipCode"))).setText(zipCode);
		}
		else {
			getWebFactory().createWebTextField(getLocator(new FrameParameters("AutomobileInstantQuotePage","ZipCode"))).setText(getDto().getAutomobileInstantQuotePageDto().getZipCode());
		}
	}

	@Override
	public void setEmail(String email) throws Exception {
		if (email != null) {
			getWebFactory().createWebTextField(getLocator(new FrameParameters("AutomobileInstantQuotePage","Email"))).setText(email);
		}
		else {
			getWebFactory().createWebTextField(getLocator(new FrameParameters("AutomobileInstantQuotePage","Email"))).setText(getDto().getAutomobileInstantQuotePageDto().getEmail());
		}
	}

	@Override
	public void selectAutomobileType(AutomobileTypeEnum automobileType) throws Exception {
		
		AutomobileTypeEnum switcher = null;
		
		if (automobileType != null) {
			switcher = automobileType;
		}
		else {
			if (getDto().getAutomobileInstantQuotePageDto().getAutomobileType().equalsIgnoreCase("CAR")) {
				switcher = AutomobileTypeEnum.CAR;
			}
			else if (getDto().getAutomobileInstantQuotePageDto().getAutomobileType().equalsIgnoreCase("TRUCK")) {
				switcher = AutomobileTypeEnum.TRUCK;
			}
		}
		
		switch (switcher) {
		
		case CAR:
			getWebFactory().createWebRadioButton(getLocator(new FrameParameters("AutomobileInstantQuotePage","AutomobileTypeCar"))).select();
			break;
			
		case TRUCK:
			getWebFactory().createWebRadioButton(getLocator(new FrameParameters("AutomobileInstantQuotePage","AutomobileTypeTruck"))).select();
			break;
			
		default:
			break;
			
		}
		
	}

	@Override
	public void selectNext() throws Exception {
		getWebFactory().createWebButton(getLocator(new FrameParameters("AutomobileInstantQuotePage","NextButton"))).select();
	}

	@Override
	public void setAge(String age) throws Exception {
		if (age != null) {
			getWebFactory().createWebTextField(getLocator(new FrameParameters("AutomobileInstantQuotePage","Age"))).setText(age);
		}
		else {
			getWebFactory().createWebTextField(getLocator(new FrameParameters("AutomobileInstantQuotePage","Age"))).setText(getDto().getAutomobileInstantQuotePageDto().getAge());
		}
	}

	@Override
	public void selectGender(GenderTypeEnum genderType) throws Exception {
		
		GenderTypeEnum switcher = null;
		
		if (genderType != null) {
			switcher = genderType;
		}
		else {
			if (getDto().getAutomobileInstantQuotePageDto().getGender().equalsIgnoreCase("MALE")) {
				switcher = GenderTypeEnum.MALE;
			}
			else if (getDto().getAutomobileInstantQuotePageDto().getGender().equalsIgnoreCase("FEMALE")) {
				switcher = GenderTypeEnum.FEMALE;
			}
		}
		
		switch (switcher) {
		
		case MALE:
			getWebFactory().createWebRadioButton(getLocator(new FrameParameters("AutomobileInstantQuotePage","GenderMale"))).select();
			break;
			
		case FEMALE:
			getWebFactory().createWebRadioButton(getLocator(new FrameParameters("AutomobileInstantQuotePage","GenderFemale"))).select();
			break;
			
		default:
			break;
			
		}
		
	}

	@Override
	public void selectDrivingRecord(DrivingRecordTypeEnum drivingRecordType) throws Exception {
		
		DrivingRecordTypeEnum switcher = null;
		
		if (drivingRecordType != null) {
			switcher = drivingRecordType;
		}
		else {
			if (getDto().getAutomobileInstantQuotePageDto().getDrivingRecord().equalsIgnoreCase("EXCELLENT")) {
				switcher = DrivingRecordTypeEnum.EXCELLENT;
			}
			else if (getDto().getAutomobileInstantQuotePageDto().getDrivingRecord().equalsIgnoreCase("GOOD")) {
				switcher = DrivingRecordTypeEnum.GOOD;
			}
			else if (getDto().getAutomobileInstantQuotePageDto().getDrivingRecord().equalsIgnoreCase("FAIR")) {
				switcher = DrivingRecordTypeEnum.FAIR;
			}
			else if (getDto().getAutomobileInstantQuotePageDto().getDrivingRecord().equalsIgnoreCase("POOR")) {
				switcher = DrivingRecordTypeEnum.POOR;
			}
		}
		
		switch (switcher) {
		
		case EXCELLENT:
			getWebFactory().createWebRadioButton(getLocator(new FrameParameters("AutomobileInstantQuotePage","DrivingRecordExcellent"))).select();
			break;
			
		case GOOD:
			getWebFactory().createWebRadioButton(getLocator(new FrameParameters("AutomobileInstantQuotePage","DrivingRecordGood"))).select();
			break;
			
		case FAIR:
			getWebFactory().createWebRadioButton(getLocator(new FrameParameters("AutomobileInstantQuotePage","DrivingRecordFair"))).select();
			break;
			
		case POOR:
			getWebFactory().createWebRadioButton(getLocator(new FrameParameters("AutomobileInstantQuotePage","DrivingRecordPoor"))).select();
			break;
			
		default:
			break;
			
		}
		
	}

	@Override
	public void setYear(String year) throws Exception {
		if (year != null) {
			getWebFactory().createWebTextField(getLocator(new FrameParameters("AutomobileInstantQuotePage","Year"))).setText(year);
		}
		else {
			getWebFactory().createWebTextField(getLocator(new FrameParameters("AutomobileInstantQuotePage","Year"))).setText(getDto().getAutomobileInstantQuotePageDto().getYear());
		}
	}

	@Override
	public void selectMake(String make) throws Exception {
		if (make != null) {
			getWebFactory().createWebListBox(getLocator(new FrameParameters("AutomobileInstantQuotePage","Make"))).select(make);
		}
		else {
			getWebFactory().createWebListBox(getLocator(new FrameParameters("AutomobileInstantQuotePage","Make"))).select(getDto().getAutomobileInstantQuotePageDto().getMake());
		}
	}

	@Override
	public void selectModel(String model) throws Exception {
		if (model != null) {
			getWebFactory().createWebListBox(getLocator(new FrameParameters("AutomobileInstantQuotePage","Model"))).select(model);
		}
		else {
			getWebFactory().createWebListBox(getLocator(new FrameParameters("AutomobileInstantQuotePage","Model"))).select(getDto().getAutomobileInstantQuotePageDto().getModel());
		}
	}

	@Override
	public void selectFinancialInfo(FinancialInfoTypeEnum financialInfoType) throws Exception {
		
		FinancialInfoTypeEnum switcher = null;
		
		if (financialInfoType != null) {
			switcher = financialInfoType;
		}
		else {
			if (getDto().getAutomobileInstantQuotePageDto().getDrivingRecord().equalsIgnoreCase("OWN")) {
				switcher = FinancialInfoTypeEnum.OWN;
			}
			else if (getDto().getAutomobileInstantQuotePageDto().getDrivingRecord().equalsIgnoreCase("FINANCED")) {
				switcher = FinancialInfoTypeEnum.FINANCED;
			}
			else if (getDto().getAutomobileInstantQuotePageDto().getDrivingRecord().equalsIgnoreCase("LEASE")) {
				switcher = FinancialInfoTypeEnum.LEASE;
			}
		}
		
		switch (switcher) {
		
		case OWN:
			getWebFactory().createWebRadioButton(getLocator(new FrameParameters("AutomobileInstantQuotePage","FinancialInfoOwn"))).select();
			break;
			
		case FINANCED:
			getWebFactory().createWebRadioButton(getLocator(new FrameParameters("AutomobileInstantQuotePage","FinancialInfoFinance"))).select();
			break;
			
		case LEASE:
			getWebFactory().createWebRadioButton(getLocator(new FrameParameters("AutomobileInstantQuotePage","FinancialInfoLease"))).select();
			break;
			
		default:
			break;
			
		}
		
	}

	@Override
	public String getDisplayedZipCode() throws Exception {
		return getWebFactory().createWebElement(getLocator(new FrameParameters("AutomobileInstantQuotePage","ResultZipCode"))).getText();
	}

	@Override
	public String getDisplayedAge() throws Exception {
		return getWebFactory().createWebElement(getLocator(new FrameParameters("AutomobileInstantQuotePage","ResultAge"))).getText();
	}

	@Override
	public String getDisplayedGender() throws Exception {
		return getWebFactory().createWebElement(getLocator(new FrameParameters("AutomobileInstantQuotePage","ResultGender"))).getText();
	}

	@Override
	public String getDisplayedDrivingRecord() throws Exception {
		return getWebFactory().createWebElement(getLocator(new FrameParameters("AutomobileInstantQuotePage","ResultDrivingRecord"))).getText();
	}

	@Override
	public String getDisplayedAutomobileType() throws Exception {
		return getWebFactory().createWebElement(getLocator(new FrameParameters("AutomobileInstantQuotePage","ResultAutomobileType"))).getText();
	}

	@Override
	public String getDisplayedYear() throws Exception {
		return getWebFactory().createWebElement(getLocator(new FrameParameters("AutomobileInstantQuotePage","ResultAutomobileYear"))).getText();
	}

	@Override
	public String getDisplayedMake() throws Exception {
		return getWebFactory().createWebElement(getLocator(new FrameParameters("AutomobileInstantQuotePage","ResultAutomobileMake"))).getText();
	}

	@Override
	public String getDisplayedModel() throws Exception {
		return getWebFactory().createWebElement(getLocator(new FrameParameters("AutomobileInstantQuotePage","ResultAutomobileModel"))).getText();
	}

	@Override
	public String getDisplayedFinancialInfo() throws Exception {
		return getWebFactory().createWebElement(getLocator(new FrameParameters("AutomobileInstantQuotePage","ResultFinancialInfo"))).getText();
	}

	@Override
	public String getInstantQuote() throws Exception {
		return getWebFactory().createWebElement(getLocator(new FrameParameters("AutomobileInstantQuotePage","ResultInstantQuote"))).getText();
	}

	@Override
	public void selectNewQuote() throws Exception {
		getWebFactory().createWebButton(getLocator(new FrameParameters("AutomobileInstantQuotePage","NewQuoteButton"))).select();
	}

	@Override
	public void selectPurchaseQuote() throws Exception {
		getWebFactory().createWebButton(getLocator(new FrameParameters("AutomobileInstantQuotePage","PurchaseButton"))).select();
	}

}
