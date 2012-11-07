package com.company.demowebapplication.pages;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

import com.company.common.interfaces.factory.AbstractGuiWebFactoryInterface;
import com.company.common.interfaces.process.DataLoadableInterface;
import com.company.common.interfaces.process.FrameableInterface;
import com.company.common.interfaces.type.AbstractWebElementInterface;
import com.company.common.types.FrameParameters;
import com.company.common.types.Locator;
import com.company.demowebapplication.enums.AutomobileTypeEnum;
import com.company.demowebapplication.enums.DrivingRecordTypeEnum;
import com.company.demowebapplication.enums.FinancialInfoTypeEnum;
import com.company.demowebapplication.enums.GenderTypeEnum;
import com.company.demowebapplication.interfaces.pages.AutomobileInstantQuotePageInterface;
import com.company.demowebapplication.interfaces.pages.SiteFooterNavigationInterface;
import com.company.demowebapplication.interfaces.pages.SiteTopNavigationInterface;

public class AutomobileInstantQuotePage extends AbstractSiteInteriorPage implements AutomobileInstantQuotePageInterface, FrameableInterface, DataLoadableInterface, SiteFooterNavigationInterface, SiteTopNavigationInterface {

	final static Logger logger = LoggerFactory.getLogger(AutomobileInstantQuotePage.class);
	
	public AutomobileInstantQuotePage(File frameFile, AbstractGuiWebFactoryInterface webFactory) throws ParserConfigurationException, SAXException, IOException {
		super(frameFile, webFactory);
	}

	@Override
	public void setZipCode(String zipCode) throws Exception {
		logger.info("ACTION: setZipCode: [" + zipCode + "]");
		if (zipCode != null) {
			getWebFactory().createWebTextField(getLocator(new FrameParameters("AutomobileInstantQuotePage","ZipCode"))).setText(zipCode);
		}
		else {
			getWebFactory().createWebTextField(getLocator(new FrameParameters("AutomobileInstantQuotePage","ZipCode"))).setText(getDto().getAutomobileInstantQuotePageDto().getZipCode());
		}
	}

	@Override
	public void setEmail(String email) throws Exception {
		logger.info("ACTION: setEmail: [" + email + "]");
		if (email != null) {
			getWebFactory().createWebTextField(getLocator(new FrameParameters("AutomobileInstantQuotePage","Email"))).setText(email);
		}
		else {
			getWebFactory().createWebTextField(getLocator(new FrameParameters("AutomobileInstantQuotePage","Email"))).setText(getDto().getAutomobileInstantQuotePageDto().getEmail());
		}
	}

	@Override
	public void selectAutomobileType(AutomobileTypeEnum automobileType) throws Exception {
		logger.info("ACTION: selectAutomobileType: [" + automobileType + "]");
		
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
		logger.info("ACTION: selectNext");
		getWebFactory().createWebButton(getLocator(new FrameParameters("AutomobileInstantQuotePage","NextButton"))).select();
	}

	@Override
	public void setAge(String age) throws Exception {
		logger.info("ACTION: setAge: [" + age + "]");
		if (age != null) {
			getWebFactory().createWebTextField(getLocator(new FrameParameters("AutomobileInstantQuotePage","Age"))).setText(age);
		}
		else {
			getWebFactory().createWebTextField(getLocator(new FrameParameters("AutomobileInstantQuotePage","Age"))).setText(getDto().getAutomobileInstantQuotePageDto().getAge());
		}
	}

	@Override
	public void selectGender(GenderTypeEnum genderType) throws Exception {
		logger.info("ACTION: selectGender: [" + genderType + "]");
		
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
		logger.info("ACTION: selectDrivingRecord: [" + drivingRecordType + "]");
		
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
		logger.info("ACTION: setYear: [" + year + "]");
		if (year != null) {
			getWebFactory().createWebTextField(getLocator(new FrameParameters("AutomobileInstantQuotePage","Year"))).setText(year);
		}
		else {
			getWebFactory().createWebTextField(getLocator(new FrameParameters("AutomobileInstantQuotePage","Year"))).setText(getDto().getAutomobileInstantQuotePageDto().getYear());
		}
	}

	@Override
	public void selectMake(String make) throws Exception {
		logger.info("ACTION: model: [" + make + "]");
		
		getWebFactory().createWebElement(getLocator(new FrameParameters("AutomobileInstantQuotePage", "MakeArrowDown"))).click();
		// needed a sleep because going faster than list could load
		Thread.sleep(1000);
		
		String expandedMakeLocator = getLocator(new FrameParameters("AutomobileInstantQuotePage", "MakeDivWrapper")).getXPathLocator() + "/DIV";
		List<AbstractWebElementInterface> makeElements = getWebFactory().getWebBrowser().findAllWebElements(new Locator(expandedMakeLocator));
		
		if (make != null) {
			for (AbstractWebElementInterface makeElement : makeElements) {
				if (makeElement.getText().contains(make)) {
					makeElement.click();
					break;
				}
			}
		}
		else {
			for (AbstractWebElementInterface makeElement : makeElements) {
				if (makeElement.getText().contains(getDto().getAutomobileInstantQuotePageDto().getMake())) {
					makeElement.click();
					break;
				}
			}
		}
	}

