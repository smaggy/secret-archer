package com.company.common.browser;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.borland.silktest.jtf.BrowserBaseState;
import com.borland.silktest.jtf.Desktop;
import com.borland.silktest.jtf.xbrowser.BrowserWindow;
import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomCheckBox;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomLink;
import com.borland.silktest.jtf.xbrowser.DomListBox;
import com.borland.silktest.jtf.xbrowser.DomRadioButton;
import com.borland.silktest.jtf.xbrowser.DomTable;
import com.borland.silktest.jtf.xbrowser.DomTableRow;
import com.borland.silktest.jtf.xbrowser.DomTextField;
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
import com.company.common.type.web.silktest.SilktestWebButton;
import com.company.common.type.web.silktest.SilktestWebCheckBox;
import com.company.common.type.web.silktest.SilktestWebElement;
import com.company.common.type.web.silktest.SilktestWebLink;
import com.company.common.type.web.silktest.SilktestWebList;
import com.company.common.type.web.silktest.SilktestWebListBox;
import com.company.common.type.web.silktest.SilktestWebRadioButton;
import com.company.common.type.web.silktest.SilktestWebTable;
import com.company.common.type.web.silktest.SilktestWebTableRow;
import com.company.common.type.web.silktest.SilktestWebTextField;
import com.company.common.types.Locator;
import com.company.common.types.Url;

public class SilktestWebBrowser implements AbstractWebBrowserInterface, FindableInterface {

	final static Logger logger = LoggerFactory.getLogger(SilktestWebBrowser.class);
	private Desktop desktop;
	private BrowserBaseState browserBaseState;
	private BrowserWindow browserWindow;
	
	public SilktestWebBrowser() {
		this.desktop = new Desktop();
		this.browserBaseState = new BrowserBaseState(new File("./Resources/Properties/silk4j.settings"));
		this.browserWindow = browserBaseState.execute(this.desktop).find("//BrowserWindow");
		browserWindow.reload();
	}
	
	@Override
	public void close() {
		logger.debug("SilktestWebBrowser|close");
		browserWindow.close();
	}

	@Override
	public String getUrl() {
		logger.debug("SilktestWebBrowser|getUrl");
		return browserWindow.getUrl();
	}

	@Override
	public void navigate(Url url) {
		logger.debug("SilktestWebBrowser|navigate: [" + url + "]");
		browserWindow.navigate(url.getUrl());
	}

	@Override
	public String getTitle() {
		logger.debug("SilktestWebBrowser|getTitle");
		return browserWindow.getText();
	}

	@Override
	public AbstractWebElementInterface findWebElement(Locator locator) {
		logger.debug("SilktestWebBrowser|findWebElement: [" + locator + "]");
		DomElement element = browserWindow.find(locator.getXPathLocator());
		return new SilktestWebElement(element, locator, this);
	}

	@Override
	public AbstractWebButtonInterface findWebButton(Locator locator) {
		logger.debug("SilktestWebBrowser|findWebButton: [" + locator + "]");
		DomButton domButton = browserWindow.find(locator.getXPathLocator());
		return new SilktestWebButton(domButton, locator, this);
	}

	@Override
	public AbstractWebCheckBoxInterface findWebCheckBox(Locator locator) {
		logger.debug("SilktestWebBrowser|findWebCheckBox: [" + locator + "]");
		DomCheckBox domCheckBox = browserWindow.find(locator.getXPathLocator());
		return new SilktestWebCheckBox(domCheckBox, locator, this);
	}

	@Override
	public AbstractWebLinkInterface findWebLink(Locator locator) {
		logger.debug("SilktestWebBrowser|findWebLink: [" + locator + "]");
		DomLink domLink = browserWindow.find(locator.getXPathLocator());
		return new SilktestWebLink(domLink, locator, this);
	}

	@Override
	public AbstractWebListInterface findWebList(Locator locator) {
		logger.debug("SilktestWebBrowser|findWebList: [" + locator + "]");
		DomElement domElement = browserWindow.find(locator.getXPathLocator());
		return new SilktestWebList(domElement, locator, this);
	}

