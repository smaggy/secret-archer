package com.company.unit.test.type.generic;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.company.common.browser.GenericWebBrowser;
import com.company.common.interfaces.browser.AbstractWebBrowserInterface;
import com.company.common.interfaces.factory.AbstractGuiWebFactoryInterface;
import com.company.common.interfaces.type.AbstractWebButtonInterface;
import com.company.common.interfaces.type.AbstractWebCheckBoxInterface;
import com.company.common.interfaces.type.AbstractWebElementInterface;
import com.company.common.interfaces.type.AbstractWebLinkInterface;
import com.company.common.interfaces.type.AbstractWebListBoxInterface;
import com.company.common.interfaces.type.AbstractWebListInterface;
import com.company.common.interfaces.type.AbstractWebRadioButtonInterface;
import com.company.common.interfaces.type.AbstractWebTableInterface;
import com.company.common.interfaces.type.AbstractWebTableRowInterface;
import com.company.common.interfaces.type.AbstractWebTextFieldInterface;
import com.company.common.type.web.generics.GenericGuiWebFactory;
import com.company.common.types.Locator;
import com.company.common.types.SearchParameters;

public class TestGenericGuiWebFactory {
	
	private AbstractGuiWebFactoryInterface guiWebFactory;
	private AbstractWebBrowserInterface webBrowser;
	private Locator locator;
	
	@Before
	public void before() throws Exception {
		webBrowser = new GenericWebBrowser();
		guiWebFactory = new GenericGuiWebFactory(webBrowser);
		guiWebFactory.setWebBrowser(webBrowser);
		locator = new Locator("//ELEMENT[@id='AutomationId']");
		System.out.println("==== new test ====");
	}
	@Test
	public void test01() {
		guiWebFactory.createWebButton(locator);
		guiWebFactory.createWebCheckBox(locator);
		guiWebFactory.createWebElement(locator);
		guiWebFactory.createWebLink(locator);
		guiWebFactory.createWebList(locator);
		guiWebFactory.createWebListBox(locator);
		guiWebFactory.createWebRadioButton(locator);
		guiWebFactory.createWebTable(locator);
		guiWebFactory.createWebTableRow(locator);
		guiWebFactory.createWebTextField(locator);
	}
	@Test
	public void test02() {
		AbstractWebButtonInterface button = guiWebFactory.createWebButton(locator);
		button.select();
		button.getDomAttributeList();
		button.getText();
	}
	@Test
	public void test03() {
		AbstractWebCheckBoxInterface checkbox = guiWebFactory.createWebCheckBox(locator);
		checkbox.check();
		checkbox.uncheck();
		checkbox.getState();
		checkbox.getDomAttributeList();
		checkbox.getText();
	}
	@Test
	public void test04() {
		AbstractWebElementInterface element = guiWebFactory.createWebElement(locator);
		element.getDomAttributeList();
		element.getText();
	}
	@Test
	public void test05() {
		AbstractWebListInterface list = guiWebFactory.createWebList(locator);
		list.getDomAttributeList();
		list.getText();
		list.getListItem(1);
		list.getListItems(true);
		list.reload();
		list.size();
	}
	@Test
	public void test06() {
		AbstractWebLinkInterface link = guiWebFactory.createWebLink(locator);
		link.getDomAttributeList();
		link.getText();
		link.select();
	}
	@Test
	public void test07() {
		AbstractWebListBoxInterface listBox = guiWebFactory.createWebListBox(locator);
		listBox.getDomAttributeList();
		listBox.getText();
		listBox.getItemCount();
		listBox.select(1);
		listBox.select("1");
	}
	@Test
	public void test08() {
		AbstractWebRadioButtonInterface radioButton = guiWebFactory.createWebRadioButton(locator);
		radioButton.getDomAttributeList();
		radioButton.getText();
		radioButton.isSelected();
		radioButton.select();
	}
	@Test
	public void test09() {
		AbstractWebTableInterface table = guiWebFactory.createWebTable(locator);
		table.getDomAttributeList();
		table.getText();
		table.getCell(1, 1);
		table.getCellText(1, 1);
		table.getColumnCount();
		table.getRow(1);
		table.getRowCount();
		table.getRows();
		table.getRowText(1);
		List<String> virtualRow1 = new ArrayList<String>();
		List<String> virtualRow2 = new ArrayList<String>();
		List<List<String>> virtualTable = new ArrayList<List<String>>();
		virtualRow1.add("String11");
		virtualRow1.add("String12");
		virtualRow1.add("String13");
		virtualRow2.add("String21");
		virtualRow2.add("String22");
		virtualRow2.add("String23");
		virtualTable.add((ArrayList<String>) virtualRow1);
		virtualTable.add((ArrayList<String>) virtualRow2);
		SearchParameters searchParams = new SearchParameters("mainSearch", "1stQualifier");
		table.searchTable(virtualTable, searchParams);
	}
	@Test
	public void test10() {
		AbstractWebTableRowInterface tableRow = guiWebFactory.createWebTableRow(locator);
		tableRow.getDomAttributeList();
		tableRow.getText();
		tableRow.getCell(1);
		tableRow.getCellCount();
		tableRow.getIndex();
	}
	@Test
	public void test11() {
		AbstractWebTextFieldInterface textfield = guiWebFactory.createWebTextField(locator);
		textfield.getDomAttributeList();
		textfield.getText();
		textfield.setText("1");
	}
}
