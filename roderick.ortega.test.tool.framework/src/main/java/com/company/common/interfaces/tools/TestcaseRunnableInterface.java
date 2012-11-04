package com.company.common.interfaces.tools;

import com.company.common.interfaces.action.BrowseableInterface;
import com.company.common.interfaces.process.GuiFactoryLoadableInterface;

public interface TestcaseRunnableInterface extends BrowseableInterface, GuiFactoryLoadableInterface {
	public void testcaseSetup() throws Exception;
	public void testcase() throws Exception;
	public void testcaseTeardown() throws Exception;
}
