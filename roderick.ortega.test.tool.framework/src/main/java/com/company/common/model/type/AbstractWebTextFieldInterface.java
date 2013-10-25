package com.company.common.model.type;

/**
 * Defines the use of ANY web based text field
 * 
 * @author ortega_e
 *
 */
public interface AbstractWebTextFieldInterface extends AbstractWebElementInterface {
	
	/**
	 * Gets the text within a text field
	 */
	public String getText();
	
	/**
	 * Sets the text within a text field
	 * 
	 * @param text
	 */
	public void setText(String text);
}
