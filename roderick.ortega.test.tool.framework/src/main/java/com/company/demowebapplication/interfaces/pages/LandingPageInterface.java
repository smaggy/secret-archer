package com.company.demowebapplication.interfaces.pages;

import com.company.demowebapplication.enums.ServiceTypeEnum;

public interface LandingPageInterface extends AbstractSitePageInterface, SiteFooterNavigationInterface {
	public void setEmail(String email) throws Exception;
	public void setPassword(String password) throws Exception;
	public void selectLoginButton() throws Exception;
	public void selectSignUpButton() throws Exception;
	public void selectDetailsButton() throws Exception;
	public void selectLogOutButton() throws Exception;
	public void selectService(ServiceTypeEnum serviceType) throws Exception;
	public void selectLearnMore() throws Exception;
	public void selectAllServices() throws Exception;
	public void selectNewsArchive() throws Exception;
	public void setNewsletterSignUpEmail(String email) throws Exception;
	public void selectNewsletterSignUpButton() throws Exception;
}
