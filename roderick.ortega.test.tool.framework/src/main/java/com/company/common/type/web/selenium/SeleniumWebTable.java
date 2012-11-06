package com.company.common.type.web.selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.browser.AbstractSeleniumWebBrowser;
import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebElementInterface;
import com.company.common.interfaces.type.AbstractWebTableInterface;
import com.company.common.interfaces.type.AbstractWebTableRowInterface;
import com.company.common.types.Locator;
import com.company.common.types.SearchParameters;
import com.company.common.types.TableCell;
import com.company.common.utils.Searchable;

public class SeleniumWebTable extends SeleniumWebElement implements TestObjectInterface, ClickableInterface, KeyableInterface, AbstractWebTableInterface {

	final static Logger logger = LoggerFactory.getLogger(SeleniumWebTable.class);
	
	public SeleniumWebTable(WebElement webElement, Locator locator, AbstractSeleniumWebBrowser webBrowser) {
		super(webElement, locator, webBrowser);
	}

	@Override
	public AbstractWebElementInterface getCell(int rowIndex, int colIndex) {
		logger.debug("SeleniumWebTable|getCell: [" + rowIndex + "|" + colIndex + "]");
		return getRow(rowIndex).getCell(colIndex);
	}

	@Override
	public String getCellText(int rowIndex, int colIndex) {
		logger.debug("SeleniumWebTable|getCellText: [" + rowIndex + "|" + colIndex + "]");
		return getRow(rowIndex).getCell(colIndex).getText();
	}

	@Override
	public int getColumnCount() {
		logger.debug("SeleniumWebTable|getColumnCount");
		return getRow(1).getCellCount();
	}

	@Override
	public AbstractWebTableRowInterface getRow(int rowIndex) {
		logger.debug("SeleniumWebTable|getRow: [" + rowIndex + "]");
		Locator locator = new Locator(getLocator().getXPathLocator() + "//TR");
		List<AbstractWebTableRowInterface> rows = getWebBrowser().findAllWebTableRows(locator);
		return rows.get(rowIndex - 1);
	}

	@Override
	public int getRowCount() {
		logger.debug("SeleniumWebTable|getRowCount");
		Locator locator = new Locator(getLocator().getXPathLocator() + "//TR");
		return getWebBrowser().findAllWebTableRows(locator).size();
	}

	@Override
	public List<AbstractWebTableRowInterface> getRows() {
		logger.debug("SeleniumWebTable|getRows");
		Locator locator = new Locator(getLocator().getXPathLocator() + "//TR");
		return getWebBrowser().findAllWebTableRows(locator);
	}

	@Override
	public List<String> getRowText(int rowIndex) {
		logger.debug("SeleniumWebTable|getRowText: [" + rowIndex + "]");
		List<String> retList = new ArrayList<String>();
		int cellCount = getRow(rowIndex).getCellCount();
		for (int i = 1; i <= cellCount; i++) {
			retList.add(getRow(rowIndex).getCell(i).getText());
		}
		return retList;
	}

	@Override
	public List<TableCell> searchTable(List<List<String>> table, SearchParameters searchParameters) {
		logger.debug("SeleniumWebTable|searchTable: [" + table + "|" + searchParameters + "]");
		return Searchable.searchTable(table, searchParameters);
	}

	@Override
	public List<List<String>> getTableText() {
		logger.debug("SeleniumWebTable|getTableText");
		List<List<String>> retTable = new ArrayList<List<String>>();
		int totalRows = getRowCount();
		for (int i = 1; i <= totalRows; i++) {
			retTable.add(getRowText(i));
		}
		return retTable;
	}

}