	@Override
	public AbstractWebListBoxInterface findWebListBox(Locator locator) {
		logger.debug("SilktestWebBrowser|findWebListBox: [" + locator + "]");
		DomListBox domListBox = browserWindow.find(locator.getXPathLocator());
		return new SilktestWebListBox(domListBox, locator, this);
	}

	@Override
	public AbstractWebRadioButtonInterface findWebRadioButton(Locator locator) {
		logger.debug("SilktestWebBrowser|findWebRadioButton: [" + locator + "]");
		DomRadioButton domRadioButton = browserWindow.find(locator.getXPathLocator());
		return new SilktestWebRadioButton(domRadioButton, locator, this);
	}

	@Override
	public AbstractWebTableInterface findWebTable(Locator locator) {
		logger.debug("SilktestWebBrowser|findWebTable: [" + locator + "]");
		DomTable domTable = browserWindow.find(locator.getXPathLocator());
		return new SilktestWebTable(domTable, locator, this);
	}

	@Override
	public AbstractWebTableRowInterface findWebTableRow(Locator locator) {
		logger.debug("SilktestWebBrowser|findWebTableRow: [" + locator + "]");
		DomTableRow domTableRow = browserWindow.find(locator.getXPathLocator());
		return new SilktestWebTableRow(domTableRow, locator, this);
	}

	@Override
	public AbstractWebTextFieldInterface findWebTextField(Locator locator) {
		logger.debug("SilktestWebBrowser|findWebTextField: [" + locator + "]");
		DomTextField domTextField = browserWindow.find(locator.getXPathLocator());
		return new SilktestWebTextField(domTextField, locator, this);
	}

	@Override
	public List<AbstractWebElementInterface> findAllWebElements(Locator locator) {
		logger.debug("SilktestWebBrowser|findAllWebElements: [" + locator + "]");
		List<DomElement> elements = browserWindow.findAll(locator.getXPathLocator());
		List<AbstractWebElementInterface> retList = new ArrayList<AbstractWebElementInterface>();
		int counter = 1;
		for (DomElement element : elements) {
			SilktestWebElement e = new SilktestWebElement(element, new Locator(locator.getXPathLocator() + "[" + counter + "]"), this);
			retList.add(e);
			counter = counter + 1;
		}
		return retList;
	}

	@Override
	public List<AbstractWebButtonInterface> findAllWebButtons(Locator locator) {
		logger.debug("SilktestWebBrowser|findAllWebButtons: [" + locator + "]");
		List<DomButton> elements = browserWindow.findAll(locator.getXPathLocator());
		List<AbstractWebButtonInterface> retList = new ArrayList<AbstractWebButtonInterface>();
		int counter = 1;
		for (DomButton element : elements) {
			SilktestWebButton e = new SilktestWebButton(element, new Locator(locator.getXPathLocator() + "[" + counter + "]"), this);
			retList.add(e);
			counter = counter + 1;
		}
		return retList;
	}

	@Override
	public List<AbstractWebLinkInterface> findAllWebLinks(Locator locator) {
		logger.debug("SilktestWebBrowser|findAllWebLinks: [" + locator + "]");
		List<DomLink> elements = browserWindow.findAll(locator.getXPathLocator());
		List<AbstractWebLinkInterface> retList = new ArrayList<AbstractWebLinkInterface>();
		int counter = 1;
		for (DomLink element : elements) {
			SilktestWebLink e = new SilktestWebLink(element, new Locator(locator.getXPathLocator() + "[" + counter + "]"), this);
			retList.add(e);
			counter = counter + 1;
		}
		return retList;
	}

	@Override
	public List<AbstractWebListInterface> findAllWebLists(Locator locator) {
		logger.debug("SilktestWebBrowser|findAllWebLists: [" + locator + "]");
		List<DomElement> elements = browserWindow.findAll(locator.getXPathLocator());
		List<AbstractWebListInterface> retList = new ArrayList<AbstractWebListInterface>();
		int counter = 1;
		for (DomElement element : elements) {
			SilktestWebList e = new SilktestWebList(element, new Locator(locator.getXPathLocator() + "[" + counter + "]"), this);
			retList.add(e);
			counter = counter + 1;
		}
		return retList;
	}

