package com.company.common.model.type;

import java.util.List;

import com.company.common.model.action.ClickableInterface;
import com.company.common.model.action.KeyableInterface;
import com.company.common.model.test.TestObjectInterface;

/**
 * Defines the use of ANY web element contained on a web page
 * 
 * @author ortega_e
 *
 */
public interface AbstractWebElementInterface extends TestObjectInterface, ClickableInterface, KeyableInterface {
	
	/**
	 * Gets a list of attributes associated with any web element
	 * 
	 * @return list of attributes
	 */
	public List<String> getDomAttributeList();
	
	/**
	 * Gets a specific attribute of a web element
	 * 
	 * @param attribute
	 * @return attribute value
	 */
	public String getDomAttribute(String attribute);
	
	/**
	 * Gets the inner text of a web element
	 * 
	 * @return text value
	 */
	public String getText();
}
