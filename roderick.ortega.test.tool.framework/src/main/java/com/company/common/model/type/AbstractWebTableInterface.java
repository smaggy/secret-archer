package com.company.common.model.type;

import java.util.List;

import com.company.common.model.action.SearchableTableInterface;

/**
 * Defines the use of ANY web based table
 * 
 * @author ortega_e
 *
 */
public interface AbstractWebTableInterface extends AbstractWebElementInterface, SearchableTableInterface {
	
	/**
	 * Gets the web based cell element based on row and col value
	 * 
	 * @param rowIndex
	 * @param colIndex
	 * @return cell element
	 */
	public AbstractWebElementInterface getCell(int rowIndex, int colIndex);
	
	/**
	 * Gets the inner text of a cell based on row and col value
	 * 
	 * @param rowIndex
	 * @param colIndex
	 * @return text contained in a cell
	 */
	public String getCellText(int rowIndex, int colIndex);
	
	/**
	 * Gets a count of columns in the table
	 * 
	 * @return
	 */
	public int getColumnCount();
	
	/**
	 * Gets the row of contained in a table based on index
	 * 
	 * @param rowIndex
	 * @return
	 */
	public AbstractWebTableRowInterface getRow(int rowIndex);
	
	/**
	 * Gets the number of rows contained in a table
	 * 
	 * @return
	 */
	public int getRowCount();
	
	/**
	 * Gets all the rows contained in a table
	 * 
	 * @return
	 */
	public List<AbstractWebTableRowInterface> getRows();
	
	/**
	 * Gets the inner text of a row contained in a table based on index
	 * 
	 * @param rowIndex
	 * @return
	 */
	public List<String> getRowText(int rowIndex);
	
	/**
	 * Gets ALL the table text of a table
	 * 
	 * @return
	 */
	public List<List<String>> getTableText();
}
