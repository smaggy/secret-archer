package com.company.common.model.type;

/**
 * Defines the use of ANY web based radio button
 * 
 * @author ortega_e
 *
 */
public interface AbstractWebRadioButtonInterface extends AbstractWebElementInterface {
	
	/**
	 * Is the radio button selected?
	 * 
	 * @return
	 */
	public boolean isSelected();
	
	/**
	 * Select the radio button
	 */
	public void select();
}