	@Override
	public void selectModel(String model) throws Exception {
		logger.info("ACTION: selectModel: [" + model + "]");
		
		getWebFactory().createWebElement(getLocator(new FrameParameters("AutomobileInstantQuotePage", "ModelArrowDown"))).click();
		// needed a sleep because going faster than list could load
		Thread.sleep(1000);
		
		String expandedModelLocator = getLocator(new FrameParameters("AutomobileInstantQuotePage", "ModelDivWrapper")).getXPathLocator() + "/DIV";
		List<AbstractWebElementInterface> modelElements = getWebFactory().getWebBrowser().findAllWebElements(new Locator(expandedModelLocator));
		
		if (model != null) {
			for (AbstractWebElementInterface modelElement : modelElements) {
				if (modelElement.getText().contains(model)) {
					modelElement.click();
					break;
				}
			}
		}
		else {
			for (AbstractWebElementInterface modelElement : modelElements) {
				if (modelElement.getText().contains(getDto().getAutomobileInstantQuotePageDto().getModel())) {
					modelElement.click();
					break;
				}
			}
		}
	}

	@Override
	public void selectFinancialInfo(FinancialInfoTypeEnum financialInfoType) throws Exception {
		logger.info("ACTION: selectFinancialInfo: [" + financialInfoType + "]");
		
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
		logger.info("ACTION: getDisplayedZipCode");
		String pageText = getWebFactory().createWebElement(getLocator(new FrameParameters("AutomobileInstantQuotePage","ResultZipCode"))).getText();
		String[] pageTextTokens = pageText.split("Zip Code:");
		return pageTextTokens[1].trim();
	}

	@Override
	public String getDisplayedAge() throws Exception {
		logger.info("ACTION: getDisplayedAge");
		String pageText = getWebFactory().createWebElement(getLocator(new FrameParameters("AutomobileInstantQuotePage","ResultAge"))).getText();
		String[] pageTextTokens = pageText.split("Age:");
		return pageTextTokens[1].trim();
	}

	@Override
	public String getDisplayedGender() throws Exception {
		logger.info("ACTION: getDisplayedGender");
		String pageText = getWebFactory().createWebElement(getLocator(new FrameParameters("AutomobileInstantQuotePage","ResultGender"))).getText();
		String[] pageTextTokens = pageText.split("Gender:");
		return pageTextTokens[1].trim();
	}

	@Override
	public String getDisplayedDrivingRecord() throws Exception {
		logger.info("ACTION: getDisplayedDrivingRecord");
		String pageText = getWebFactory().createWebElement(getLocator(new FrameParameters("AutomobileInstantQuotePage","ResultDrivingRecord"))).getText();
		String[] pageTextTokens = pageText.split("Driving Record:");
		return pageTextTokens[1].trim();
	}

	@Override
	public String getDisplayedAutomobileType() throws Exception {
		logger.info("ACTION: getDisplayedAutomobileType");
		String pageText = getWebFactory().createWebElement(getLocator(new FrameParameters("AutomobileInstantQuotePage","ResultAutomobileType"))).getText();
		String[] pageTextTokens = pageText.split("Automobile Type:");
		return pageTextTokens[1].trim();
	}

	@Override
	public String getDisplayedYear() throws Exception {
		logger.info("ACTION: getDisplayedYear");
		String pageText = getWebFactory().createWebElement(getLocator(new FrameParameters("AutomobileInstantQuotePage","ResultAutomobileYear"))).getText();
		String[] pageTextTokens = pageText.split("Year:");
		return pageTextTokens[1].trim();
	}

	@Override
	public String getDisplayedMake() throws Exception {
		logger.info("ACTION: getDisplayedMake");
		String pageText = getWebFactory().createWebElement(getLocator(new FrameParameters("AutomobileInstantQuotePage","ResultAutomobileMake"))).getText();
		String[] pageTextTokens = pageText.split("Make:");
		return pageTextTokens[1].trim();
	}

	@Override
	public String getDisplayedModel() throws Exception {
		logger.info("ACTION: getDisplayedModel");
		String pageText = getWebFactory().createWebElement(getLocator(new FrameParameters("AutomobileInstantQuotePage","ResultAutomobileModel"))).getText();
		String[] pageTextTokens = pageText.split("Model:");
		return pageTextTokens[1].trim();
	}

	@Override
	public String getDisplayedFinancialInfo() throws Exception {
		logger.info("ACTION: getDisplayedFinancialInfo");
		String pageText = getWebFactory().createWebElement(getLocator(new FrameParameters("AutomobileInstantQuotePage","ResultFinancialInfo"))).getText();
		String[] pageTextTokens1 = pageText.split("You currently ");
		String[] pageTextTokens2 = pageTextTokens1[1].split(" this vehicle.");
		return pageTextTokens2[0].trim();
	}

	@Override
	public String getInstantQuote() throws Exception {
		logger.info("ACTION: getInstantQuote");
		return getWebFactory().createWebElement(getLocator(new FrameParameters("AutomobileInstantQuotePage","ResultInstantQuote"))).getText();
	}

	@Override
	public void selectNewQuote() throws Exception {
		logger.info("ACTION: selectNewQuote");
		getWebFactory().createWebButton(getLocator(new FrameParameters("AutomobileInstantQuotePage","NewQuoteButton"))).select();
	}

	@Override
	public void selectPurchaseQuote() throws Exception {
		logger.info("ACTION: selectPurchaseQuote");
		getWebFactory().createWebButton(getLocator(new FrameParameters("AutomobileInstantQuotePage","PurchaseButton"))).select();
	}

}
