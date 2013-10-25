package com.company.common.types;

import com.company.common.enums.FrameParameterType;

/**
 * Implementation of FrameParameters - Basically a DTO with frame specific data points used by the automation system
 * 
 * @author ortega_e
 *
 */
public class FrameParameters {
	
	private String pageId;
	private String testObjectId;
	private String browserType;
	private FrameParameterType frameParameterType;
	
	public FrameParameters(String pageId) {
		setPageId(pageId);
		setFrameParameterType(FrameParameterType.PAGE_OBJECT);
	}
	
	public FrameParameters(String pageId, String objectId) {
		setPageId(pageId);
		setTestObjectId(objectId);
		setFrameParameterType(FrameParameterType.PAGE_AND_TEST_OBJECT);
	}
	
	public FrameParameters(String pageId, String objectId, String browserType) {
		setPageId(pageId);
		setTestObjectId(objectId);
		setBrowserType(browserType);
		setFrameParameterType(FrameParameterType.PAGE_AND_TEST_OBJECT);
	}
	
	public String getPageId() {
		return pageId;
	}
	
	private void setPageId(String pageId) {
		this.pageId = pageId;
	}
	
	public String getTestObjectId() {
		return testObjectId;
	}
	
	private void setTestObjectId(String testObjectId) {
		this.testObjectId = testObjectId;
	}
	
	public String getBrowserType() {
		return browserType;
	}

	public void setBrowserType(String browserType) {
		this.browserType = browserType;
	}

	public FrameParameterType getFrameParameterType() {
		return frameParameterType;
	}

	private void setFrameParameterType(FrameParameterType frameParameterType) {
		this.frameParameterType = frameParameterType;
	}

	/**
	 * ToString Decorator
	 */
	public String toString() {
		return "[" + pageId + "|" + testObjectId + "|" + browserType + "|" + frameParameterType + "]";
	}
	
}
