package com.company.common.model.type;

/**
 * Defines the use of ANY web based list box
 * 
 * @author ortega_e
 *
 */
public interface AbstractWebListBoxInterface extends AbstractWebElementInterface {
	
	/**
	 * Gets the count of items in a list
	 * 
	 * @return
	 */
	public int getItemCount();
	
	/**
	 * Selects an item in a list of items based on index
	 * 
	 * @param itemIndex
	 */
	public void select(int itemIndex);
	
	/**
	 * Selects an item in a list of items based on inner text
	 * 
	 * @param itemText
	 */
	public void select(String itemText);
}
