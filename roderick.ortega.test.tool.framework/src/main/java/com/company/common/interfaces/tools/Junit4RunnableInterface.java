package com.company.common.interfaces.tools;

public interface Junit4RunnableInterface {
	public void beforeClass() throws Exception;
	public void before() throws Exception;
	public void test() throws Exception;
	public void after() throws Exception;
	public void afterClass() throws Exception;
}
