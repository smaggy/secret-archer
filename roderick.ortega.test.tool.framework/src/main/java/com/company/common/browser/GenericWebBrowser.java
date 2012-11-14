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
import com.company.common.type.web.generics.GenericWebButton;
import com.company.common.type.web.generics.GenericWebCheckBox;
import com.company.common.type.web.generics.GenericWebElement;
import com.company.common.type.web.generics.GenericWebLink;
import com.company.common.type.web.generics.GenericWebList;
import com.company.common.type.web.generics.GenericWebListBox;
import com.company.common.type.web.generics.GenericWebRadioButton;
import com.company.common.type.web.generics.GenericWebTable;
import com.company.common.type.web.generics.GenericWebTableRow;
import com.company.common.type.web.generics.GenericWebTextField;
import com.company.common.types.Locator;
import com.company.common.types.Url;

public class GenericWebBrowser extends AbstractWebBrowser implements AbstractWebBrowserInterface, FindableInterface {

	final static Logger logger = LoggerFactory.getLogger(GenericWebBrowser.class);
	
	@Override
	public void close() {
		logger.debug("GenericWebBrowser|close");

	}

	@Override
	public String getUrl() {
		logger.debug("GenericWebBrowser|getUrl");
		return "http://www.google.com/";
	}

	@Override
	public void navigate(Url url) {
		logger.debug("GenericWebBrowser|navigate: " + url.toString());

	}

	@Override
	public String getTitle() {
		logger.debug("GenericWebBrowser|getTitle");
		return "Application Title";
	}

	@Override
	public AbstractWebElementInterface findWebElement(Locator locator) {
		logger.debug("GenericWebBrowser|findWebElement: " + locator.toString());
		return new GenericWebElement();
	}

	@Override
	public AbstractWebButtonInterface findWebButton(Locator locator) {
		logger.debug("GenericWebBrowser|findWebButton: " + locator.toString());
		return new GenericWebButton();
	}
	
	@Override
	public AbstractWebCheckBoxInterface findWebCheckBox(Locator locator) {
		logger.debug("GenericWebBrowser|findWebButton: " + locator.toString());
		return new GenericWebCheckBox();
	}

	@Override
	public AbstractWebLinkInterface findWebLink(Locator locator) {
		logger.debug("GenericWebBrowser|findWebLink: " + locator.toString());
		return new GenericWebLink();
	}

	@Override
	public AbstractWebListInterface findWebList(Locator locator) {
		logger.debug("GenericWebBrowser|findWebList: " + locator.toString());
		return new GenericWebList();
	}

	@Override
	public AbstractWebListBoxInterface findWebListBox(Locator locator) {
		logger.debug("GenericWebBrowser|findWebListBox: " + locator.toString());
		return new GenericWebListBox();
	}

	@Override
	public AbstractWebRadioButtonInterface findWebRadioButton(Locator locator) {
		logger.debug("GenericWebBrowser|findWebRadioButton: " + locator.toString());
		return new GenericWebRadioButton();
	}

	@Override
	public AbstractWebTableInterface findWebTable(Locator locator) {
		logger.debug("GenericWebBrowser|findWebTable: " + locator.toString());
		return new GenericWebTable();
	}

	@Override
	public AbstractWebTableRowInterface findWebTableRow(Locator locator) {
		logger.debug("GenericWebBrowser|findWebTableRow: " + locator.toString());
		return new GenericWebTableRow();
	}

	@Override
	public AbstractWebTextFieldInterface findWebTextField(Locator locator) {
		logger.debug("GenericWebBrowser|findWebTextField: " + locator.toString());
		return new GenericWebTextField();
	}

	@Override
	public List<AbstractWebElementInterface> findAllWebElements(Locator locator) {
		logger.debug("GenericWebBrowser|findAllWebElements: " + locator.toString());
		List<AbstractWebElementInterface> elements = new ArrayList<AbstractWebElementInterface>();
		elements.add(new GenericWebElement());
		elements.add(new GenericWebElement());
		return elements;
	}

	@Override
	public List<AbstractWebButtonInterface> findAllWebButtons(Locator locator) {
		logger.debug("GenericWebBrowser|findAllWebButtons: " + locator.toString());
		List<AbstractWebButtonInterface> b = new ArrayList<AbstractWebButtonInterface>();
		b.add(new GenericWebButton());
		b.add(new GenericWebButton());
		return b;
	}

	@Override
	public List<AbstractWebCheckBoxInterface> findAllWebCheckBoxes(Locator locator) {
		logger.debug("GenericWebBrowser|findAllWebCheckBoxes: " + locator.toString());
		List<AbstractWebCheckBoxInterface> c = new ArrayList<AbstractWebCheckBoxInterface>();
		c.add(new GenericWebCheckBox());
		c.add(new GenericWebCheckBox());
		return c;
	}

	@Override
	public List<AbstractWebLinkInterface> findAllWebLinks(Locator locator) {
		logger.debug("GenericWebBrowser|findAllWebLinks: " + locator.toString());
		List<AbstractWebLinkInterface> l = new ArrayList<AbstractWebLinkInterface>();
		l.add(new GenericWebLink());
		l.add(new GenericWebLink());
		return l;
	}

	@Override
	public List<AbstractWebListInterface> findAllWebLists(Locator locator) {
		logger.debug("GenericWebBrowser|findAllWebLists: " + locator.toString());
		List<AbstractWebListInterface> l = new ArrayList<AbstractWebListInterface>();
		l.add(new GenericWebList());
		l.add(new GenericWebList());
		return l;
	}

	@Override
	public List<AbstractWebListBoxInterface> findAllWebListBoxes(Locator locator) {
		logger.debug("GenericWebBrowser|findAllWebListBoxes: " + locator.toString());
		List<AbstractWebListBoxInterface> l = new ArrayList<AbstractWebListBoxInterface>();
		l.add(new GenericWebListBox());
		l.add(new GenericWebListBox());
		return l;
	}

	@Override
	public List<AbstractWebRadioButtonInterface> findAllWebRadioButtons(Locator locator) {
		logger.debug("GenericWebBrowser|findAllWebRadioButtons: " + locator.toString());
		List<AbstractWebRadioButtonInterface> rb = new ArrayList<AbstractWebRadioButtonInterface>();
		rb.add(new GenericWebRadioButton());
		rb.add(new GenericWebRadioButton());
		return rb;
	}

	@Override
	public List<AbstractWebTableInterface> findAllWebTables(Locator locator) {
		logger.debug("GenericWebBrowser|findAllWebTables: " + locator.toString());
		List<AbstractWebTableInterface> wt = new ArrayList<AbstractWebTableInterface>();
		wt.add(new GenericWebTable());
		wt.add(new GenericWebTable());
		return wt;
	}

	@Override
	public List<AbstractWebTableRowInterface> findAllWebTableRows(Locator locator) {
		logger.debug("GenericWebBrowser|findAllWebTableRows: " + locator.toString());
		List<AbstractWebTableRowInterface> tr = new ArrayList<AbstractWebTableRowInterface>();
		tr.add(new GenericWebTableRow());
		tr.add(new GenericWebTableRow());
		return tr;
	}

	@Override
	public List<AbstractWebTextFieldInterface> findAllWebTextFields(Locator locator) {
		logger.debug("GenericWebBrowser|findAllWebTextFields: " + locator.toString());
		List<AbstractWebTextFieldInterface> tf = new ArrayList<AbstractWebTextFieldInterface>();
		tf.add(new GenericWebTextField());
		tf.add(new GenericWebTextField());
		return tf;
	}
}
