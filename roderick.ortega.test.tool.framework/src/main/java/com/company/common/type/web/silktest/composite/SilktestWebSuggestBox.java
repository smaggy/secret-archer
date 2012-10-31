package com.company.common.type.web.silktest.composite;

import java.util.List;

import com.company.common.interfaces.test.TestObjectInterface;
import com.company.common.interfaces.type.composite.AbstractWebSuggestBoxInterface;

public class SilktestWebSuggestBox implements AbstractWebSuggestBoxInterface, TestObjectInterface {

	@Override
	public void select(String textToEnter, int numCharsToEnter, boolean selectExact, String otherCriteria, String otherCriteria2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void select(String textToEnter, int numCharsToEnter, boolean selectExact, String otherCriteria) {
		// TODO Auto-generated method stub

	}

	@Override
	public void select(String textToEnter, int numCharsToEnter, boolean selectExact) {
		// TODO Auto-generated method stub

	}

	@Override
	public void select(String textToEnter, int numCharsToEnter) {
		// TODO Auto-generated method stub

	}

	@Override
	public void select(String textToEnter) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeSelection() {
		// TODO Auto-generated method stub

	}

	@Override
	public void clearText() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<List<String>> searchAndReturnList(String textToEnter, int numCharsToEnter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void pickSuggestion(String textSearchedFor, boolean selectExact, String otherCriteria, String otherCriteria2) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean exists() {
		// TODO Auto-generated method stub
		return false;
	}

}
