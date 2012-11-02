package com.company.demowebapplication.interfaces.pages;

import java.util.List;

public interface FindAnInsuranceAgentPageInterface extends SiteTopNavigationInterface, SiteFooterNavigationInterface, AbstractSitePageInterface {
	public void setZipCode() throws Exception;
	public void selectZipCodeSearch() throws Exception;
	public void setLastName() throws Exception;
	public void selectLastNameSearch() throws Exception;
	public void selectShowAllSearch() throws Exception;
	public boolean agentSearchResultsPageExists() throws Exception;
	public List<List<String>> getInsuranceAgentsResults() throws Exception;
}
