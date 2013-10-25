package com.company.common.model.type;

import java.util.List;

import com.company.common.model.action.SearchableListInterface;

/**
 * Defines the use of ANY web based list
 * 
 * @author ortega_e
 *
 */
public interface AbstractWebListInterface extends AbstractWebElementInterface, SearchableListInterface {
	
	/**
	 * Gets a list item from a list of items based on index
	 * 
	 * @param itemIndex
	 * @return selected item in the list
	 */
	public AbstractWebElementInterface getListItem(int itemIndex);
	
	/**
	 * Gets a list of items from a list of items.  Can either choose to print the list of items for logging purposes.
	 * 
	 * @param printFlag
	 * @return items in the list
	 */
	public List<AbstractWebElementInterface> getListItems(boolean printFlag);
	
	/**
	 * Gets the length of the list of items
	 * 
	 * @return
	 */
	public int size();
	
	/**
	 * Performs a reload of the list.   This is typically used in a dynamic page where the state of the list may change based on actions of the user.
	 * 
	 */
	public void reload();
	
	/**
	 * Gets the inner text of the list of items
	 * 
	 * @return
	 */
	public List<String> getListText();
}
