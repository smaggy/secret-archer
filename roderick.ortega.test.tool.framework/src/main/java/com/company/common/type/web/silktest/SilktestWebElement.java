package com.company.common.type.web.silktest;

import java.util.List;

import com.borland.silktest.jtf.xbrowser.DomElement;
import com.company.common.browser.SilktestWebBrowser;
import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebElementInterface;
import com.company.common.types.CssSelector;
import com.company.common.types.Locator;

public class SilktestWebElement extends SilktestTestObject implements AbstractWebElementInterface, TestObjectInterface, ClickableInterface, KeyableInterface {
	
	private DomElement domElement;
	private SilktestWebBrowser webBrowser;
	private Locator locator;
	private CssSelector cssSelector;
	
	public SilktestWebElement(DomElement domElement, Locator locator, SilktestWebBrowser webBrowser) {
		this.domElement = domElement;
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
		System.out.println("SilktestWebElement|getDomAttributeList");
		return getDomElement().getDomAttributeList();
	}

	@Override
	public String getText() {
		System.out.println("SilktestWebElement|getText");
		return getDomElement().getText();
	}

	@Override
	public String getDomAttribute(String attribute) {
		System.out.println("SilktestWebElement|getDomAttribute: [" + attribute + "]");
		return getDomElement().getDomAttribute(attribute).toString();
	}

	@Override
	public boolean exists() {
		System.out.println("SilktestWebElement|exists");
		return getDomElement().exists();
	}

	@Override
	public void pressKeys(String keys) {
		System.out.println("SilktestWebElement|pressKeys: " + keys);
		getDomElement().pressKeys(keys);
	}

	@Override
	public void typeKeys(String keys) {
		System.out.println("SilktestWebElement|typeKeys: " + keys);
		getDomElement().typeKeys(keys);
	}

	@Override
	public void typeKeys(String keys, int delay) {
		System.out.println("SilktestWebElement|typeKeys: " + keys + "|" + delay);
		getDomElement().typeKeys(keys, delay);
	}

	@Override
	public void click() {
		System.out.println("SilktestWebElement|click");
		getDomElement().click();
	}

	@Override
	public void doubleClick() {
		System.out.println("SilktestWebElement|doubleClick");
		getDomElement().doubleClick();
	}

	@Override
	public void mouseMove() {
		System.out.println("SilktestWebElement|mouseMove");
		getDomElement().mouseMove();
	}
	
}
