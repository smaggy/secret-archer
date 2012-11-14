package com.company.application2.type.web.silktest.composite;

import java.util.List;

import com.company.application2.type.web.silktest.SilktestWebElement;
import com.company.common.model.test.TestObjectInterface;
import com.company.common.model.type.AbstractWebElementInterface;
import com.company.common.model.type.composite.AbstractWebStackPanelInterface;

public class SilktestWebStackPanel extends SilktestWebElement implements TestObjectInterface, AbstractWebStackPanelInterface {

	@Override
	public void selectStack(String item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getStackPanelBannerText(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AbstractWebElementInterface getSelectedStackPanelBannerContent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AbstractWebElementInterface getSelectedStackBanner() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AbstractWebElementInterface getStackPanelBanner(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AbstractWebElementInterface> getAllBanners() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getAllBannerNames() {
		// TODO Auto-generated method stub
		return null;
	}

}
