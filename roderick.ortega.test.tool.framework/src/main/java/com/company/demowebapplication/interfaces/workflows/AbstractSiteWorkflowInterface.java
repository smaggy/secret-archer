package com.company.demowebapplication.interfaces.workflows;

import com.company.common.interfaces.action.PageBuildableInterface;
import com.company.common.interfaces.factory.AbstractGuiWebFactoryInterface;
import com.company.common.interfaces.process.DataLoadableInterface;

public interface AbstractSiteWorkflowInterface extends DataLoadableInterface, PageBuildableInterface {
	public void setWebFactory(AbstractGuiWebFactoryInterface webFactory);
	public AbstractGuiWebFactoryInterface getWebFactory();
}
