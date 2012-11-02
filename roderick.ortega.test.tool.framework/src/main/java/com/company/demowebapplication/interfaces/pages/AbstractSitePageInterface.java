package com.company.demowebapplication.interfaces.pages;

import com.company.common.interfaces.factory.AbstractGuiWebFactoryInterface;
import com.company.common.interfaces.process.DataLoadableInterface;
import com.company.common.interfaces.process.FrameableInterface;

public interface AbstractSitePageInterface extends DataLoadableInterface, FrameableInterface {
	public void setWebFactory(AbstractGuiWebFactoryInterface webFactory);
	public AbstractGuiWebFactoryInterface getWebFactory();
}
