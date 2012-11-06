package com.company.common.type.web.silktest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.borland.silktest.jtf.xbrowser.DomRadioButton;
import com.company.common.browser.SilktestWebBrowser;
import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebRadioButtonInterface;
import com.company.common.types.Locator;

public class SilktestWebRadioButton extends SilktestWebElement implements AbstractWebRadioButtonInterface, TestObjectInterface, ClickableInterface, KeyableInterface {

	final static Logger logger = LoggerFactory.getLogger(SilktestWebRadioButton.class);
	
	public SilktestWebRadioButton(DomRadioButton domRadioButton, Locator locator, SilktestWebBrowser webBrowser) {
		super(domRadioButton, locator, webBrowser);
	}
	
	@Override
	public boolean isSelected() {
		logger.debug("SilktestWebRadioButton|isSelected");
		return ((DomRadioButton) getDomElement()).isSelected();
	}

	@Override
	public void select() {
		logger.debug("SilktestWebRadioButton|select");
		((DomRadioButton) getDomElement()).select();
	}

}
