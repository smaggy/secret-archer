package com.company.common.model.browser;

import com.company.common.model.action.FindableInterface;
import com.company.common.types.Url;

/**
 * Defines the use of ANY web based browser
 * 
 * @author ortega_e
 *
 */
public interface AbstractWebBrowserInterface extends FindableInterface {
	
	/**
	 * Closes the web browser
	 */
	public void close();
	
	/**
	 * Gets the URL from the web browser address bar
	 * 
	 * @return
	 */
	public String getUrl();
	
	/**
	 * Actions the web browser to navigate to a specific page
	 * 
	 * @param url
	 */
	public void navigate(Url url);
	
	/**
	 * Gets the title of the page displayed by the web browser
	 * 
	 * @return
	 */
	public String getTitle();
}
