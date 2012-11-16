package com.company.common.type.web.mock.composite;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.model.test.TestObjectInterface;
import com.company.common.model.type.composite.AbstractWebSuggestBoxInterface;

public class MockWebSuggestBox implements AbstractWebSuggestBoxInterface, TestObjectInterface {

	final static Logger logger = LoggerFactory.getLogger(MockWebSuggestBox.class);
	
	@Override
	public void select(String textToEnter, int numCharsToEnter, boolean selectExact, String otherCriteria, String otherCriteria2) {
		logger.debug("MockWebSuggestBox|select[1]: " + textToEnter + "|" + numCharsToEnter + "|" + selectExact + "|" + otherCriteria + "|" + otherCriteria2);

	}

	@Override
	public void select(String textToEnter, int numCharsToEnter, boolean selectExact, String otherCriteria) {
		logger.debug("MockWebSuggestBox|select[2]: " + textToEnter + "|" + numCharsToEnter + "|" + selectExact + "|" + otherCriteria);

	}

	@Override
	public void select(String textToEnter, int numCharsToEnter, boolean selectExact) {
		logger.debug("MockWebSuggestBox|select[3]: " + textToEnter + "|" + numCharsToEnter + "|" + selectExact);

	}

	@Override
	public void select(String textToEnter, int numCharsToEnter) {
		logger.debug("MockWebSuggestBox|select[4]: " + textToEnter + "|" + numCharsToEnter);

	}

	@Override
	public void select(String textToEnter) {
		logger.debug("MockWebSuggestBox|select[5]: " + textToEnter);

	}

	@Override
	public void removeSelection() {
		logger.debug("MockWebSuggestBox|removeSelection");

	}

	@Override
	public void clearText() {
		logger.debug("MockWebSuggestBox|clearText");

	}

	@Override
	public List<List<String>> searchAndReturnList(String textToEnter, int numCharsToEnter) {
		logger.debug("MockWebSuggestBox|searchAndReturnList: " + textToEnter + "|" + numCharsToEnter);
		return null;
	}

	@Override
	public void pickSuggestion(String textSearchedFor, boolean selectExact, String otherCriteria, String otherCriteria2) {
		logger.debug("MockWebSuggestBox|pickSuggestion: " + textSearchedFor + "|" + selectExact + "|" + otherCriteria + "|" + otherCriteria2);

	}

	@Override
	public boolean exists() {
		logger.debug("MockWebSuggestBox|exists");
		return false;
	}
}
