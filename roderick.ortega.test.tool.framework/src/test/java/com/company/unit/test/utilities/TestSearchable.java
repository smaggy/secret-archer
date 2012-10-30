package com.company.unit.test.utilities;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.company.common.types.SearchParameters;
import com.company.common.utils.Searchable;

public class TestSearchable {
	
	private List<String> testList1;			// test list 1 - row example
	private List<String> testList2;			// test list 2 - row example
	private List<List<String>> testTable1;	// test table 1 - true certsuite data
	private List<List<String>> testTable2;	// test table 2 - calendar example
	
	@BeforeClass
	public static void beforeClass() {
		
	}
	
	@Before
	public void before() {
		System.out.println("==== new test ====");
		buildTestList1();
		buildTestList2();
		buildTestTable1();
		buildTestTable2();
	}
	
	@Test
	public void test01() {
		SearchParameters searchParams = new SearchParameters(true, "1");
		System.out.println(Searchable.searchTable(testTable2, searchParams));
	}
	
	@Test
	public void test02() {
		SearchParameters searchParams = new SearchParameters(true, "1", "3");
		System.out.println(Searchable.searchTable(testTable2, searchParams));
	}
	
	@Test
	public void test03() {
		SearchParameters searchParams = new SearchParameters(true, "1", "3", "7");
		System.out.println(Searchable.searchTable(testTable2, searchParams));
	}
	
	@Test
	public void test04() {
		SearchParameters searchParams = new SearchParameters(true, "1", "3", "7", "6");
		System.out.println(Searchable.searchTable(testTable2, searchParams));
	}
	
	@Test
	public void test05() {
		SearchParameters searchParams = new SearchParameters(true, "1", "29", "3", "30");
		System.out.println(Searchable.searchTable(testTable2, searchParams));
	}
	
	@Test
	public void test06() {
		SearchParameters searchParams = new SearchParameters(true, "Demo Tansformation", "QA Vendor 1", "Active", "07/13/2012");
		System.out.println(Searchable.searchTable(testTable1, searchParams));
	}
	
	@Test
	public void test07() {
		SearchParameters searchParams = new SearchParameters(true, "Demo TANSFORMATION", "QA Vendor 1", "Active", "07/13/2012");
		System.out.println(Searchable.searchTable(testTable1, searchParams));
	}
	
	@Test
	public void test08() {
		SearchParameters searchParams = new SearchParameters(false, "Demo TANSFORMATION", "QA Vendor 1", "Active", "07/13/2012");
		System.out.println(Searchable.searchTable(testTable1, searchParams));
	}
	
	@Test
	public void test09() {
		SearchParameters searchParams = new SearchParameters(false, "Demo TANSFORMATION", "QA Vendor 1", "Active", "07/13/2012");
		searchParams.normalizeSearchParameters();
		System.out.println(Searchable.searchTable(Searchable.normalizeTable(testTable1), searchParams));
	}
	
	@After
	public void after() {
		
	}
	
	@AfterClass
	public static void afterClass() {
		
	}
	
	public void buildTestList1() {
		testList1 = new ArrayList<String>();
		testList1.add("AAMike_1");
		testList1.add("MedConnect");
		testList1.add("Active");
		testList1.add("ORDER_RESULTS");
		testList1.add("conrad9a");
		testList1.add("10/16/2012");
	}
	
	public void buildTestList2() {
		testList2 = new ArrayList<String>();
		testList2.add("AAMike_1");
		testList2.add("Test Vendor");
		testList2.add("Completed");
		testList2.add("ORDER_RESULTS");
		testList2.add("conrad9a");
		testList2.add("10/16/2012");
	}
	
