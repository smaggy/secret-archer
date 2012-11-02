package com.company.demowebapplication.business.process.model;

import com.company.common.interfaces.factory.AbstractGuiWebFactoryInterface;
import com.company.demowebapplication.data.DataTransferObject;
import com.company.demowebapplication.interfaces.workflows.AbstractSiteWorkflowInterface;

public abstract class AbstractSiteWorkflow implements AbstractSiteWorkflowInterface {

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
