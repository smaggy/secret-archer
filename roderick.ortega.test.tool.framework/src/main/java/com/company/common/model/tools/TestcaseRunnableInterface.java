package com.company.common.model.tools;

import com.company.common.model.action.BrowseableInterface;
import com.company.common.model.process.GuiFactoryLoadableInterface;

public interface TestcaseRunnableInterface extends BrowseableInterface, GuiFactoryLoadableInterface {
	public void testcaseSetup() throws Exception;
	public void testcase() throws Exception;
	public void testcaseTeardown() throws Exception;
}
