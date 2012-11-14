package com.company.demowebapplication.interfaces.pages;

import com.company.common.model.factory.AbstractGuiWebFactoryInterface;
import com.company.common.model.process.DataLoadableInterface;
import com.company.common.model.process.FrameableInterface;

public interface AbstractSitePageInterface extends DataLoadableInterface, FrameableInterface {
	public void setWebFactory(AbstractGuiWebFactoryInterface webFactory);
	public AbstractGuiWebFactoryInterface getWebFactory();
}
