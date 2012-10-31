package com.company.unit.test.common.types;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.company.common.types.CompanyStringDate;

public class TestCompanyStringDate {

	@Before
	public void before() {
		System.out.println("=== new test ===");
	}
	
	@Test
	public void test01() {
		new CompanyStringDate("");
	}
	
	@Test
	public void test02() {
		new CompanyStringDate("11/11/2011");
	}
	
	@Test
	public void test08() {
		new CompanyStringDate("05/11/2012");
	}
	
	@Test
	public void test09() {
		new CompanyStringDate("05/09/2000");
	}
	
	@Test
	public void test03() {
		new CompanyStringDate("14/11/2011");
	}
	
	@Test
	public void test04() {
		new CompanyStringDate("3/11/2011");
	}
	
	@Test
	public void test05() {
		new CompanyStringDate("04/1/2011");
	}
	
	@Test
	public void test06() {
		new CompanyStringDate("04/99/2011");
	}
	
	@Test
	public void test07() {
		new CompanyStringDate("04/23/11");
	}
	
	@After
	public void after() {
		
	}
	
}
