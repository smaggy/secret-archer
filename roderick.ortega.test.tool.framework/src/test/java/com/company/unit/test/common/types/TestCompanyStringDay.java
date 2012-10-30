package com.company.unit.test.common.types;

import org.junit.Test;

import com.company.common.types.CompanyStringDay;

public class TestCompanyStringDay {
	
	@Test
	public void test01() {
		CompanyStringDay companyStringDay = new CompanyStringDay("1");
		System.out.println(companyStringDay);
	}
	
	@Test
	public void test02() {
		CompanyStringDay companyStringDay = new CompanyStringDay("-7");
		System.out.println(companyStringDay);
	}
	
	@Test
	public void test03() {
		CompanyStringDay companyStringDay = new CompanyStringDay("40");
		System.out.println(companyStringDay);
	}
	
}
