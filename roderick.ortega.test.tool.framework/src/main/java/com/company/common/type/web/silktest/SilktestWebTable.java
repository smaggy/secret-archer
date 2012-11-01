package com.company.common.type.web.silktest;

import java.util.List;

import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.action.SearchableTableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebElementInterface;
import com.company.common.interfaces.type.AbstractWebTableInterface;
import com.company.common.interfaces.type.AbstractWebTableRowInterface;
import com.company.common.types.SearchParameters;
import com.company.common.types.TableCell;

public class SilktestWebTable extends SilktestWebElement implements AbstractWebTableInterface, TestObjectInterface, ClickableInterface, KeyableInterface, SearchableTableInterface {
	
	@Override
	public AbstractWebElementInterface getCell(int rowIndex, int colIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCellText(int rowIndex, int colIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public AbstractWebTableRowInterface getRow(int rowIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<AbstractWebTableRowInterface> getRows() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getRowText(int rowIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TableCell> searchTable(List<List<String>> table, SearchParameters searchParameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<List<String>> getTableText() {
		// TODO Auto-generated method stub
		return null;
	}

}
