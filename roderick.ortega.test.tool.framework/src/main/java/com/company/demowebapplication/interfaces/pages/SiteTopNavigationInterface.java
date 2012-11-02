package com.company.demowebapplication.interfaces.pages;

import com.company.demowebapplication.enums.ServiceTypeEnum;

public interface SiteTopNavigationInterface extends AbstractSitePageInterface {
	public void selectHomeButton() throws Exception;
	public void selectAccountButton() throws Exception;
	public void selectContactUsButton() throws Exception;
	public void selectService(ServiceTypeEnum serviceType) throws Exception;
}
