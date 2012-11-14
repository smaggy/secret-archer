package com.company.common.type.web.selenium;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.browser.AbstractSeleniumWebBrowser;
import com.company.common.model.action.ClickableInterface;
import com.company.common.model.action.KeyableInterface;
import com.company.common.model.test.TestObjectInterface;
import com.company.common.model.type.AbstractSeleniumWebElementInterface;
import com.company.common.types.CssSelector;
import com.company.common.types.Locator;

public class SeleniumWebElement extends SeleniumTestObject implements TestObjectInterface, ClickableInterface, KeyableInterface, AbstractSeleniumWebElementInterface {
	
	final static Logger logger = LoggerFactory.getLogger(SeleniumWebElement.class);
	
	private WebElement webElement;
	private AbstractSeleniumWebBrowser webBrowser;
	private Locator locator;
	private CssSelector cssSelector;
	
	public SeleniumWebElement (WebElement webElement, Locator locator, AbstractSeleniumWebBrowser webBrowser) {
		logger.debug("SeleniumWebElement|constructor: building " + this.getClass().getSimpleName());
		this.setWebElement(webElement);
		this.setLocator(locator);
		this.setWebBrowser(webBrowser);
	}
	
	/**
	 * =================================================================================
	 * 		START - SETTERS AND GETTERS
	 * =================================================================================
	 */
	
	public WebElement getWebElement() {
		logger.debug("SeleniumWebElement|getWebElement");
		return webElement;
	}
	
	public void setWebElement(WebElement webElement) {
		this.webElement = webElement;
	}

	public AbstractSeleniumWebBrowser getWebBrowser() {
		logger.debug("SeleniumWebElement|getWebBrowser");
		return webBrowser;
	}

	public void setWebBrowser(AbstractSeleniumWebBrowser webBrowser) {
		this.webBrowser = webBrowser;
	}

	public Locator getLocator() {
		logger.debug("SeleniumWebElement|getLocator");
		return locator;
	}

	public void setLocator(Locator locator) {
		this.locator = locator;
	}

	public CssSelector getCssSelector() {
		logger.debug("SeleniumWebElement|getCssSelector");
		return cssSelector;
	}

	public void setCssSelector(CssSelector cssSelector) {
		this.cssSelector = cssSelector;
	}

	/**
	 * =================================================================================
	 * 		END - SETTERS AND GETTERS
	 * =================================================================================
	 */
	
	@Override
	public List<String> getDomAttributeList() {
		// TODO reo check to see if this is valid
		return null;
	}
	
	@Override
	public String getDomAttribute(String attribute) {
		logger.debug("SeleniumWebElement|getDomAttribute: [" + attribute + "]");
		return getWebElement().getAttribute(attribute);
	}

	@Override
	public String getText() {
		logger.debug("SeleniumWebElement|getText");
		return getWebElement().getText();
	}
	
	@Override
	public boolean exists() {
		logger.debug("SeleniumWebElement|exists");
		return getWebElement().isDisplayed();
	}

	@Override
	public void pressKeys(String keys) {
		logger.debug("SeleniumWebElement|pressKeys: " + keys);
		// TODO reo check to see if this is valid
		getWebElement().sendKeys(keys);
	}

	@Override
	public void typeKeys(String keys) {
		logger.debug("SeleniumWebElement|typeKeys: " + keys);
		// TODO reo check to see if this is valid
		getWebElement().sendKeys(keys);
	}

	@Override
	public void typeKeys(String keys, int delay) {
		logger.debug("SeleniumWebElement|typeKeys: " + keys + "|" + delay);
		logger.debug("... Bypassing delay.");
		// TODO reo check to see if this is valid
		getWebElement().sendKeys(keys);
	}

	@Override
	public void click() {
		logger.debug("SeleniumWebElement|click");
		getWebElement().click();
	}

	@Override
	public void doubleClick() {
		// TODO reo check to see if this is valid
		logger.debug("SeleniumTestObject|doubleClick");
		getWebElement().click();
		getWebElement().click();
	}

	@Override
	public void mouseMove() {
		logger.debug("SeleniumTestObject|mouseMove");
		// TODO reo check to see if this is valid
		getWebElement().isDisplayed();
	}

}
