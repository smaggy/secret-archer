package com.company.common.type.web.generics.composite;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebElementInterface;
import com.company.common.interfaces.type.composite.AbstractWebStackPanelInterface;

public class GenericWebStackPanel implements AbstractWebStackPanelInterface, TestObjectInterface {

	final static Logger logger = LoggerFactory.getLogger(GenericWebStackPanel.class);
	
	@Override
	public void selectStack(String item) {
		logger.debug("GenericWebStackPanel|selectStack: " + item);

	}

	@Override
	public String getStackPanelBannerText(int index) {
		logger.debug("GenericWebStackPanel|getStackPanelBannerText: " + index);
		return null;
	}

	@Override
	public AbstractWebElementInterface getSelectedStackPanelBannerContent() {
		logger.debug("GenericWebStackPanel|getSelectedStackPanelBannerContent");
		return null;
	}

	@Override
	public AbstractWebElementInterface getSelectedStackBanner() {
		logger.debug("GenericWebStackPanel|getSelectedStackBanner");
		return null;
	}

	@Override
	public AbstractWebElementInterface getStackPanelBanner(int index) {
		logger.debug("GenericWebStackPanel|getStackPanelBanner: " + index);
		return null;
	}

	@Override
	public List<AbstractWebElementInterface> getAllBanners() {
		logger.debug("GenericWebStackPanel|getAllBanners");
		return null;
	}

	@Override
	public List<String> getAllBannerNames() {
		logger.debug("GenericWebStackPanel|getAllBannerNames");
		return null;
	}

	@Override
	public boolean exists() {
		logger.debug("GenericWebStackPanel|exists");
		return false;
	}

}
