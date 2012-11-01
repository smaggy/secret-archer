package com.company.common.type.web.generics;

import java.util.List;

import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebElementInterface;
import com.company.common.interfaces.type.AbstractWebTableInterface;
import com.company.common.interfaces.type.AbstractWebTableRowInterface;
import com.company.common.types.SearchParameters;
import com.company.common.types.TableCell;

public class GenericWebTable extends GenericWebElement implements AbstractWebTableInterface, TestObjectInterface, ClickableInterface, KeyableInterface {

	@Override
	public AbstractWebElementInterface getCell(int rowIndex, int colIndex) {
		System.out.println("GenericWebTable|getCell: " + rowIndex + " : " + colIndex);
		return null;
	}

	@Override
	public String getCellText(int rowIndex, int colIndex) {
		System.out.println("GenericWebTable|getCellText: " + rowIndex + " : " + colIndex);
		return null;
	}

	@Override
	public int getColumnCount() {
		System.out.println("GenericWebTable|getColumnCount");
		return 0;
	}

	@Override
	public AbstractWebTableRowInterface getRow(int rowIndex) {
		System.out.println("GenericWebTable|getRow: " + rowIndex);
		return null;
	}

	@Override
	public int getRowCount() {
		System.out.println("GenericWebTable|getRowCount");
		return 0;
	}

	@Override
	public List<AbstractWebTableRowInterface> getRows() {
		System.out.println("GenericWebTable|getRows");
		return null;
	}

	@Override
	public List<String> getRowText(int rowIndex) {
		System.out.println("GenericWebTable|getRowText: " + rowIndex);
		return null;
	}

	@Override
	public List<TableCell> searchTable(List<List<String>> table, SearchParameters searchParameters) {
		System.out.println("GenericWebTable|searchTable: " + table + "|" + searchParameters);
		return null;
	}

	@Override
	public List<List<String>> getTableText() {
		System.out.println("GenericWebTable|getTableText");
		return null;
	}

}
