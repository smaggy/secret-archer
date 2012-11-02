package com.company.demowebapplication.interfaces.pages;

import java.util.List;

public interface DetailsPageInterface extends AbstractSitePageInterface, SiteFooterNavigationInterface, SiteTopNavigationInterface {
	public String getDisplayedEmail();
	public String getDisplayedMailingAddress();
	public List<List<String>> getPurchasedQuotesTable();
}
