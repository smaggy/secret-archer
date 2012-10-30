package com.company.unit.test.common.types;

import org.junit.Test;

import com.company.common.types.Locator;

public class TestLocator {
	
	@Test
	public void test01() {
		Locator locator = new Locator("//ELEMENT[@id='id']");
		System.out.println(locator);
	}
	
	@Test
	public void test02() {
		Locator locator = new Locator("//*[@id='id']");
		System.out.println(locator);
	}
	
	@Test
	public void test03() {
		Locator locator = new Locator("//ELEMENT[@id='*id*']");
		System.out.println(locator);
	}
	
	@Test
	public void test04() {
		Locator locator = new Locator("//ELEMENT[@textcontents='*id*']");
		System.out.println(locator);
	}
	
}
