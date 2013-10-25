package com.company.common.model.process;

import com.company.common.model.factory.AbstractGuiWebFactoryInterface;

/**
 * Defines the role and use of an automation object that you can load a gui type factory into.   Typically used with web page objects.
 * The FACTORY produces elements for the automation system to manipulate.   You can factories for web based elements or system related elements.
 * 
 * @author ortega_e
 *
 */
public interface GuiFactoryLoadableInterface {
	
	/**
	 * Sets the Web Factory to the automation object
	 * 
	 * @param webFactory
	 * @throws Exception
	 */
	public void setWebFactory(AbstractGuiWebFactoryInterface webFactory) throws Exception;
	
	/**
	 * Gets the Web Factory from the automation object
	 * 
	 * @return
	 * @throws Exception
	 */
	public AbstractGuiWebFactoryInterface getWebFactory() throws Exception;
}
