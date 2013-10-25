package com.company.common.model.type;

/**
 * Interface to define the use of ANY web browser based check box.
 * 
 * @author ortega_e
 *
 */
public interface AbstractWebCheckBoxInterface extends AbstractWebElementInterface {
	/**
	 * Check the check box
	 */
	public void check();
	
	/**
	 * Uncheck the check box
	 */
	public void uncheck();
	
	/**
	 * What is the current state of the check box.  1 = checked, 2 = unchecked
	 * @return
	 */
	public int getState();
}
