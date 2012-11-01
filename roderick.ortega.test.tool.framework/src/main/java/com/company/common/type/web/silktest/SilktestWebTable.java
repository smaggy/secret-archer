package com.company.common.type.web.silktest;

import java.util.ArrayList;
import java.util.List;

import com.borland.silktest.jtf.xbrowser.DomTable;
import com.borland.silktest.jtf.xbrowser.DomTableRow;
import com.company.common.browser.SilktestWebBrowser;
import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.action.SearchableTableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebElementInterface;
import com.company.common.interfaces.type.AbstractWebTableInterface;
import com.company.common.interfaces.type.AbstractWebTableRowInterface;
import com.company.common.types.Locator;
import com.company.common.types.SearchParameters;
import com.company.common.types.TableCell;
import com.company.common.utils.Searchable;

public class SilktestWebTable extends SilktestWebElement implements AbstractWebTableInterface, TestObjectInterface, ClickableInterface, KeyableInterface, SearchableTableInterface {
	
	public SilktestWebTable(DomTable domTable, Locator locator, SilktestWebBrowser webBrowser) {
		super(domTable, locator, webBrowser);
	}

	@Override
	public AbstractWebElementInterface getCell(int rowIndex, int colIndex) {
		System.out.println("SilktestWebTable|getCell: [" + rowIndex + "|" + colIndex + "]");
		Locator retLocator = new Locator(this.getLocator().getXPathLocator() + "//TR[" + rowIndex + "]//TD[" + colIndex + "]");
		return new SilktestWebElement(((DomTable) getDomElement()).getCell(rowIndex, colIndex), retLocator, this.getWebBrowser());
	}

	@Override
	public String getCellText(int rowIndex, int colIndex) {
		System.out.println("SilktestWebTable|getCellText: [" + rowIndex + "|" + colIndex + "]");
		return ((DomTable) getDomElement()).getCellText(rowIndex, colIndex);
	}

	@Override
	public int getColumnCount() {
		System.out.println("SilktestWebTable|getColumnCount");
		return ((DomTable) getDomElement()).getColumnCount();
	}

	@Override
	public AbstractWebTableRowInterface getRow(int rowIndex) {
		System.out.println("SilktestWebTable|getRow: [" + rowIndex + "]");
		Locator retLocator = new Locator(this.getLocator().getXPathLocator() + "//TR[" + rowIndex + "]");
		return new SilktestWebTableRow(((DomTable) getDomElement()).getRow(rowIndex), retLocator, this.getWebBrowser());
	}

	@Override
	public int getRowCount() {
		System.out.println("SilktestWebTable|getRowCount");
		return ((DomTable) getDomElement()).getRowCount();
	}

	@Override
	public List<AbstractWebTableRowInterface> getRows() {
		System.out.println("SilktestWebTable|getRows");
		List<SilktestWebTableRow> silktestRows = new ArrayList<SilktestWebTableRow>();
		List<DomTableRow> rows = ((DomTable) getDomElement()).getRows();
		int counter = 1;
		for (DomTableRow row : rows) {
			SilktestWebTableRow silktestRow = new SilktestWebTableRow(row, new Locator(this.getLocator().getXPathLocator() + "//TR[" + counter + "]"), this.getWebBrowser());
			silktestRows.add(silktestRow);
			counter = counter + 1;
		}
		return null;
	}

	@Override
	public List<String> getRowText(int rowIndex) {
		System.out.println("SilktestWebTable|getRowText: [" + rowIndex + "]");
		return ((DomTable) getDomElement()).getRowText(rowIndex);
	}

	@Override
	public List<TableCell> searchTable(List<List<String>> table, SearchParameters searchParameters) {
		System.out.println("SilktestWebTable|searchTable: [" + searchParameters + "]");
		return Searchable.searchTable(table, searchParameters);
	}

	@Override
	public List<List<String>> getTableText() {
		System.out.println("SilktestWebTable|getTableText");
		List<List<String>> table = new ArrayList<List<String>>();
		int totalRows = this.getRowCount();
		for (int i = 1; i < totalRows; i++) {
			table.add(getRowText(i));
		}
		return table;
	}

}
