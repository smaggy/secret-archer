package com.company.common.model.type.composite;

import java.util.List;

import com.company.common.model.type.AbstractWebElementInterface;

public interface AbstractWebStackPanelInterface {
	public void selectStack(String item);
	public String getStackPanelBannerText(int index);
	public AbstractWebElementInterface getSelectedStackPanelBannerContent();
	public AbstractWebElementInterface getSelectedStackBanner();
	public AbstractWebElementInterface getStackPanelBanner(int index);
	public List<AbstractWebElementInterface> getAllBanners();
	public List<String> getAllBannerNames();
}
