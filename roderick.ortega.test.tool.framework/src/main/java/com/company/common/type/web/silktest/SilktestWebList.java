package com.company.common.type.web.silktest;

import java.util.ArrayList;
import java.util.List;

import com.borland.silktest.jtf.xbrowser.DomElement;
import com.company.common.browser.SilktestWebBrowser;
import com.company.common.interfaces.action.ClickableInterface;
import com.company.common.interfaces.action.KeyableInterface;
import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.AbstractWebElementInterface;
import com.company.common.interfaces.type.AbstractWebListInterface;
import com.company.common.types.Locator;
import com.company.common.types.SearchParameters;
import com.company.common.utils.Searchable;

public class SilktestWebList extends SilktestWebElement implements AbstractWebListInterface, TestObjectInterface, ClickableInterface, KeyableInterface {

	public SilktestWebList(DomElement domElement, Locator locator, SilktestWebBrowser webBrowser) {
		super(domElement, locator, webBrowser);
	}

	@Override
	public AbstractWebElementInterface getListItem(int itemIndex) {
		System.out.println("SilktestWebList|getListItem: [" + itemIndex + "]");
		String newXpath = this.getLocator().getXPathLocator() + "/LI";
		List<AbstractWebElementInterface> elements = getWebBrowser().findAllWebElements(new Locator(newXpath));
		return elements.get(itemIndex);
	}

	@Override
	public List<AbstractWebElementInterface> getListItems(boolean printFlag) {
		System.out.println("SilktestWebList|getListItems: [" + printFlag + "]");
		String newXpath = this.getLocator().getXPathLocator() + "/LI";
		List<AbstractWebElementInterface> elements = getWebBrowser().findAllWebElements(new Locator(newXpath));
		if (printFlag) {
			System.out.println("SilktestWebList|getListItems: print flag tripped, printing out the contents of each LI element");
			for (AbstractWebElementInterface element: elements) {
				System.out.println(element.getText());
			}
		}
		return elements;
	}

	@Override
	public int size() {
		System.out.println("SilktestWebList|size");
		String newXpath = this.getLocator().getXPathLocator() + "/LI";
		List<AbstractWebElementInterface> elements = getWebBrowser().findAllWebElements(new Locator(newXpath));
		return elements.size();
	}

	@Override
	public void reload() {
		System.out.println("SilktestWebList|reload");
		System.out.println(" ... not sure what this does.");
	}

	@Override
	public List<Integer> searchList(List<String> list, SearchParameters searchParameters) {
		System.out.println("SilktestWebList|searchList: [" + list + "|" + searchParameters + "]");
		return Searchable.searchList(list, searchParameters);
	}

	@Override
	public List<String> getListText() {
		System.out.println("SilktestWebList|getListText");
		List<String> retList = new ArrayList<String>();
		Locator newLocator = new Locator(this.getLocator().getXPathLocator() + "/LI");
		List<AbstractWebElementInterface> elements = getWebBrowser().findAllWebElements(newLocator);
		for (AbstractWebElementInterface element : elements) {
			retList.add(element.getText());
		}
		return retList;
	}

}
