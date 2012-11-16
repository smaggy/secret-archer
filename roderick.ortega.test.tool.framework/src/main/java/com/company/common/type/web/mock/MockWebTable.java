package com.company.common.type.web.mock;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.model.action.ClickableInterface;
import com.company.common.model.action.KeyableInterface;
import com.company.common.model.test.TestObjectInterface;
import com.company.common.model.type.AbstractWebElementInterface;
import com.company.common.model.type.AbstractWebTableInterface;
import com.company.common.model.type.AbstractWebTableRowInterface;
import com.company.common.types.SearchParameters;
import com.company.common.types.TableCell;

public class MockWebTable extends MockWebElement implements AbstractWebTableInterface, TestObjectInterface, ClickableInterface, KeyableInterface {

	final static Logger logger = LoggerFactory.getLogger(MockWebTable.class);
	
	@Override
	public AbstractWebElementInterface getCell(int rowIndex, int colIndex) {
		logger.debug("MockWebTable|getCell: " + rowIndex + " : " + colIndex);
		return null;
	}

	@Override
	public String getCellText(int rowIndex, int colIndex) {
		logger.debug("MockWebTable|getCellText: " + rowIndex + " : " + colIndex);
		return null;
	}

	@Override
	public int getColumnCount() {
		logger.debug("MockWebTable|getColumnCount");
		return 0;
	}

	@Override
	public AbstractWebTableRowInterface getRow(int rowIndex) {
		logger.debug("MockWebTable|getRow: " + rowIndex);
		return null;
	}

	@Override
	public int getRowCount() {
		logger.debug("MockWebTable|getRowCount");
		return 0;
	}

	@Override
	public List<AbstractWebTableRowInterface> getRows() {
		logger.debug("MockWebTable|getRows");
		return null;
	}

	@Override
	public List<String> getRowText(int rowIndex) {
		logger.debug("MockWebTable|getRowText: " + rowIndex);
		return null;
	}

	@Override
	public List<TableCell> searchTable(List<List<String>> table, SearchParameters searchParameters) {
		logger.debug("MockWebTable|searchTable: " + table + "|" + searchParameters);
		return null;
	}

	@Override
	public List<List<String>> getTableText() {
		logger.debug("MockWebTable|getTableText");
		return null;
	}

}
