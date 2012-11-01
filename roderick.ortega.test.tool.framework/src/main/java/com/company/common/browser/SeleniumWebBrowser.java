package com.company.common.browser;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.company.common.interfaces.action.FindableInterface;
import com.company.common.interfaces.browser.AbstractWebBrowserInterface;
import com.company.common.interfaces.type.AbstractWebButtonInterface;
import com.company.common.interfaces.type.AbstractWebCheckBoxInterface;
import com.company.common.interfaces.type.AbstractWebElementInterface;
import com.company.common.interfaces.type.AbstractWebLinkInterface;
import com.company.common.interfaces.type.AbstractWebListBoxInterface;
import com.company.common.interfaces.type.AbstractWebListInterface;
import com.company.common.interfaces.type.AbstractWebRadioButtonInterface;
import com.company.common.interfaces.type.AbstractWebTableInterface;
import com.company.common.interfaces.type.AbstractWebTableRowInterface;
import com.company.common.interfaces.type.AbstractWebTextFieldInterface;
import com.company.common.type.web.selenium.SeleniumWebButton;
import com.company.common.type.web.selenium.SeleniumWebCheckBox;
import com.company.common.type.web.selenium.SeleniumWebElement;
import com.company.common.type.web.selenium.SeleniumWebLink;
import com.company.common.type.web.selenium.SeleniumWebList;
import com.company.common.type.web.selenium.SeleniumWebListBox;
import com.company.common.type.web.selenium.SeleniumWebRadioButton;
import com.company.common.type.web.selenium.SeleniumWebTable;
import com.company.common.type.web.selenium.SeleniumWebTableRow;
import com.company.common.type.web.selenium.SeleniumWebTextField;
import com.company.common.types.Locator;
import com.company.common.types.Url;

public class SeleniumWebBrowser implements AbstractWebBrowserInterface, FindableInterface {

	private WebDriver webDriver;
	
	public SeleniumWebBrowser() {
		// default - internet explorer version of webDriver
		setWebDriver(new InternetExplorerDriver());
	}
	
	public WebDriver getWebDriver() {
		return webDriver;
	}

	public void setWebDriver(WebDriver webDriver) {
		this.webDriver = webDriver;
	}

	@Override
	public void close() {
		webDriver.close();
	}

	@Override
	public String getUrl() {
		return webDriver.getCurrentUrl();
	}

	@Override
	public void navigate(Url url) {
		webDriver.navigate().to(url.getUrl());
	}

	@Override
	public String getTitle() {
		return webDriver.getTitle();
	}

	@Override
	public AbstractWebElementInterface findWebElement(Locator locator) {
		System.out.println("SeleniumWebBrowser|findWebElement: " + locator);
		WebElement webElement = getWebDriver().findElement(By.xpath(locator.getXPathLocator()));
		return new SeleniumWebElement(webElement, locator, this);
	}

	@Override
	public AbstractWebButtonInterface findWebButton(Locator locator) {
		System.out.println("SeleniumWebBrowser|findWebButton: " + locator);
		WebElement webElement = getWebDriver().findElement(By.xpath(locator.getXPathLocator()));
		return new SeleniumWebButton(webElement, locator, this);
	}

	@Override
	public AbstractWebCheckBoxInterface findWebCheckBox(Locator locator) {
		System.out.println("SeleniumWebBrowser|findWebCheckBox: " + locator);
		WebElement webElement = getWebDriver().findElement(By.xpath(locator.getXPathLocator()));
		return new SeleniumWebCheckBox(webElement, locator, this);
	}

	@Override
	public AbstractWebLinkInterface findWebLink(Locator locator) {
		System.out.println("SeleniumWebBrowser|findWebLink: " + locator);
		WebElement webElement = getWebDriver().findElement(By.xpath(locator.getXPathLocator()));
		return new SeleniumWebLink(webElement, locator, this);
	}

	@Override
	public AbstractWebListInterface findWebList(Locator locator) {
		System.out.println("SeleniumWebBrowser|findWebList: " + locator);
		WebElement webElement = getWebDriver().findElement(By.xpath(locator.getXPathLocator()));
		return new SeleniumWebList(webElement, locator, this);
	}

