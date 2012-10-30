package com.company.common.type.web.abstracts.factory;

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
import com.company.common.types.Locator;
import com.company.common.types.Url;

public abstract class AbstractWebBrowser implements AbstractWebBrowserInterface, FindableInterface {
	
	@Override
	public AbstractWebElementInterface findWebElement(Locator locator) {
		System.out.println("AbstractWebBrowser|findWebElement: " + locator.toString());
		return null;
	}

	@Override
	public AbstractWebButtonInterface findWebButton(Locator locator) {
		System.out.println("AbstractWebBrowser|findWebButton: " + locator.toString());
		return null;
	}
	
	@Override
	public AbstractWebCheckBoxInterface findWebCheckBox(Locator locator) {
		System.out.println("AbstractWebBrowser|findWebCheckBox: " + locator.toString());
		return null;
	}

	@Override
	public AbstractWebLinkInterface findWebLink(Locator locator) {
		System.out.println("AbstractWebBrowser|findWebLink: " + locator.toString());
		return null;
	}

	@Override
	public AbstractWebListInterface findWebList(Locator locator) {
		System.out.println("AbstractWebBrowser|findWebList: " + locator.toString());
		return null;
	}

	@Override
	public AbstractWebListBoxInterface findWebListBox(Locator locator) {
		System.out.println("AbstractWebBrowser|findWebListBox: " + locator.toString());
		return null;
	}

	@Override
	public AbstractWebRadioButtonInterface findWebRadioButton(Locator locator) {
		System.out.println("AbstractWebBrowser|findWebRadioButton: " + locator.toString());
		return null;
	}

	@Override
	public AbstractWebTableInterface findWebTable(Locator locator) {
		System.out.println("AbstractWebBrowser|findWebTable: " + locator.toString());
		return null;
	}

	@Override
	public AbstractWebTableRowInterface findWebTableRow(Locator locator) {
		System.out.println("AbstractWebBrowser|findWebTableRow: " + locator.toString());
		return null;
	}

	@Override
	public AbstractWebTextFieldInterface findWebTextField(Locator locator) {
		System.out.println("AbstractWebBrowser|findWebTextField: " + locator.toString());
		return null;
	}

	@Override
	public void close() {
		System.out.println("AbstractWebBrowser|close");

	}

	@Override
	public String getUrl() {
		System.out.println("AbstractWebBrowser|getUrl");
		return null;
	}

	@Override
	public void navigate(Url url) {
		System.out.println("AbstractWebBrowser|navigate: " + url.toString());

	}

	@Override
	public String getTitle() {
		System.out.println("AbstractWebBrowser|getTitle");
		return null;
	}

	@Override
	public List<AbstractWebElementInterface> findAllWebElements(Locator locator) {
		System.out.println("AbstractWebBrowser|findAllWebElements: " + locator.toString());
		return null;
	}

	@Override
	public List<AbstractWebButtonInterface> findAllWebButtons(Locator locator) {
		System.out.println("AbstractWebBrowser|findAllWebButtons: " + locator.toString());
		return null;
	}

	@Override
	public List<AbstractWebCheckBoxInterface> findAllWebCheckBoxes(Locator locator) {
		System.out.println("AbstractWebBrowser|findAllWebCheckBoxes: " + locator.toString());
		return null;
	}

	@Override
	public List<AbstractWebLinkInterface> findAllWebLinks(Locator locator) {
		System.out.println("AbstractWebBrowser|findAllWebLinks: " + locator.toString());
		return null;
	}

	@Override
	public List<AbstractWebListInterface> findAllWebLists(Locator locator) {
		System.out.println("AbstractWebBrowser|findAllWebLists: " + locator.toString());
		return null;
	}

	@Override
	public List<AbstractWebListBoxInterface> findAllWebListBoxes(Locator locator) {
		System.out.println("AbstractWebBrowser|findAllWebListBoxes: " + locator.toString());
		return null;
	}

	@Override
	public List<AbstractWebRadioButtonInterface> findAllWebRadioButtons(Locator locator) {
		System.out.println("AbstractWebBrowser|findAllWebRadioButtons: " + locator.toString());
		return null;
	}

	@Override
	public List<AbstractWebTableInterface> findAllWebTables(Locator locator) {
		System.out.println("AbstractWebBrowser|findAllWebTables: " + locator.toString());
		return null;
	}

	@Override
	public List<AbstractWebTableRowInterface> findAllWebTableRows(Locator locator) {
		System.out.println("AbstractWebBrowser|findAllWebTableRows: " + locator.toString());
		return null;
	}

	@Override
	public List<AbstractWebTextFieldInterface> findAllWebTextFields(Locator locator) {
		System.out.println("AbstractWebBrowser|findAllWebTextFields: " + locator.toString());
		return null;
	}
}