	@Override
	public List<AbstractWebListBoxInterface> findAllWebListBoxes(Locator locator) {
		logger.debug("SilktestWebBrowser|findAllWebListBoxes: [" + locator + "]");
		List<DomListBox> elements = browserWindow.findAll(locator.getXPathLocator());
		List<AbstractWebListBoxInterface> retList = new ArrayList<AbstractWebListBoxInterface>();
		int counter = 1;
		for (DomListBox element : elements) {
			SilktestWebListBox e = new SilktestWebListBox(element, new Locator(locator.getXPathLocator() + "[" + counter + "]"), this);
			retList.add(e);
			counter = counter + 1;
		}
		return retList;
	}

	@Override
	public List<AbstractWebRadioButtonInterface> findAllWebRadioButtons(Locator locator) {
		logger.debug("SilktestWebBrowser|findAllWebRadioButtons: [" + locator + "]");
		List<DomRadioButton> elements = browserWindow.findAll(locator.getXPathLocator());
		List<AbstractWebRadioButtonInterface> retList = new ArrayList<AbstractWebRadioButtonInterface>();
		int counter = 1;
		for (DomRadioButton element : elements) {
			SilktestWebRadioButton e = new SilktestWebRadioButton(element, new Locator(locator.getXPathLocator() + "[" + counter + "]"), this);
			retList.add(e);
			counter = counter + 1;
		}
		return retList;
	}

	@Override
	public List<AbstractWebTableInterface> findAllWebTables(Locator locator) {
		logger.debug("SilktestWebBrowser|findAllWebTables: [" + locator + "]");
		List<DomTable> elements = browserWindow.findAll(locator.getXPathLocator());
		List<AbstractWebTableInterface> retList = new ArrayList<AbstractWebTableInterface>();
		int counter = 1;
		for (DomTable element : elements) {
			SilktestWebTable e = new SilktestWebTable(element, new Locator(locator.getXPathLocator() + "[" + counter + "]"), this);
			retList.add(e);
			counter = counter + 1;
		}
		return retList;
	}

	@Override
	public List<AbstractWebTableRowInterface> findAllWebTableRows(Locator locator) {
		logger.debug("SilktestWebBrowser|findAllWebTableRows: [" + locator + "]");
		List<DomTableRow> elements = browserWindow.findAll(locator.getXPathLocator());
		List<AbstractWebTableRowInterface> retList = new ArrayList<AbstractWebTableRowInterface>();
		int counter = 1;
		for (DomTableRow element : elements) {
			SilktestWebTableRow e = new SilktestWebTableRow(element, new Locator(locator.getXPathLocator() + "[" + counter + "]"), this);
			retList.add(e);
			counter = counter + 1;
		}
		return retList;
	}

	@Override
	public List<AbstractWebTextFieldInterface> findAllWebTextFields(Locator locator) {
		logger.debug("SilktestWebBrowser|findAllWebTextFields: [" + locator + "]");
		List<DomTextField> elements = browserWindow.findAll(locator.getXPathLocator());
		List<AbstractWebTextFieldInterface> retList = new ArrayList<AbstractWebTextFieldInterface>();
		int counter = 1;
		for (DomTextField element : elements) {
			SilktestWebTextField e = new SilktestWebTextField(element, new Locator(locator.getXPathLocator() + "[" + counter + "]"), this);
			retList.add(e);
			counter = counter + 1;
		}
		return retList;
	}

	@Override
	public List<AbstractWebCheckBoxInterface> findAllWebCheckBoxes(Locator locator) {
		logger.debug("SilktestWebBrowser|findAllWebCheckBoxes: [" + locator + "]");
		List<DomCheckBox> elements = browserWindow.findAll(locator.getXPathLocator());
		List<AbstractWebCheckBoxInterface> retList = new ArrayList<AbstractWebCheckBoxInterface>();
		int counter = 1;
		for (DomCheckBox element : elements) {
			SilktestWebCheckBox e = new SilktestWebCheckBox(element, new Locator(locator.getXPathLocator() + "[" + counter + "]"), this);
			retList.add(e);
			counter = counter + 1;
		}
		return retList;
	}

}
