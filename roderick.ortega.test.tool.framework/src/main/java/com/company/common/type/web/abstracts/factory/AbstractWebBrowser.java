package com.company.common.type.web.abstracts.factory;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
import com.company.common.types.Locator;
import com.company.common.types.Url;

public abstract class AbstractWebBrowser implements AbstractWebBrowserInterface, FindableInterface {
	
	final static Logger logger = LoggerFactory.getLogger(AbstractWebBrowser.class);
	
	@Override
	public AbstractWebElementInterface findWebElement(Locator locator) {
		logger.debug("AbstractWebBrowser|findWebElement: " + locator.toString());
		return null;
	}

	@Override
	public AbstractWebButtonInterface findWebButton(Locator locator) {
		logger.debug("AbstractWebBrowser|findWebButton: " + locator.toString());
		return null;
	}
	
	@Override
	public AbstractWebCheckBoxInterface findWebCheckBox(Locator locator) {
		logger.debug("AbstractWebBrowser|findWebCheckBox: " + locator.toString());
		return null;
	}

	@Override
	public AbstractWebLinkInterface findWebLink(Locator locator) {
		logger.debug("AbstractWebBrowser|findWebLink: " + locator.toString());
		return null;
	}

	@Override
	public AbstractWebListInterface findWebList(Locator locator) {
		logger.debug("AbstractWebBrowser|findWebList: " + locator.toString());
		return null;
	}

	@Override
	public AbstractWebListBoxInterface findWebListBox(Locator locator) {
		logger.debug("AbstractWebBrowser|findWebListBox: " + locator.toString());
		return null;
	}

	@Override
	public AbstractWebRadioButtonInterface findWebRadioButton(Locator locator) {
		logger.debug("AbstractWebBrowser|findWebRadioButton: " + locator.toString());
		return null;
	}

	@Override
	public AbstractWebTableInterface findWebTable(Locator locator) {
		logger.debug("AbstractWebBrowser|findWebTable: " + locator.toString());
		return null;
	}

	@Override
	public AbstractWebTableRowInterface findWebTableRow(Locator locator) {
		logger.debug("AbstractWebBrowser|findWebTableRow: " + locator.toString());
		return null;
	}

	@Override
	public AbstractWebTextFieldInterface findWebTextField(Locator locator) {
		logger.debug("AbstractWebBrowser|findWebTextField: " + locator.toString());
		return null;
	}

	@Override
	public void close() {
		logger.debug("AbstractWebBrowser|close");

	}

	@Override
	public String getUrl() {
		logger.debug("AbstractWebBrowser|getUrl");
		return null;
	}

	@Override
	public void navigate(Url url) {
		logger.debug("AbstractWebBrowser|navigate: " + url.toString());

	}

	@Override
	public String getTitle() {
		logger.debug("AbstractWebBrowser|getTitle");
		return null;
	}

	@Override
	public List<AbstractWebElementInterface> findAllWebElements(Locator locator) {
		logger.debug("AbstractWebBrowser|findAllWebElements: " + locator.toString());
		return null;
	}

	@Override
	public List<AbstractWebButtonInterface> findAllWebButtons(Locator locator) {
		logger.debug("AbstractWebBrowser|findAllWebButtons: " + locator.toString());
		return null;
	}

	@Override
	public List<AbstractWebCheckBoxInterface> findAllWebCheckBoxes(Locator locator) {
		logger.debug("AbstractWebBrowser|findAllWebCheckBoxes: " + locator.toString());
		return null;
	}

	@Override
	public List<AbstractWebLinkInterface> findAllWebLinks(Locator locator) {
		logger.debug("AbstractWebBrowser|findAllWebLinks: " + locator.toString());
		return null;
	}

	@Override
	public List<AbstractWebListInterface> findAllWebLists(Locator locator) {
		logger.debug("AbstractWebBrowser|findAllWebLists: " + locator.toString());
		return null;
	}

	@Override
	public List<AbstractWebListBoxInterface> findAllWebListBoxes(Locator locator) {
		logger.debug("AbstractWebBrowser|findAllWebListBoxes: " + locator.toString());
		return null;
	}

	@Override
	public List<AbstractWebRadioButtonInterface> findAllWebRadioButtons(Locator locator) {
		logger.debug("AbstractWebBrowser|findAllWebRadioButtons: " + locator.toString());
		return null;
	}

	@Override
	public List<AbstractWebTableInterface> findAllWebTables(Locator locator) {
		logger.debug("AbstractWebBrowser|findAllWebTables: " + locator.toString());
		return null;
	}

	@Override
	public List<AbstractWebTableRowInterface> findAllWebTableRows(Locator locator) {
		logger.debug("AbstractWebBrowser|findAllWebTableRows: " + locator.toString());
		return null;
	}

	@Override
	public List<AbstractWebTextFieldInterface> findAllWebTextFields(Locator locator) {
		logger.debug("AbstractWebBrowser|findAllWebTextFields: " + locator.toString());
		return null;
	}
}
