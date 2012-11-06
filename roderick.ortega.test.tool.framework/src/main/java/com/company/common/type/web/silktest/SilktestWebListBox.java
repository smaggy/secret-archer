package com.company.common.type.web.silktest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.borland.silktest.jtf.xbrowser.DomListBox;
import com.company.common.browser.SilktestWebBrowser;
import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebListBoxInterface;
import com.company.common.types.Locator;

public class SilktestWebListBox extends SilktestWebElement implements AbstractWebListBoxInterface, TestObjectInterface, ClickableInterface, KeyableInterface {

	final static Logger logger = LoggerFactory.getLogger(SilktestWebListBox.class);
	
	public SilktestWebListBox(DomListBox domListBox, Locator locator, SilktestWebBrowser webBrowser) {
		super(domListBox, locator, webBrowser);
	}
	
	@Override
	public int getItemCount() {
		logger.debug("SilktestWebListBox|getItemCount");
		return ((DomListBox) getDomElement()).getItemCount();
	}

	@Override
	public void select(int itemIndex) {
		logger.debug("SilktestWebListBox|select: [" + itemIndex + "]");
		((DomListBox) getDomElement()).select(itemIndex);
	}

	@Override
	public void select(String itemText) {
		logger.debug("SilktestWebListBox|select: [" + itemText + "]");
		((DomListBox) getDomElement()).select(itemText);
	}

}
