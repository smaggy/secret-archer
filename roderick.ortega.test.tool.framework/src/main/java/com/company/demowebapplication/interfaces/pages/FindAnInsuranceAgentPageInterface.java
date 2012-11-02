package com.company.demowebapplication.interfaces.pages;

import java.util.List;

public interface FindAnInsuranceAgentPageInterface extends SiteTopNavigationInterface, SiteFooterNavigationInterface, AbstractSitePageInterface {
	public void setZipCode();
	public void selectZipCodeSearch();
	public void setLastName();
	public void selectLastNameSearch();
	public void selectShowAllSearch();
	public boolean agentSearchResultsPageExists();
	public List<List<String>> getInsuranceAgentsResults();
}
