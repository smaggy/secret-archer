package com.company.common.types;

import com.company.common.enums.FrameParameterType;

public class FrameParameters {
	
	private String pageId;
	private String testObjectId;
	private FrameParameterType frameParameterType;
	
	public FrameParameters(String pageId) {
		setPageId(pageId);
		setFrameParameterType(FrameParameterType.PAGE_ONLY);
	}
	
	public FrameParameters(String pageId, String objectId) {
		setPageId(pageId);
		setTestObjectId(objectId);
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
	
	public FrameParameterType getFrameParameterType() {
		return frameParameterType;
	}

	private void setFrameParameterType(FrameParameterType frameParameterType) {
		this.frameParameterType = frameParameterType;
	}

	public String toString() {
		return "[" + pageId + "|" + testObjectId + "|" + frameParameterType + "]";
	}
	
}
