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
			automobileInstantQuotePageDto = new AutomobileInstantQuotePageDto();
		}
		return automobileInstantQuotePageDto;
	}
	
	public void setAutomobileInstantQuotePageDto(AutomobileInstantQuotePageDto automobileInstantQuotePageDto) {
		this.automobileInstantQuotePageDto = automobileInstantQuotePageDto;
	}
	
	public ContactUsPageDto getContactUsPageDto() {
		
		// TODO: build a data factory
		
		if (contactUsPageDto == null) {
			contactUsPageDto = new ContactUsPageDto(); 
		}
		return contactUsPageDto;
	}
	
	public void setContactUsPageDto(ContactUsPageDto contactUsPageDto) {
		this.contactUsPageDto = contactUsPageDto;
	}
	
	public FindAnInsuranceAgentPageDto getFindAnInsuranceAgentPageDto() {
		
		// TODO: build a data factory
		
		if (findAnInsuranceAgentPageDto == null) {
			findAnInsuranceAgentPageDto = new FindAnInsuranceAgentPageDto();
		}
		return findAnInsuranceAgentPageDto;
	}
	
	public void setFindAnInsuranceAgentPageDto(FindAnInsuranceAgentPageDto findAnInsuranceAgentPageDto) {
		this.findAnInsuranceAgentPageDto = findAnInsuranceAgentPageDto;
	}
	
	public LandingPageDto getLandingPageDto() {
		
		// TODO: build a data factory
		
		if (landingPageDto == null) {
			landingPageDto = new LandingPageDto();
		}
		return landingPageDto;
	}
	
	public void setLandingPageDto(LandingPageDto landingPageDto) {
		this.landingPageDto = landingPageDto;
	}
	
	public PurchaseQuotePageDto getPurchaseQuotePageDto() {
		
		// TODO: build a data factory
		
		if (purchaseQuotePageDto == null) {
			purchaseQuotePageDto = new PurchaseQuotePageDto();
		}
		return purchaseQuotePageDto;
	}
	
	public void setPurchaseQuotePageDto(PurchaseQuotePageDto purchaseQuotePageDto) {
		this.purchaseQuotePageDto = purchaseQuotePageDto;
	}

	public SiteTopNavigationDto getSiteTopNavigationDto() {
		
		// TODO: build a data factory
		
		if (siteTopNavigationDto == null) {
			siteTopNavigationDto = new SiteTopNavigationDto();
		}
		return siteTopNavigationDto;
	}

	public void setSiteTopNavigationDto(SiteTopNavigationDto siteTopNavigationDto) {
		this.siteTopNavigationDto = siteTopNavigationDto;
	}
	
}
