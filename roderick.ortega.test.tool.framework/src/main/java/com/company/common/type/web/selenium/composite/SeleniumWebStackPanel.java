package com.company.common.type.web.selenium.composite;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.company.common.browser.AbstractSeleniumWebBrowser;
import com.company.common.model.test.TestObjectInterface;
import com.company.common.model.type.AbstractWebElementInterface;
import com.company.common.model.type.composite.AbstractWebStackPanelInterface;
import com.company.common.type.web.selenium.SeleniumWebElement;
import com.company.common.types.Locator;

public class SeleniumWebStackPanel extends SeleniumWebElement implements TestObjectInterface, AbstractWebStackPanelInterface {

	public SeleniumWebStackPanel(WebElement webElement, Locator locator, AbstractSeleniumWebBrowser webBrowser) {
		super(webElement, locator, webBrowser);
	}

	@Override
	public void selectStack(String item) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getStackPanelBannerText(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AbstractWebElementInterface getSelectedStackPanelBannerContent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AbstractWebElementInterface getSelectedStackBanner() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AbstractWebElementInterface getStackPanelBanner(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AbstractWebElementInterface> getAllBanners() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getAllBannerNames() {
		// TODO Auto-generated method stub
		return null;
	}

}
