package com.company.common.interfaces.type;

import org.openqa.selenium.WebElement;

import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;

public interface AbstractSeleniumWebElementInterface extends AbstractWebElementInterface, TestObjectInterface, ClickableInterface, KeyableInterface {
	public WebElement getWebElement(); 
}
