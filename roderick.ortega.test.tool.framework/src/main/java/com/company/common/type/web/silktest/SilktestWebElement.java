package com.company.common.type.web.silktest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.borland.silktest.jtf.xbrowser.DomElement;
import com.company.common.browser.SilktestWebBrowser;
import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebElementInterface;
import com.company.common.types.CssSelector;
import com.company.common.types.Locator;

public class SilktestWebElement extends SilktestTestObject implements AbstractWebElementInterface, TestObjectInterface, ClickableInterface, KeyableInterface {
	
	final static Logger logger = LoggerFactory.getLogger(SilktestWebElement.class);
	
	private DomElement domElement;
	private SilktestWebBrowser webBrowser;
	private Locator locator;
	private CssSelector cssSelector;
	
	public SilktestWebElement(DomElement domElement, Locator locator, SilktestWebBrowser webBrowser) {
		logger.debug("SilktestWebElement|constructor: building " + this.getClass().getSimpleName());
		this.setDomElement(domElement);
		this.setLocator(locator);
		this.setWebBrowser(webBrowser);
	}
	
	/**
	 * =================================================================================
	 * 		START - SETTERS AND GETTERS
	 * =================================================================================
	 */
	
	public DomElement getDomElement() {
		return domElement;
	}

	public void setDomElement(DomElement domElement) {
		this.domElement = domElement;
	}

	public SilktestWebBrowser getWebBrowser() {
		return webBrowser;
	}

	public void setWebBrowser(SilktestWebBrowser webBrowser) {
		this.webBrowser = webBrowser;
	}

	public Locator getLocator() {
		return locator;
	}

	public void setLocator(Locator locator) {
		this.locator = locator;
	}

	public CssSelector getCssSelector() {
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
		logger.debug("SilktestWebElement|getDomAttributeList");
		return getDomElement().getDomAttributeList();
	}

	@Override
	public String getText() {
		logger.debug("SilktestWebElement|getText");
		return getDomElement().getText();
	}

	@Override
	public String getDomAttribute(String attribute) {
		logger.debug("SilktestWebElement|getDomAttribute: [" + attribute + "]");
		return getDomElement().getDomAttribute(attribute).toString();
	}

	@Override
	public boolean exists() {
		logger.debug("SilktestWebElement|exists");
		return getDomElement().exists();
	}

	@Override
	public void pressKeys(String keys) {
		logger.debug("SilktestWebElement|pressKeys: " + keys);
		getDomElement().pressKeys(keys);
	}

	@Override
	public void typeKeys(String keys) {
		logger.debug("SilktestWebElement|typeKeys: " + keys);
		getDomElement().typeKeys(keys);
	}

	@Override
	public void typeKeys(String keys, int delay) {
		logger.debug("SilktestWebElement|typeKeys: " + keys + "|" + delay);
		getDomElement().typeKeys(keys, delay);
	}

	@Override
	public void click() {
		logger.debug("SilktestWebElement|click");
		getDomElement().click();
	}

	@Override
	public void doubleClick() {
		logger.debug("SilktestWebElement|doubleClick");
		getDomElement().doubleClick();
	}

	@Override
	public void mouseMove() {
		logger.debug("SilktestWebElement|mouseMove");
		getDomElement().mouseMove();
	}
	
}
