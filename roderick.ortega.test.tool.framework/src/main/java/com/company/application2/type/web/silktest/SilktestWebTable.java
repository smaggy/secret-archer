package com.company.application2.type.web.silktest;

import java.util.List;

import com.company.common.model.action.ClickableInterface;
import com.company.common.model.action.KeyableInterface;
import com.company.common.model.test.TestObjectInterface;
import com.company.common.model.type.AbstractWebElementInterface;
import com.company.common.model.type.AbstractWebTableInterface;
import com.company.common.model.type.AbstractWebTableRowInterface;
import com.company.common.types.SearchParameters;
import com.company.common.types.TableCell;

public class SilktestWebTable extends SilktestWebElement implements TestObjectInterface, ClickableInterface, KeyableInterface, AbstractWebTableInterface {

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
