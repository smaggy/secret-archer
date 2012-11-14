package com.company.common.type.web.abstracts;

import com.company.common.model.action.ClickableInterface;
import com.company.common.model.action.KeyableInterface;
import com.company.common.model.test.TestObjectInterface;
import com.company.common.model.type.AbstractWebLinkInterface;

public abstract class AbstractWebLink extends AbstractWebElement implements AbstractWebLinkInterface, ClickableInterface, KeyableInterface, TestObjectInterface {

	@Override
	public void select() {
		// TODO Auto-generated method stub

	}

}
