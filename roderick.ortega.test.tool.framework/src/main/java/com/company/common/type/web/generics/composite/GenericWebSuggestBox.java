package com.company.common.type.web.generics.composite;

import java.util.List;

import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.composite.AbstractWebSuggestBoxInterface;

public class GenericWebSuggestBox implements AbstractWebSuggestBoxInterface, TestObjectInterface {

	@Override
	public void select(String textToEnter, int numCharsToEnter, boolean selectExact, String otherCriteria, String otherCriteria2) {
		System.out.println("GenericWebSuggestBox|select[1]: " + textToEnter + "|" + numCharsToEnter + "|" + selectExact + "|" + otherCriteria + "|" + otherCriteria2);

	}

	@Override
	public void select(String textToEnter, int numCharsToEnter, boolean selectExact, String otherCriteria) {
		System.out.println("GenericWebSuggestBox|select[2]: " + textToEnter + "|" + numCharsToEnter + "|" + selectExact + "|" + otherCriteria);

	}

	@Override
	public void select(String textToEnter, int numCharsToEnter, boolean selectExact) {
		System.out.println("GenericWebSuggestBox|select[3]: " + textToEnter + "|" + numCharsToEnter + "|" + selectExact);

	}

	@Override
	public void select(String textToEnter, int numCharsToEnter) {
		System.out.println("GenericWebSuggestBox|select[4]: " + textToEnter + "|" + numCharsToEnter);

	}

	@Override
	public void select(String textToEnter) {
		System.out.println("GenericWebSuggestBox|select[5]: " + textToEnter);

	}

	@Override
	public void removeSelection() {
		System.out.println("GenericWebSuggestBox|removeSelection");

	}

	@Override
	public void clearText() {
		System.out.println("GenericWebSuggestBox|clearText");

	}

	@Override
	public List<List<String>> searchAndReturnList(String textToEnter, int numCharsToEnter) {
		System.out.println("GenericWebSuggestBox|searchAndReturnList: " + textToEnter + "|" + numCharsToEnter);
		return null;
	}

	@Override
	public void pickSuggestion(String textSearchedFor, boolean selectExact, String otherCriteria, String otherCriteria2) {
		System.out.println("GenericWebSuggestBox|pickSuggestion: " + textSearchedFor + "|" + selectExact + "|" + otherCriteria + "|" + otherCriteria2);

	}

	@Override
	public boolean exists() {
		// TODO Auto-generated method stub
		return false;
	}
}
