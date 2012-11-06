package com.company.common.type.web.generics;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebElementInterface;
import com.company.common.interfaces.type.AbstractWebTableInterface;
import com.company.common.interfaces.type.AbstractWebTableRowInterface;
import com.company.common.types.SearchParameters;
import com.company.common.types.TableCell;

public class GenericWebTable extends GenericWebElement implements AbstractWebTableInterface, TestObjectInterface, ClickableInterface, KeyableInterface {

	final static Logger logger = LoggerFactory.getLogger(GenericWebTable.class);
	
	@Override
	public AbstractWebElementInterface getCell(int rowIndex, int colIndex) {
		logger.debug("GenericWebTable|getCell: " + rowIndex + " : " + colIndex);
		return null;
	}

	@Override
	public String getCellText(int rowIndex, int colIndex) {
		logger.debug("GenericWebTable|getCellText: " + rowIndex + " : " + colIndex);
		return null;
	}

	@Override
	public int getColumnCount() {
		logger.debug("GenericWebTable|getColumnCount");
		return 0;
	}

	@Override
	public AbstractWebTableRowInterface getRow(int rowIndex) {
		logger.debug("GenericWebTable|getRow: " + rowIndex);
		return null;
	}

	@Override
	public int getRowCount() {
		logger.debug("GenericWebTable|getRowCount");
		return 0;
	}

	@Override
	public List<AbstractWebTableRowInterface> getRows() {
		logger.debug("GenericWebTable|getRows");
		return null;
	}

	@Override
	public List<String> getRowText(int rowIndex) {
		logger.debug("GenericWebTable|getRowText: " + rowIndex);
		return null;
	}

	@Override
	public List<TableCell> searchTable(List<List<String>> table, SearchParameters searchParameters) {
		logger.debug("GenericWebTable|searchTable: " + table + "|" + searchParameters);
		return null;
	}

	@Override
	public List<List<String>> getTableText() {
		logger.debug("GenericWebTable|getTableText");
		return null;
	}

}
