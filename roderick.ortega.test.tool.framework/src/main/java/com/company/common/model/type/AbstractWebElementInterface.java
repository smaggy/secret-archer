package com.company.common.model.type;

import java.util.List;

import com.company.common.model.action.ClickableInterface;
import com.company.common.model.action.KeyableInterface;
import com.company.common.model.test.TestObjectInterface;

public interface AbstractWebElementInterface extends TestObjectInterface, ClickableInterface, KeyableInterface {
	public List<String> getDomAttributeList();
	public String getDomAttribute(String attribute);
	public String getText();
}
