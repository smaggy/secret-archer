package com.company.common.interfaces.process;

public interface RunnableInterface {
	public void suiteSetup() throws Exception;
	public void testcaseSetup() throws Exception;
	public void testcase() throws Exception;
	public void testcaseTeardown() throws Exception;
	public void suiteTeardown() throws Exception;
}
