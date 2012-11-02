package com.company.demowebapplication.interfaces.pages;

public interface ContactUsPageInterface extends AbstractSitePageInterface, SiteFooterNavigationInterface, SiteTopNavigationInterface {
	public void setTitle();
	public void setFirstName();
	public void setLastName();
	public void setAddress();
	public void setCity();
	public void setStateProvince();
	public void setZipPostalCode();
	public void setTelephone();
	public void setEmail();
	public void setComment();
	public void selectSubmit();
}
