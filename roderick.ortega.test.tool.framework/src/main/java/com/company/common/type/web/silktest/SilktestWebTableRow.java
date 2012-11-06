package com.company.common.type.web.silktest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

	final static Logger logger = LoggerFactory.getLogger(SilktestWebTableRow.class);
	
	public SilktestWebTableRow(DomTableRow domTableRow, Locator locator, SilktestWebBrowser webBrowser) {
		super(domTableRow, locator, webBrowser);
	}

	@Override
	public AbstractWebElementInterface getCell(int itemIdentifierIndex) {
		logger.debug("SilktestWebTableRow|getCell: [" + itemIdentifierIndex + "]");
		DomElement domElement = ((DomTableRow) getDomElement()).getCell(itemIdentifierIndex);
		return new SilktestWebElement(domElement, new Locator(this.getLocator().getXPathLocator() + "//TD[" + itemIdentifierIndex + "]"), this.getWebBrowser());
	}

	@Override
	public int getCellCount() {
		logger.debug("SilktestWebTableRow|getCellCount");
		return ((DomTableRow) getDomElement()).getCellCount();
	}

	@Override
	public int getIndex() {
		logger.debug("SilktestWebTableRow|getIndex");
		return ((DomTableRow) getDomElement()).getIndex();
	}

}
