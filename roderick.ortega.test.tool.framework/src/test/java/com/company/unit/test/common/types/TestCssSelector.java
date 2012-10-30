package com.company.unit.test.common.types;

import org.junit.Test;

import com.company.common.types.CssSelector;

public class TestCssSelector {
	
	@Test
	public void test01() {
		CssSelector cssSelector = new CssSelector("//ELEMENT");
		System.out.println(cssSelector);
	}
	
}
