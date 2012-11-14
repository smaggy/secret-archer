package com.company.common.model.tools;

public interface SuiteRunnableInterface extends TestcaseRunnableInterface {
	public void suiteSetup() throws Exception;
	public void suiteTeardown() throws Exception;
}