	@Override
	public AbstractWebListBoxInterface findWebListBox(Locator locator) {
		System.out.println("SeleniumWebBrowser|findWebListBox: " + locator);
		WebElement webElement = getWebDriver().findElement(By.xpath(locator.getXPathLocator()));
		return new SeleniumWebListBox(webElement, locator, this);
	}

	@Override
	public AbstractWebRadioButtonInterface findWebRadioButton(Locator locator) {
		System.out.println("SeleniumWebBrowser|findWebRadioButton: " + locator);
		WebElement webElement = getWebDriver().findElement(By.xpath(locator.getXPathLocator()));
		return new SeleniumWebRadioButton(webElement, locator, this);
	}

	@Override
	public AbstractWebTableInterface findWebTable(Locator locator) {
		System.out.println("SeleniumWebBrowser|findWebTable: " + locator);
		WebElement webElement = getWebDriver().findElement(By.xpath(locator.getXPathLocator()));
		return new SeleniumWebTable(webElement, locator, this);
	}

	@Override
	public AbstractWebTableRowInterface findWebTableRow(Locator locator) {
		System.out.println("SeleniumWebBrowser|findWebTableRow: " + locator);
		WebElement webElement = getWebDriver().findElement(By.xpath(locator.getXPathLocator()));
		return new SeleniumWebTableRow(webElement, locator, this);
	}

	@Override
	public AbstractWebTextFieldInterface findWebTextField(Locator locator) {
		System.out.println("SeleniumWebBrowser|findWebTextField: " + locator);
		WebElement webElement = getWebDriver().findElement(By.xpath(locator.getXPathLocator()));
		return new SeleniumWebTextField(webElement, locator, this);
	}

	@Override
	public List<AbstractWebElementInterface> findAllWebElements(Locator locator) {
		System.out.println("SeleniumWebBrowser|findAllWebElements: " + locator);
		List<WebElement> webElements = getWebDriver().findElements(By.xpath(locator.getXPathLocator()));
		List<AbstractWebElementInterface> retList = new ArrayList<AbstractWebElementInterface>();
		int counter = 1;
		for (WebElement webElement : webElements) {
			retList.add(new SeleniumWebElement(webElement, new Locator(locator.getXPathLocator() + "[" + counter + "]"), this));
			counter = counter + 1;
		}
		return retList;
	}

	@Override
	public List<AbstractWebButtonInterface> findAllWebButtons(Locator locator) {
		System.out.println("SeleniumWebBrowser|findAllWebButtons: " + locator);
		List<WebElement> webElements = getWebDriver().findElements(By.xpath(locator.getXPathLocator()));
		List<AbstractWebButtonInterface> retList = new ArrayList<AbstractWebButtonInterface>();
		int counter = 1;
		for (WebElement webElement : webElements) {
			retList.add(new SeleniumWebButton(webElement, new Locator(locator.getXPathLocator() + "[" + counter + "]"), this));
			counter = counter + 1;
		}
		return retList;
	}

	@Override
	public List<AbstractWebLinkInterface> findAllWebLinks(Locator locator) {
		System.out.println("SeleniumWebBrowser|findAllWebLinks: " + locator);
		List<WebElement> webElements = getWebDriver().findElements(By.xpath(locator.getXPathLocator()));
		List<AbstractWebLinkInterface> retList = new ArrayList<AbstractWebLinkInterface>();
		int counter = 1;
		for (WebElement webElement : webElements) {
			retList.add(new SeleniumWebLink(webElement, new Locator(locator.getXPathLocator() + "[" + counter + "]"), this));
			counter = counter + 1;
		}
		return null;
	}

	@Override
	public List<AbstractWebListInterface> findAllWebLists(Locator locator) {
		System.out.println("SeleniumWebBrowser|findAllWebLists: " + locator);
		List<WebElement> webElements = getWebDriver().findElements(By.xpath(locator.getXPathLocator()));
		List<AbstractWebListInterface> retList = new ArrayList<AbstractWebListInterface>();
		int counter = 1;
		for (WebElement webElement : webElements) {
			retList.add(new SeleniumWebList(webElement, new Locator(locator.getXPathLocator() + "[" + counter + "]"), this));
			counter = counter + 1;
		}
		return retList;
	}

