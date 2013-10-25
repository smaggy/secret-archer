package com.company.common.model.test;

/**
 * Defines the use and role of a web based test object contained within this system
 * 
 * @author ortega_e
 *
 */
public interface TestObjectInterface {
	
	/**
	 * Does the test object exist on the current page?
	 * 
	 * @return
	 */
	public boolean exists();
}
