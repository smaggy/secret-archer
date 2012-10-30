package com.company.common.type.web.silktest.composite;

import java.util.List;

import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebElementInterface;
import com.company.common.interfaces.type.composite.AbstractWebStackPanelInterface;

public class SilktestWebStackPanel implements AbstractWebStackPanelInterface, TestObjectInterface {

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

	@Override
	public boolean exists() {
		// TODO Auto-generated method stub
		return false;
	}

}
