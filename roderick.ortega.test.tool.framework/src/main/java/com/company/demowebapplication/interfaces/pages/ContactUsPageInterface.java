package com.company.demowebapplication.interfaces.pages;

public interface ContactUsPageInterface extends AbstractSitePageInterface, SiteFooterNavigationInterface, SiteTopNavigationInterface {
	public void setTitle() throws Exception;
	public void setFirstName() throws Exception;
	public void setLastName() throws Exception;
	public void setAddress() throws Exception;
	public void setCity() throws Exception;
	public void setStateProvince() throws Exception;
	public void setZipPostalCode() throws Exception;
	public void setTelephone() throws Exception;
	public void setEmail() throws Exception;
	public void setComment() throws Exception;
	public void selectSubmit() throws Exception;
}
