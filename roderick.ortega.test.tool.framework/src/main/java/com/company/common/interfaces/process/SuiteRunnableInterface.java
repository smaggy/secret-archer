package com.company.common.interfaces.process;

public interface SuiteRunnableInterface extends TestcaseRunnableInterface {
	public void suiteSetup() throws Exception;
	public void suiteTeardown() throws Exception;
}