	@Override
	public List<AbstractWebListBoxInterface> findAllWebListBoxes(Locator locator) {
		System.out.println("SeleniumWebBrowser|findAllWebListBoxes: " + locator);
		List<WebElement> webElements = getWebDriver().findElements(By.xpath(locator.getXPathLocator()));
		List<AbstractWebListBoxInterface> retList = new ArrayList<AbstractWebListBoxInterface>();
		int counter = 1;
		for (WebElement webElement : webElements) {
			retList.add(new SeleniumWebListBox(webElement, new Locator(locator.getXPathLocator() + "[" + counter + "]"), this));
			counter = counter + 1;
		}
		return retList;
	}

	@Override
	public List<AbstractWebRadioButtonInterface> findAllWebRadioButtons(Locator locator) {
		System.out.println("SeleniumWebBrowser|findAllWebRadioButtons: " + locator);
		List<WebElement> webElements = getWebDriver().findElements(By.xpath(locator.getXPathLocator()));
		List<AbstractWebRadioButtonInterface> retList = new ArrayList<AbstractWebRadioButtonInterface>();
		int counter = 1;
		for (WebElement webElement : webElements) {
			retList.add(new SeleniumWebRadioButton(webElement, new Locator(locator.getXPathLocator() + "[" + counter + "]"), this));
			counter = counter + 1;
		}
		return retList;
	}

	@Override
	public List<AbstractWebTableInterface> findAllWebTables(Locator locator) {
		System.out.println("SeleniumWebBrowser|findAllWebTables: " + locator);
		List<WebElement> webElements = getWebDriver().findElements(By.xpath(locator.getXPathLocator()));
		List<AbstractWebTableInterface> retList = new ArrayList<AbstractWebTableInterface>();
		int counter = 1;
		for (WebElement webElement : webElements) {
			retList.add(new SeleniumWebTable(webElement, new Locator(locator.getXPathLocator() + "[" + counter + "]"), this));
			counter = counter + 1;
		}
		return retList;
	}

	@Override
	public List<AbstractWebTableRowInterface> findAllWebTableRows(Locator locator) {
		System.out.println("SeleniumWebBrowser|findAllWebTableRows: " + locator);
		List<WebElement> webElements = getWebDriver().findElements(By.xpath(locator.getXPathLocator()));
		List<AbstractWebTableRowInterface> retList = new ArrayList<AbstractWebTableRowInterface>();
		int counter = 1;
		for (WebElement webElement : webElements) {
			SeleniumWebTableRow row = new SeleniumWebTableRow(webElement, new Locator(locator.getXPathLocator() + "[" + counter + "]"), this);
			row.setIndex(counter);
			retList.add(row);
			counter = counter + 1;
		}
		return retList;
	}

	@Override
	public List<AbstractWebTextFieldInterface> findAllWebTextFields(Locator locator) {
		System.out.println("SeleniumWebBrowser|findAllWebTextFields: " + locator);
		List<WebElement> webElements = getWebDriver().findElements(By.xpath(locator.getXPathLocator()));
		List<AbstractWebTextFieldInterface> retList = new ArrayList<AbstractWebTextFieldInterface>();
		int counter = 1;
		for (WebElement webElement : webElements) {
			retList.add(new SeleniumWebTextField(webElement, new Locator(locator.getXPathLocator() + "[" + counter + "]"), this));
			counter = counter + 1;
		}
		return retList;
	}

	@Override
	public List<AbstractWebCheckBoxInterface> findAllWebCheckBoxes(Locator locator) {
		System.out.println("SeleniumWebBrowser|findAllWebCheckBoxes: " + locator);
		List<WebElement> webElements = getWebDriver().findElements(By.xpath(locator.getXPathLocator()));
		List<AbstractWebCheckBoxInterface> retList = new ArrayList<AbstractWebCheckBoxInterface>();
		int counter = 1;
		for (WebElement webElement : webElements) {
			retList.add(new SeleniumWebCheckBox(webElement, new Locator(locator.getXPathLocator() + "[" + counter + "]"), this));
			counter = counter + 1;
		}
		return retList;
	}

}
