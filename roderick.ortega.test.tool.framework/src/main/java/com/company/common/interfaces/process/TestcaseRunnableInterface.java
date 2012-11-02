package com.company.common.interfaces.process;

public interface TestcaseRunnableInterface {
	public void testcaseSetup() throws Exception;
	public void testcase() throws Exception;
	public void testcaseTeardown() throws Exception;
}
