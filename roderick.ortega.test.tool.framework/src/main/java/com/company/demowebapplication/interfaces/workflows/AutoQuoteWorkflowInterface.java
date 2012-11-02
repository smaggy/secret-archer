package com.company.demowebapplication.interfaces.workflows;

public interface AutoQuoteWorkflowInterface extends AbstractSiteWorkflowInterface {
	public void login() throws Exception;
	public void enterDataToForm() throws Exception;
	public void verifySubmittedData() throws Exception;
}
