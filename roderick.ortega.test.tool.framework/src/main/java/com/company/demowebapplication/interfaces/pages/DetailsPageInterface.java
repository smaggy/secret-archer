package com.company.demowebapplication.interfaces.pages;

import java.util.List;

public interface DetailsPageInterface extends AbstractSitePageInterface, SiteFooterNavigationInterface, SiteTopNavigationInterface {
	public String getDisplayedEmail() throws Exception;
	public String getDisplayedMailingAddress() throws Exception;
	public List<List<String>> getPurchasedQuotesTable() throws Exception;
}
