package com.company.demowebapplication.data;

public class DataTransferObject {
	
	private AutomobileInstantQuotePageDto automobileInstantQuotePageDto;
	private ContactUsPageDto contactUsPageDto;
	private FindAnInsuranceAgentPageDto findAnInsuranceAgentPageDto;
	private LandingPageDto landingPageDto;
	private PurchaseQuotePageDto purchaseQuotePageDto;
	private SiteTopNavigationDto siteTopNavigationDto;
	
	public AutomobileInstantQuotePageDto getAutomobileInstantQuotePageDto() {
		
		// TODO: build a data factory
		
		if (automobileInstantQuotePageDto == null) {
			return new AutomobileInstantQuotePageDto();
		}
		else {
			return automobileInstantQuotePageDto;
		}
	}
	
	public void setAutomobileInstantQuotePageDto(AutomobileInstantQuotePageDto automobileInstantQuotePageDto) {
		this.automobileInstantQuotePageDto = automobileInstantQuotePageDto;
	}
	
	public ContactUsPageDto getContactUsPageDto() {
		
		// TODO: build a data factory
		
		if (contactUsPageDto == null) {
			return new ContactUsPageDto();
		}
		else {
			return contactUsPageDto;
		}
	}
	
	public void setContactUsPageDto(ContactUsPageDto contactUsPageDto) {
		this.contactUsPageDto = contactUsPageDto;
	}
	
	public FindAnInsuranceAgentPageDto getFindAnInsuranceAgentPageDto() {
		
		// TODO: build a data factory
		
		if (findAnInsuranceAgentPageDto == null) {
			return new FindAnInsuranceAgentPageDto();
		}
		else {
			return findAnInsuranceAgentPageDto;
		}
	}
	
	public void setFindAnInsuranceAgentPageDto(FindAnInsuranceAgentPageDto findAnInsuranceAgentPageDto) {
		this.findAnInsuranceAgentPageDto = findAnInsuranceAgentPageDto;
	}
	
	public LandingPageDto getLandingPageDto() {
		
		// TODO: build a data factory
		
		if (landingPageDto == null) {
			return new LandingPageDto();
		}
		else {
			return landingPageDto;
		}
	}
	
	public void setLandingPageDto(LandingPageDto landingPageDto) {
		this.landingPageDto = landingPageDto;
	}
	
	public PurchaseQuotePageDto getPurchaseQuotePageDto() {
		
		// TODO: build a data factory
		
		if (purchaseQuotePageDto == null) {
			return new PurchaseQuotePageDto();
		}
		else {
			return purchaseQuotePageDto;
		}
	}
	
	public void setPurchaseQuotePageDto(PurchaseQuotePageDto purchaseQuotePageDto) {
		this.purchaseQuotePageDto = purchaseQuotePageDto;
	}

	public SiteTopNavigationDto getSiteTopNavigationDto() {
		
		// TODO: build a data factory
		
		if (siteTopNavigationDto == null) {
			return new SiteTopNavigationDto();
		}
		else {
			return siteTopNavigationDto;
		}
		
	}

	public void setSiteTopNavigationDto(SiteTopNavigationDto siteTopNavigationDto) {
		this.siteTopNavigationDto = siteTopNavigationDto;
	}
	
}
