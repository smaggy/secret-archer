package com.company.demowebapplication.business.process.model;

import com.company.demowebapplication.data.DataTransferObject;
import com.company.demowebapplication.interfaces.workflows.AbstractSiteWorkflowInterface;

public abstract class AbstractSiteWorkflow implements AbstractSiteWorkflowInterface {

	private DataTransferObject dataTransferObject;
	
	@Override
	public void setDto(DataTransferObject dataTransferObject) {
		this.dataTransferObject = dataTransferObject;
	}
	
	@Override
	public DataTransferObject getDto() {
		return this.dataTransferObject;
	}
	
}
