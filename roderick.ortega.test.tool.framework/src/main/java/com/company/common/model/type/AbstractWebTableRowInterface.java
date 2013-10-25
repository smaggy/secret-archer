package com.company.common.model.type;

/**
 * Defines the use of ANY web based table row contained in a table
 * 
 * @author ortega_e
 *
 */
public interface AbstractWebTableRowInterface extends AbstractWebElementInterface {
	/**
	 * Gets the cell contained in a table based on index
	 * 
	 * @param itemIdentifierIndex
	 * @return
	 */
	public AbstractWebElementInterface getCell(int itemIdentifierIndex);
	
	/**
	 * Gets the length of the cells contained in a row
	 * 
	 * @return
	 */
	public int getCellCount();
	
	/**
	 * Gets the index of the row contained in a table
	 * 
	 * @return
	 */
	public int getIndex();
}
