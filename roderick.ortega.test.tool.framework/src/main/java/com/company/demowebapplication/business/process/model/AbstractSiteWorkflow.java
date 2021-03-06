package com.company.demowebapplication.business.process.model;

import com.company.common.model.action.PageBuildableInterface;
import com.company.common.model.factory.AbstractGuiWebFactoryInterface;
import com.company.common.model.process.DataLoadableInterface;
import com.company.demowebapplication.data.DataTransferObject;
import com.company.demowebapplication.interfaces.workflows.AbstractSiteWorkflowInterface;

public abstract class AbstractSiteWorkflow implements AbstractSiteWorkflowInterface, DataLoadableInterface, PageBuildableInterface {

	private DataTransferObject dataTransferObject;
	private AbstractGuiWebFactoryInterface webFactory;
	
	public AbstractSiteWorkflow(AbstractGuiWebFactoryInterface webFactory) {
		this.webFactory = webFactory;
	}
	
	@Override
	public void setDto(DataTransferObject dataTransferObject) {
		this.dataTransferObject = dataTransferObject;
	}
	
	@Override
	public DataTransferObject getDto() {
		return this.dataTransferObject;
	}
	
	@Override
	public void setWebFactory(AbstractGuiWebFactoryInterface webFactory) {
		this.webFactory = webFactory;
	}
	
	@Override
	public AbstractGuiWebFactoryInterface getWebFactory() {
		return this.webFactory;
	}
	
}
