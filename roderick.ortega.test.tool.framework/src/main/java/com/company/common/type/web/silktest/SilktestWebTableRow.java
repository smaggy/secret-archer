package com.company.common.type.web.silktest;

import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomTableRow;
import com.company.common.browser.SilktestWebBrowser;
import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebElementInterface;
import com.company.common.interfaces.type.AbstractWebTableRowInterface;
import com.company.common.types.Locator;

public class SilktestWebTableRow extends SilktestWebElement implements AbstractWebTableRowInterface, TestObjectInterface, ClickableInterface, KeyableInterface {

	public SilktestWebTableRow(DomTableRow domTableRow, Locator locator, SilktestWebBrowser webBrowser) {
		super(domTableRow, locator, webBrowser);
	}

	@Override
	public AbstractWebElementInterface getCell(int itemIdentifierIndex) {
		System.out.println("SilktestWebTableRow|getCell: [" + itemIdentifierIndex + "]");
		DomElement domElement = ((DomTableRow) getDomElement()).getCell(itemIdentifierIndex);
		return new SilktestWebElement(domElement, new Locator(this.getLocator().getXPathLocator() + "//TD[" + itemIdentifierIndex + "]"), this.getWebBrowser());
	}

	@Override
	public int getCellCount() {
		System.out.println("SilktestWebTableRow|getCellCount");
		return ((DomTableRow) getDomElement()).getCellCount();
	}

	@Override
	public int getIndex() {
		System.out.println("SilktestWebTableRow|getIndex");
		return ((DomTableRow) getDomElement()).getIndex();
	}

}
