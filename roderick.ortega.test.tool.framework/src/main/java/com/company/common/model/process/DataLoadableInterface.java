package com.company.common.model.process;

import com.company.demowebapplication.data.DataTransferObject;

/**
 * Defines the role and use of an automation object that you can load data into.   Typically used with web page objects.
 * 
 * @author ortega_e
 *
 */
public interface DataLoadableInterface {
	/**
	 * Sets the Data Transfer Object into the automation object
	 * 
	 * @param dataTransferObject
	 */
	public void setDto(DataTransferObject dataTransferObject);
	
	/**
	 * Gets the Data Transfer Object from the automation object
	 * 
	 * @return
	 */
	public DataTransferObject getDto();
}
