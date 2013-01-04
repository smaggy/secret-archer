package com.company.common.concrete.data;

import java.util.List;

public class MasterTestScriptData {
	private List<String> actionHeaders;
	private List<String> actions;
	
	public List<String> getActionHeaders() {
		return actionHeaders;
	}
	
	public void setActionHeaders(List<String> actionHeaders) {
		this.actionHeaders = actionHeaders;
	}
	
	public List<String> getActions() {
		return actions;
	}
	
	public void setActions(List<String> actions) {
		this.actions = actions;
	}
	
	public MasterTestScriptData(List<String> actionHeaders, List<String> actions) {
		this.setActionHeaders(actionHeaders);
		this.setActions(actions);
	}
	
}
