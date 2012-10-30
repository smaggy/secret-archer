package com.company.common.type.web.generics.composite;

import java.util.List;

import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebElementInterface;
import com.company.common.interfaces.type.composite.AbstractWebStackPanelInterface;

public class GenericWebStackPanel implements AbstractWebStackPanelInterface, TestObjectInterface {

	@Override
	public void selectStack(String item) {
		System.out.println("GenericWebStackPanel|selectStack: " + item);

	}

	@Override
	public String getStackPanelBannerText(int index) {
		System.out.println("GenericWebStackPanel|getStackPanelBannerText: " + index);
		return null;
	}

	@Override
	public AbstractWebElementInterface getSelectedStackPanelBannerContent() {
		System.out.println("GenericWebStackPanel|getSelectedStackPanelBannerContent");
		return null;
	}

	@Override
	public AbstractWebElementInterface getSelectedStackBanner() {
		System.out.println("GenericWebStackPanel|getSelectedStackBanner");
		return null;
	}

	@Override
	public AbstractWebElementInterface getStackPanelBanner(int index) {
		System.out.println("GenericWebStackPanel|getStackPanelBanner: " + index);
		return null;
	}

	@Override
	public List<AbstractWebElementInterface> getAllBanners() {
		System.out.println("GenericWebStackPanel|getAllBanners");
		return null;
	}

	@Override
	public List<String> getAllBannerNames() {
		System.out.println("GenericWebStackPanel|getAllBannerNames");
		return null;
	}

	@Override
	public boolean exists() {
		// TODO Auto-generated method stub
		return false;
	}

}
