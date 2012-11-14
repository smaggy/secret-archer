package com.company.common.model.type.composite;

import java.util.List;

public interface AbstractWebSuggestBoxInterface {
	public void select(String textToEnter, int numCharsToEnter, boolean selectExact, String otherCriteria, String otherCriteria2);
	public void select(String textToEnter, int numCharsToEnter, boolean selectExact, String otherCriteria);
	public void select(String textToEnter, int numCharsToEnter, boolean selectExact);
	public void select(String textToEnter, int numCharsToEnter);
	public void select(String textToEnter);
	public void removeSelection();
	public void clearText();
	public List<List<String>> searchAndReturnList(String textToEnter, int numCharsToEnter);
	public void pickSuggestion(String textSearchedFor, boolean selectExact, String otherCriteria, String otherCriteria2);
}
