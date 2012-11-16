package com.company.common.type.web.mock.composite;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.model.test.TestObjectInterface;
import com.company.common.model.type.AbstractWebElementInterface;
import com.company.common.model.type.composite.AbstractWebStackPanelInterface;

public class MockWebStackPanel implements AbstractWebStackPanelInterface, TestObjectInterface {

	final static Logger logger = LoggerFactory.getLogger(MockWebStackPanel.class);
	
	@Override
	public void selectStack(String item) {
		logger.debug("MockWebStackPanel|selectStack: " + item);

	}

	@Override
	public String getStackPanelBannerText(int index) {
		logger.debug("MockWebStackPanel|getStackPanelBannerText: " + index);
		return null;
	}

	@Override
	public AbstractWebElementInterface getSelectedStackPanelBannerContent() {
		logger.debug("MockWebStackPanel|getSelectedStackPanelBannerContent");
		return null;
	}

	@Override
	public AbstractWebElementInterface getSelectedStackBanner() {
		logger.debug("MockWebStackPanel|getSelectedStackBanner");
		return null;
	}

	@Override
	public AbstractWebElementInterface getStackPanelBanner(int index) {
		logger.debug("MockWebStackPanel|getStackPanelBanner: " + index);
		return null;
	}

	@Override
	public List<AbstractWebElementInterface> getAllBanners() {
		logger.debug("MockWebStackPanel|getAllBanners");
		return null;
	}

	@Override
	public List<String> getAllBannerNames() {
		logger.debug("MockWebStackPanel|getAllBannerNames");
		return null;
	}

	@Override
	public boolean exists() {
		logger.debug("MockWebStackPanel|exists");
		return false;
	}

}
