package com.company.common.model.process;

import com.company.common.model.factory.AbstractGuiWebFactoryInterface;

public interface GuiFactoryLoadableInterface {
	public void setWebFactory(AbstractGuiWebFactoryInterface webFactory) throws Exception;
	public AbstractGuiWebFactoryInterface getWebFactory() throws Exception;
}
