package com.company.common.browser;

import java.util.ArrayList;
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
import com.company.common.type.web.abstracts.factory.AbstractWebBrowser;
import com.company.common.type.web.mock.MockWebButton;
import com.company.common.type.web.mock.MockWebCheckBox;
import com.company.common.type.web.mock.MockWebElement;
import com.company.common.type.web.mock.MockWebLink;
import com.company.common.type.web.mock.MockWebList;
import com.company.common.type.web.mock.MockWebListBox;
import com.company.common.type.web.mock.MockWebRadioButton;
import com.company.common.type.web.mock.MockWebTable;
import com.company.common.type.web.mock.MockWebTableRow;
import com.company.common.type.web.mock.MockWebTextField;
import com.company.common.types.Locator;
import com.company.common.types.Url;

public class MockWebBrowser extends AbstractWebBrowser implements AbstractWebBrowserInterface, FindableInterface {

	final static Logger logger = LoggerFactory.getLogger(MockWebBrowser.class);
	
	@Override
	public void close() {
		logger.debug("MockWebBrowser|close");

	}

	@Override
	public String getUrl() {
		logger.debug("MockWebBrowser|getUrl");
		return "http://www.google.com/";
	}

	@Override
	public void navigate(Url url) {
		logger.debug("MockWebBrowser|navigate: " + url.toString());

	}

	@Override
	public String getTitle() {
		logger.debug("MockWebBrowser|getTitle");
		return "Application Title";
	}

	@Override
	public AbstractWebElementInterface findWebElement(Locator locator) {
		logger.debug("MockWebBrowser|findWebElement: " + locator.toString());
		return new MockWebElement();
	}

	@Override
	public AbstractWebButtonInterface findWebButton(Locator locator) {
		logger.debug("MockWebBrowser|findWebButton: " + locator.toString());
		return new MockWebButton();
	}
	
	@Override
	public AbstractWebCheckBoxInterface findWebCheckBox(Locator locator) {
		logger.debug("MockWebBrowser|findWebButton: " + locator.toString());
		return new MockWebCheckBox();
	}

	@Override
	public AbstractWebLinkInterface findWebLink(Locator locator) {
		logger.debug("MockWebBrowser|findWebLink: " + locator.toString());
		return new MockWebLink();
	}

	@Override
	public AbstractWebListInterface findWebList(Locator locator) {
		logger.debug("MockWebBrowser|findWebList: " + locator.toString());
		return new MockWebList();
	}

	@Override
	public AbstractWebListBoxInterface findWebListBox(Locator locator) {
		logger.debug("MockWebBrowser|findWebListBox: " + locator.toString());
		return new MockWebListBox();
	}

	@Override
	public AbstractWebRadioButtonInterface findWebRadioButton(Locator locator) {
		logger.debug("MockWebBrowser|findWebRadioButton: " + locator.toString());
		return new MockWebRadioButton();
	}

	@Override
	public AbstractWebTableInterface findWebTable(Locator locator) {
		logger.debug("MockWebBrowser|findWebTable: " + locator.toString());
		return new MockWebTable();
	}

	@Override
	public AbstractWebTableRowInterface findWebTableRow(Locator locator) {
		logger.debug("MockWebBrowser|findWebTableRow: " + locator.toString());
		return new MockWebTableRow();
	}

	@Override
	public AbstractWebTextFieldInterface findWebTextField(Locator locator) {
		logger.debug("MockWebBrowser|findWebTextField: " + locator.toString());
		return new MockWebTextField();
	}

	@Override
	public List<AbstractWebElementInterface> findAllWebElements(Locator locator) {
		logger.debug("MockWebBrowser|findAllWebElements: " + locator.toString());
		List<AbstractWebElementInterface> elements = new ArrayList<AbstractWebElementInterface>();
		elements.add(new MockWebElement());
		elements.add(new MockWebElement());
		return elements;
	}

	@Override
	public List<AbstractWebButtonInterface> findAllWebButtons(Locator locator) {
		logger.debug("MockWebBrowser|findAllWebButtons: " + locator.toString());
		List<AbstractWebButtonInterface> b = new ArrayList<AbstractWebButtonInterface>();
		b.add(new MockWebButton());
		b.add(new MockWebButton());
		return b;
	}

	@Override
	public List<AbstractWebCheckBoxInterface> findAllWebCheckBoxes(Locator locator) {
		logger.debug("MockWebBrowser|findAllWebCheckBoxes: " + locator.toString());
		List<AbstractWebCheckBoxInterface> c = new ArrayList<AbstractWebCheckBoxInterface>();
		c.add(new MockWebCheckBox());
		c.add(new MockWebCheckBox());
		return c;
	}

	@Override
	public List<AbstractWebLinkInterface> findAllWebLinks(Locator locator) {
		logger.debug("MockWebBrowser|findAllWebLinks: " + locator.toString());
		List<AbstractWebLinkInterface> l = new ArrayList<AbstractWebLinkInterface>();
		l.add(new MockWebLink());
		l.add(new MockWebLink());
		return l;
	}

	@Override
	public List<AbstractWebListInterface> findAllWebLists(Locator locator) {
		logger.debug("MockWebBrowser|findAllWebLists: " + locator.toString());
		List<AbstractWebListInterface> l = new ArrayList<AbstractWebListInterface>();
		l.add(new MockWebList());
		l.add(new MockWebList());
		return l;
	}

	@Override
	public List<AbstractWebListBoxInterface> findAllWebListBoxes(Locator locator) {
		logger.debug("MockWebBrowser|findAllWebListBoxes: " + locator.toString());
		List<AbstractWebListBoxInterface> l = new ArrayList<AbstractWebListBoxInterface>();
		l.add(new MockWebListBox());
		l.add(new MockWebListBox());
		return l;
	}

	@Override
	public List<AbstractWebRadioButtonInterface> findAllWebRadioButtons(Locator locator) {
		logger.debug("MockWebBrowser|findAllWebRadioButtons: " + locator.toString());
		List<AbstractWebRadioButtonInterface> rb = new ArrayList<AbstractWebRadioButtonInterface>();
		rb.add(new MockWebRadioButton());
		rb.add(new MockWebRadioButton());
		return rb;
	}

	@Override
	public List<AbstractWebTableInterface> findAllWebTables(Locator locator) {
		logger.debug("MockWebBrowser|findAllWebTables: " + locator.toString());
		List<AbstractWebTableInterface> wt = new ArrayList<AbstractWebTableInterface>();
		wt.add(new MockWebTable());
		wt.add(new MockWebTable());
		return wt;
	}

	@Override
	public List<AbstractWebTableRowInterface> findAllWebTableRows(Locator locator) {
		logger.debug("MockWebBrowser|findAllWebTableRows: " + locator.toString());
		List<AbstractWebTableRowInterface> tr = new ArrayList<AbstractWebTableRowInterface>();
		tr.add(new MockWebTableRow());
		tr.add(new MockWebTableRow());
		return tr;
	}

	@Override
	public List<AbstractWebTextFieldInterface> findAllWebTextFields(Locator locator) {
		logger.debug("MockWebBrowser|findAllWebTextFields: " + locator.toString());
		List<AbstractWebTextFieldInterface> tf = new ArrayList<AbstractWebTextFieldInterface>();
		tf.add(new MockWebTextField());
		tf.add(new MockWebTextField());
		return tf;
	}
}
