package com.company.common.browser;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.concrete.bridges.XmlServerPathBridge;
import com.company.common.model.action.FindableInterface;
import com.company.common.model.browser.AbstractWebBrowserInterface;
import com.company.common.model.type.AbstractWebButtonInterface;
import com.company.common.model.type.AbstractWebCheckBoxInterface;
import com.company.common.model.type.AbstractWebElementInterface;
import com.company.common.model.type.AbstractWebLinkInterface;
import com.company.common.model.type.AbstractWebListBoxInterface;
import com.company.common.model.type.AbstractWebListInterface;
import com.company.common.model.type.AbstractWebRadioButtonInterface;
import com.company.common.model.type.AbstractWebTableInterface;
import com.company.common.model.type.AbstractWebTableRowInterface;
import com.company.common.model.type.AbstractWebTextFieldInterface;
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

public abstract class AbstractSeleniumWebBrowser implements AbstractWebBrowserInterface, FindableInterface {

	final static Logger logger = LoggerFactory.getLogger(AbstractSeleniumWebBrowser.class);
	private WebDriver webDriver;
	private XmlServerPathBridge xmlServerPathBridge;
	
	public WebDriver getWebDriver() {
		return webDriver;
	}

	public void setWebDriver(WebDriver webDriver) {
		this.webDriver = webDriver;
	}

	public XmlServerPathBridge getXmlServerPathBridge() {
		return xmlServerPathBridge;
	}

	public void setXmlServerPathBridge(XmlServerPathBridge xmlServerPathBridge) {
		this.xmlServerPathBridge = xmlServerPathBridge;
	}

	@Override
	public void close() {
		logger.info("AbstractSeleniumWebBrowser|close");
		webDriver.close();
	}

	@Override
	public String getUrl() {
		logger.debug("AbstractSeleniumWebBrowser|getUrl");
		return webDriver.getCurrentUrl();
	}

	@Override
	public void navigate(Url url) {
		logger.info("AbstractSeleniumWebBrowser|navigate: [" + url + "]");
		webDriver.navigate().to(url.getUrl());
	}

	@Override
	public String getTitle() {
		logger.debug("AbstractSeleniumWebBrowser|getTitle");
		return webDriver.getTitle();
	}

	@Override
	public AbstractWebElementInterface findWebElement(Locator locator) {
		logger.debug("SeleniumWebBrowser|findWebElement: " + locator);
		WebElement webElement = getWebDriver().findElement(By.xpath(locator.getXPathLocator()));
		return new SeleniumWebElement(webElement, locator, this);
	}

	@Override
	public AbstractWebButtonInterface findWebButton(Locator locator) {
		logger.debug("SeleniumWebBrowser|findWebButton: " + locator);
		WebElement webElement = getWebDriver().findElement(By.xpath(locator.getXPathLocator()));
		return new SeleniumWebButton(webElement, locator, this);
	}

	@Override
	public AbstractWebCheckBoxInterface findWebCheckBox(Locator locator) {
		logger.debug("SeleniumWebBrowser|findWebCheckBox: " + locator);
		WebElement webElement = getWebDriver().findElement(By.xpath(locator.getXPathLocator()));
		return new SeleniumWebCheckBox(webElement, locator, this);
	}

	@Override
	public AbstractWebLinkInterface findWebLink(Locator locator) {
		logger.debug("SeleniumWebBrowser|findWebLink: " + locator);
		WebElement webElement = getWebDriver().findElement(By.xpath(locator.getXPathLocator()));
		return new SeleniumWebLink(webElement, locator, this);
	}

	@Override
	public AbstractWebListInterface findWebList(Locator locator) {
		logger.debug("SeleniumWebBrowser|findWebList: " + locator);
		WebElement webElement = getWebDriver().findElement(By.xpath(locator.getXPathLocator()));
		return new SeleniumWebList(webElement, locator, this);
	}

	@Override
	public AbstractWebListBoxInterface findWebListBox(Locator locator) {
		logger.debug("SeleniumWebBrowser|findWebListBox: " + locator);
		WebElement webElement = getWebDriver().findElement(By.xpath(locator.getXPathLocator()));
		return new SeleniumWebListBox(webElement, locator, this);
	}

	@Override
	public AbstractWebRadioButtonInterface findWebRadioButton(Locator locator) {
		logger.debug("SeleniumWebBrowser|findWebRadioButton: " + locator);
		WebElement webElement = getWebDriver().findElement(By.xpath(locator.getXPathLocator()));
		return new SeleniumWebRadioButton(webElement, locator, this);
	}

	@Override
	public AbstractWebTableInterface findWebTable(Locator locator) {
		logger.debug("SeleniumWebBrowser|findWebTable: " + locator);
		WebElement webElement = getWebDriver().findElement(By.xpath(locator.getXPathLocator()));
		return new SeleniumWebTable(webElement, locator, this);
	}

	@Override
	public AbstractWebTableRowInterface findWebTableRow(Locator locator) {
		logger.debug("SeleniumWebBrowser|findWebTableRow: " + locator);
		WebElement webElement = getWebDriver().findElement(By.xpath(locator.getXPathLocator()));
		return new SeleniumWebTableRow(webElement, locator, this);
	}

	@Override
	public AbstractWebTextFieldInterface findWebTextField(Locator locator) {
		logger.debug("SeleniumWebBrowser|findWebTextField: " + locator);
		WebElement webElement = getWebDriver().findElement(By.xpath(locator.getXPathLocator()));
		return new SeleniumWebTextField(webElement, locator, this);
	}

	@Override
	public List<AbstractWebElementInterface> findAllWebElements(Locator locator) {
		logger.debug("SeleniumWebBrowser|findAllWebElements: " + locator);
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
		logger.debug("SeleniumWebBrowser|findAllWebButtons: " + locator);
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
		logger.debug("SeleniumWebBrowser|findAllWebLinks: " + locator);
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
		logger.debug("SeleniumWebBrowser|findAllWebLists: " + locator);
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
		logger.debug("SeleniumWebBrowser|findAllWebListBoxes: " + locator);
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
		logger.debug("SeleniumWebBrowser|findAllWebRadioButtons: " + locator);
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
		logger.debug("SeleniumWebBrowser|findAllWebTables: " + locator);
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
		logger.debug("SeleniumWebBrowser|findAllWebTableRows: " + locator);
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
		logger.debug("SeleniumWebBrowser|findAllWebTextFields: " + locator);
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
		logger.debug("SeleniumWebBrowser|findAllWebCheckBoxes: " + locator);
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
