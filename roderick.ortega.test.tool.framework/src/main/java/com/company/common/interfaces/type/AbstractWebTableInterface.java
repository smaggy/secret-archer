package com.company.common.interfaces.type;

import java.util.List;

import com.company.common.interfaces.action.SearchableTableInterface;

public interface AbstractWebTableInterface extends AbstractWebElementInterface, SearchableTableInterface {
	public AbstractWebElementInterface getCell(int rowIndex, int colIndex);
	public String getCellText(int rowIndex, int colIndex);
	public int getColumnCount();
	public AbstractWebTableRowInterface getRow(int rowIndex);
	public int getRowCount();
	public List<AbstractWebTableRowInterface> getRows();
	public List<String> getRowText(int rowIndex);
	public List<List<String>> getTableText();
}
