package com.company.common.browser;

import java.util.ArrayList;
import java.util.List;

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

	@Override
	public void close() {
		System.out.println("GenericWebBrowser|close");

	}

	@Override
	public String getUrl() {
		System.out.println("GenericWebBrowser|getUrl");
		return "http://www.google.com/";
	}

	@Override
	public void navigate(Url url) {
		System.out.println("GenericWebBrowser|navigate: " + url.toString());

	}

	@Override
	public String getTitle() {
		System.out.println("GenericWebBrowser|getTitle");
		return "Application Title";
	}

	@Override
	public AbstractWebElementInterface findWebElement(Locator locator) {
		System.out.println("GenericWebBrowser|findWebElement: " + locator.toString());
		return new GenericWebElement();
	}

	@Override
	public AbstractWebButtonInterface findWebButton(Locator locator) {
		System.out.println("GenericWebBrowser|findWebButton: " + locator.toString());
		return new GenericWebButton();
	}
	
	@Override
	public AbstractWebCheckBoxInterface findWebCheckBox(Locator locator) {
		System.out.println("GenericWebBrowser|findWebButton: " + locator.toString());
		return new GenericWebCheckBox();
	}

	@Override
	public AbstractWebLinkInterface findWebLink(Locator locator) {
		System.out.println("GenericWebBrowser|findWebLink: " + locator.toString());
		return new GenericWebLink();
	}

	@Override
	public AbstractWebListInterface findWebList(Locator locator) {
		System.out.println("GenericWebBrowser|findWebList: " + locator.toString());
		return new GenericWebList();
	}

	@Override
	public AbstractWebListBoxInterface findWebListBox(Locator locator) {
		System.out.println("GenericWebBrowser|findWebListBox: " + locator.toString());
		return new GenericWebListBox();
	}

	@Override
	public AbstractWebRadioButtonInterface findWebRadioButton(Locator locator) {
		System.out.println("GenericWebBrowser|findWebRadioButton: " + locator.toString());
		return new GenericWebRadioButton();
	}

	@Override
	public AbstractWebTableInterface findWebTable(Locator locator) {
		System.out.println("GenericWebBrowser|findWebTable: " + locator.toString());
		return new GenericWebTable();
	}

	@Override
	public AbstractWebTableRowInterface findWebTableRow(Locator locator) {
		System.out.println("GenericWebBrowser|findWebTableRow: " + locator.toString());
		return new GenericWebTableRow();
	}

	@Override
	public AbstractWebTextFieldInterface findWebTextField(Locator locator) {
		System.out.println("GenericWebBrowser|findWebTextField: " + locator.toString());
		return new GenericWebTextField();
	}

	@Override
	public List<AbstractWebElementInterface> findAllWebElements(Locator locator) {
		System.out.println("GenericWebBrowser|findAllWebElements: " + locator.toString());
		List<AbstractWebElementInterface> elements = new ArrayList<AbstractWebElementInterface>();
		elements.add(new GenericWebElement());
		elements.add(new GenericWebElement());
		return elements;
	}

	@Override
	public List<AbstractWebButtonInterface> findAllWebButtons(Locator locator) {
		System.out.println("GenericWebBrowser|findAllWebButtons: " + locator.toString());
		List<AbstractWebButtonInterface> b = new ArrayList<AbstractWebButtonInterface>();
		b.add(new GenericWebButton());
		b.add(new GenericWebButton());
		return b;
	}

	@Override
	public List<AbstractWebCheckBoxInterface> findAllWebCheckBoxes(Locator locator) {
		System.out.println("GenericWebBrowser|findAllWebCheckBoxes: " + locator.toString());
		List<AbstractWebCheckBoxInterface> c = new ArrayList<AbstractWebCheckBoxInterface>();
		c.add(new GenericWebCheckBox());
		c.add(new GenericWebCheckBox());
		return c;
	}

	@Override
	public List<AbstractWebLinkInterface> findAllWebLinks(Locator locator) {
		System.out.println("GenericWebBrowser|findAllWebLinks: " + locator.toString());
		List<AbstractWebLinkInterface> l = new ArrayList<AbstractWebLinkInterface>();
		l.add(new GenericWebLink());
		l.add(new GenericWebLink());
		return l;
	}

	@Override
	public List<AbstractWebListInterface> findAllWebLists(Locator locator) {
		System.out.println("GenericWebBrowser|findAllWebLists: " + locator.toString());
		List<AbstractWebListInterface> l = new ArrayList<AbstractWebListInterface>();
		l.add(new GenericWebList());
		l.add(new GenericWebList());
		return l;
	}

	@Override
	public List<AbstractWebListBoxInterface> findAllWebListBoxes(Locator locator) {
		System.out.println("GenericWebBrowser|findAllWebListBoxes: " + locator.toString());
		List<AbstractWebListBoxInterface> l = new ArrayList<AbstractWebListBoxInterface>();
		l.add(new GenericWebListBox());
		l.add(new GenericWebListBox());
		return l;
	}

	@Override
	public List<AbstractWebRadioButtonInterface> findAllWebRadioButtons(Locator locator) {
		System.out.println("GenericWebBrowser|findAllWebRadioButtons: " + locator.toString());
		List<AbstractWebRadioButtonInterface> rb = new ArrayList<AbstractWebRadioButtonInterface>();
		rb.add(new GenericWebRadioButton());
		rb.add(new GenericWebRadioButton());
		return rb;
	}

	@Override
	public List<AbstractWebTableInterface> findAllWebTables(Locator locator) {
		System.out.println("GenericWebBrowser|findAllWebTables: " + locator.toString());
		List<AbstractWebTableInterface> wt = new ArrayList<AbstractWebTableInterface>();
		wt.add(new GenericWebTable());
		wt.add(new GenericWebTable());
		return wt;
	}

	@Override
	public List<AbstractWebTableRowInterface> findAllWebTableRows(Locator locator) {
		System.out.println("GenericWebBrowser|findAllWebTableRows: " + locator.toString());
		List<AbstractWebTableRowInterface> tr = new ArrayList<AbstractWebTableRowInterface>();
		tr.add(new GenericWebTableRow());
		tr.add(new GenericWebTableRow());
		return tr;
	}

	@Override
	public List<AbstractWebTextFieldInterface> findAllWebTextFields(Locator locator) {
		System.out.println("GenericWebBrowser|findAllWebTextFields: " + locator.toString());
		List<AbstractWebTextFieldInterface> tf = new ArrayList<AbstractWebTextFieldInterface>();
		tf.add(new GenericWebTextField());
		tf.add(new GenericWebTextField());
		return tf;
	}
}