	public void buildTestTable1() {
		testTable1 = new ArrayList<List<String>>();
		
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<String> list3 = new ArrayList<String>();
		List<String> list4 = new ArrayList<String>();
		List<String> list5 = new ArrayList<String>();
		List<String> list6 = new ArrayList<String>();
		List<String> list7 = new ArrayList<String>();
		List<String> list8 = new ArrayList<String>();
		List<String> list9 = new ArrayList<String>();
		List<String> list10 = new ArrayList<String>();
		
		// populate the list
		list1.add("Project Name");
		list1.add("Vendor Name");
		list1.add("Status");
		list1.add("Interface Type");
		list1.add("Created by");
		list1.add("Date Created");
		testTable1.add(list1);
		
		// populate the list
		list2.add("ddd");
		list2.add("MedConnect");
		list2.add("On Hold");
		list2.add("RESULTS_AND_BILLING");
		list2.add("conrad9a");
		list2.add("10/29/2012");
		testTable1.add(list2);
		
		// populate the list
		list3.add("Demo Tansformation");
		list3.add("QA Vendor 1");
		list3.add("Active");
		list3.add("ORDERS");
		list3.add("DX_OWNER");
		list3.add("07/13/2012");
		testTable1.add(list3);

		// populate the list
		list4.add("Demo Tansformation_cp0");
		list4.add("QA Vendor 1");
		list4.add("On Hold");
		list4.add("ORDERS");
		list4.add("certadmin12");
		list4.add("10/26/2012");
		testTable1.add(list4);

		// populate the list
		list5.add("Demo_NM_Project");
		list5.add("Cert_S_Vendor");
		list5.add("On Hold");
		list5.add("ORDERS_RESULTS");
		list5.add("DX_OWNER");
		list5.add("10/03/2012");
		testTable1.add(list5);
		
		// populate the list
		list6.add("Demo_NM_Project");
		list6.add("Hub Vendor Cert Test Account");
		list6.add("Completed");
		list6.add("ORDERS_RESULTS");
		list6.add("DX_OWNER");
		list6.add("10/03/2012");
		testTable1.add(list6);

		// populate the list
		list7.add("Demo_NM_Project2");
		list7.add("Cert_S_Vendor");
		list7.add("On Hold");
		list7.add("ORDERS");
		list7.add("DX_OWNER");
		list7.add("10/03/2012");
		testTable1.add(list7);
		
		// populate the list
		list8.add("Demo_NM_pROJECT3");
		list8.add("Cert_S_Vendor");
		list8.add("On Hold");
		list8.add("RESULTS_ONLY_PDF");
		list8.add("DX_OWNER");
		list8.add("10/03/2012");
		testTable1.add(list8);
		
		// populate the list
		list9.add("Demo_NM_Project3");
		list9.add("Cert_S_Vendor");
		list9.add("On Hold");
		list9.add("RESULTS");
		list9.add("DX_OWNER");
		list9.add("10/03/2012");
		testTable1.add(list9);
		
		// populate the list
		list10.add("Demo_NM_Test");
		list10.add("Cert_S_Vendor");
		list10.add("Completed");
		list10.add("RESULTS_ONLY_PDF");
		list10.add("DX_OWNER");
		list10.add("10/03/2012");
		testTable1.add(list10);
	}
	
	public void buildTestTable2() {
		testTable2 = new ArrayList<List<String>>();
		
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<String> list3 = new ArrayList<String>();
		List<String> list4 = new ArrayList<String>();
		List<String> list5 = new ArrayList<String>();
		List<String> list6 = new ArrayList<String>();
		
		// populate the list
		list1.add("24");
		list1.add("25");
		list1.add("26");
		list1.add("27");
		list1.add("28");
		list1.add("29");
		list1.add("30");
		testTable2.add(list1);
		
		// populate the list
		list2.add("1");
		list2.add("2");
		list2.add("3");
		list2.add("4");
		list2.add("5");
		list2.add("6");
		list2.add("7");
		testTable2.add(list2);
		
		// populate the list
		list3.add("8");
		list3.add("9");
		list3.add("10");
		list3.add("11");
		list3.add("12");
		list3.add("13");
		list3.add("14");
		testTable2.add(list3);
		
		// populate the list
		list4.add("15");
		list4.add("16");
		list4.add("17");
		list4.add("18");
		list4.add("19");
		list4.add("20");
		list4.add("21");
		testTable2.add(list4);
		
		// populate the list
		list5.add("22");
		list5.add("23");
		list5.add("24");
		list5.add("25");
		list5.add("26");
		list5.add("27");
		list5.add("28");
		testTable2.add(list5);
		
		// populate the list
		list6.add("29");
		list6.add("30");
		list6.add("31");
		list6.add("1");
		list6.add("2");
		list6.add("3");
		list6.add("4");
		testTable2.add(list6);
	}
}
