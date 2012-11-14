package com.company.demowebapplication.interfaces.workflows;

import com.company.common.model.action.PageBuildableInterface;
import com.company.common.model.factory.AbstractGuiWebFactoryInterface;
import com.company.common.model.process.DataLoadableInterface;

public interface AbstractSiteWorkflowInterface extends DataLoadableInterface, PageBuildableInterface {
	public void setWebFactory(AbstractGuiWebFactoryInterface webFactory);
	public AbstractGuiWebFactoryInterface getWebFactory();
}
