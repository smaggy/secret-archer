package com.company.demowebapplication.interfaces.workflows;

import com.company.demowebapplication.data.AutomobileInstantQuotePageDto;
import com.company.demowebapplication.data.LandingPageDto;

public interface AutoQuoteWorkflowInterface extends AbstractSiteWorkflowInterface {
	public void login(LandingPageDto lpDto) throws Exception;
	public void enterDataToForm(AutomobileInstantQuotePageDto aiqpDto) throws Exception;
	public void verifySubmittedData(AutomobileInstantQuotePageDto aiqpDto) throws Exception;
	public void navigateHome() throws Exception;
	public void logout() throws Exception;
}
