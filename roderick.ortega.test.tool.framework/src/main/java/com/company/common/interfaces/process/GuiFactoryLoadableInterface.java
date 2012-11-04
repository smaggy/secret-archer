package com.company.common.interfaces.process;

import com.company.common.interfaces.factory.AbstractGuiWebFactoryInterface;

public interface GuiFactoryLoadableInterface {
	public void setWebFactory(AbstractGuiWebFactoryInterface webFactory) throws Exception;
	public AbstractGuiWebFactoryInterface getWebFactory() throws Exception;
}
