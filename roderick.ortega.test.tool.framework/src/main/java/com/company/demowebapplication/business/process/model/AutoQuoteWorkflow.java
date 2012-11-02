package com.company.demowebapplication.business.process.model;

import com.company.demowebapplication.interfaces.pages.AutomobileInstantQuotePageInterface;
import com.company.demowebapplication.interfaces.pages.LandingPageInterface;
import com.company.demowebapplication.interfaces.workflows.AutoQuoteWorkflowInterface;

public class AutoQuoteWorkflow implements AutoQuoteWorkflowInterface {

	private LandingPageInterface landingPage;
	private AutomobileInstantQuotePageInterface automobileInstantQuotePage;
	
	@Override
	public void login() {
		landingPage.setEmail();
		landingPage.setPassword();
		landingPage.selectService();
	}

	@Override
	public void enterDataToForm() {
		automobileInstantQuotePage.setZipCode();
		automobileInstantQuotePage.setEmail();
	}

	@Override
	public void verifySubmittedData() {
		// TODO Auto-generated method stub
		
	}

	
	
}
