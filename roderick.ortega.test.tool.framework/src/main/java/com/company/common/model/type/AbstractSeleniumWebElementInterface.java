package com.company.common.model.type;

import org.openqa.selenium.WebElement;

import com.company.common.model.action.ClickableInterface;
import com.company.common.model.action.KeyableInterface;
import com.company.common.model.test.TestObjectInterface;

public interface AbstractSeleniumWebElementInterface extends AbstractWebElementInterface, TestObjectInterface, ClickableInterface, KeyableInterface {
	public WebElement getWebElement(); 
}
