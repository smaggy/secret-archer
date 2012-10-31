package com.company.common.interfaces.type;

import java.util.List;

import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;

public interface AbstractWebElementInterface extends TestObjectInterface, ClickableInterface, KeyableInterface {
	public List<String> getDomAttributeList();
	public String getDomAttribute(String attribute);
	public String getText();
}
