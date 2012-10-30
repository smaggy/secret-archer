package com.company.unit.test.utilities;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.company.common.types.VerificationParameters;
import com.company.common.utils.Verifiable;

public class TestVerifiable {

	@BeforeClass
	public static void beforeClass() {
		
	}
	
	@Before
	public void before() {
		System.out.println("=== NEW TEST ===");
	}
	
	@Test
	public void test01() {
		VerificationParameters params = new VerificationParameters(true, true, "Verify boolean values.");
		Verifiable.verify(params);
	}
	
	@Test
	public void test02() {
		VerificationParameters params = new VerificationParameters(true, false, "Verify boolean values.");
		Verifiable.verify(params);
	}
	
	@Test
	public void test03() {
		VerificationParameters params = new VerificationParameters(1, 1, "Verify int values.");
		Verifiable.verify(params);
	}
	
	@Test
	public void test04() {
		VerificationParameters params = new VerificationParameters(1, 2, "Verify int values.");
		Verifiable.verify(params);
	}
	
	@Test
	public void test05() {
		VerificationParameters params = new VerificationParameters("1", "1", "Verify String values.");
		Verifiable.verify(params);
	}
	
	@Test
	public void test06() {
		VerificationParameters params = new VerificationParameters("1", "2", "Verify String values.");
		Verifiable.verify(params);
	}
	
	@Test
	public void test07() {
		List<String> actual = new ArrayList<String>();
		actual.add("1");
		actual.add("2");
		List<String> expected = new ArrayList<String>();
		expected.add("1");
		expected.add("2");
		VerificationParameters params = new VerificationParameters(actual, expected, "Verify list of string values.");
		Verifiable.verify(params);
	}
	
	@Test
	public void test08() {
		List<String> actual = new ArrayList<String>();
		actual.add("1");
		actual.add("2");
		List<String> expected = new ArrayList<String>();
		expected.add("1");
		expected.add("3");
		VerificationParameters params = new VerificationParameters(actual, expected, "Verify list of string values.");
		Verifiable.verify(params);
	}
	
	@Test
	public void test09() {
		List<String> actual = new ArrayList<String>();
		actual.add("1");
		actual.add("2");
		List<String> expected = new ArrayList<String>();
		expected.add("1");
		expected.add("2");
		expected.add("3");
		VerificationParameters params = new VerificationParameters(actual, expected, "Verify list of string values.");
		Verifiable.verify(params);
	}
	
	@Test
	public void test10() {
		String actual = "test ";
		String expected = "Test";
		VerificationParameters params = new VerificationParameters(actual, expected, "Verify string values.");
		Verifiable.verify(params);
	}
	
	@Test
	public void test11() {
		String actual = "test";
		String expected = "Test";
		VerificationParameters params = new VerificationParameters(actual, expected, "Verify string values.");
		Verifiable.verify(params);
	}
	
	@Test
	public void test12() {
		String actual = "Test";
		String expected = "Test";
		VerificationParameters params = new VerificationParameters(actual, expected, "Verify string values.");
		Verifiable.verify(params);
	}
	
	@Test
	public void test13() {
		String actual = "test";
		String expected = "Test";
		VerificationParameters params = new VerificationParameters(actual, expected, "Verify string values.");
		Verifiable.haltOnError(params);
	}
	
	@Test
	public void test14() {
		String actual = "test";
		String expected = "Test";
		VerificationParameters params = new VerificationParameters(actual, expected, "Verify string values.");
		Verifiable.continueOnError(params);
	}
	
	@Test
	public void test15() {
		boolean actual = true;
		boolean expected = false;
		VerificationParameters params = new VerificationParameters(actual, expected, "Verify boolean values.");
		Verifiable.continueOnError(params);
	}
	
	@Test
	public void test16() {
		int actual = 1;
		int expected = 2;
		VerificationParameters params = new VerificationParameters(actual, expected, "Verify int values.");
		Verifiable.continueOnError(params);
	}
	
	@Test
	public void test17() {
		List<String> actual = new ArrayList<String>();
		actual.add("1");
		actual.add("2");
		List<String> expected = new ArrayList<String>();
		expected.add("1");
		expected.add("2");
		expected.add("3");
		VerificationParameters params = new VerificationParameters(actual, expected, "Verify list of string values.");
		Verifiable.continueOnError(params);
	}
	
	@Test
	public void test18() {
		boolean actual = true;
		boolean expected = false;
		VerificationParameters params = new VerificationParameters(actual, expected, "Verify boolean values.");
		Verifiable.haltOnError(params);
	}
	
	@Test
	public void test19() {
		int actual = 1;
		int expected = 2;
		VerificationParameters params = new VerificationParameters(actual, expected, "Verify int values.");
		Verifiable.haltOnError(params);
	}
	
	@Test
	public void test20() {
		List<String> actual = new ArrayList<String>();
		actual.add("1");
		actual.add("2");
		List<String> expected = new ArrayList<String>();
		expected.add("1");
		expected.add("2");
		expected.add("3");
		VerificationParameters params = new VerificationParameters(actual, expected, "Verify list of string values.");
		Verifiable.haltOnError(params);
	}
	
	@Test
	public void test21() throws Exception {
		throw new Exception("Testing exception in junit runner.");
	}

	@After
	public void after() {
		
	}
	
	@AfterClass
	public static void afterClass() {
		
	}
	
}
