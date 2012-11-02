package com.company.demowebapplication.interfaces.pages;

public interface LandingPageInterface extends AbstractSitePageInterface, SiteFooterNavigationInterface {
	public void setEmail();
	public void setPassword();
	public void selectLoginButton();
	public void selectSignUpButton();
	public void selectDetailsButton();
	public void selectLogOutButton();
	public void selectService();
	public void selectLearnMore();
	public void selectAllServices();
	public void selectNewsArchive();
	public void setNewsletterSignUpEmail();
	public void selectNewsletterSignUpButton();
}
