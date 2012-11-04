package com.company.common.interfaces.tools;

public interface SuiteRunnableInterface extends TestcaseRunnableInterface {
	public void suiteSetup() throws Exception;
	public void suiteTeardown() throws Exception;
}
