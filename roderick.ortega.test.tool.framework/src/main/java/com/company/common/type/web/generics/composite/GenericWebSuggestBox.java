package com.company.common.type.web.generics.composite;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.model.test.TestObjectInterface;
import com.company.common.model.type.composite.AbstractWebSuggestBoxInterface;

public class GenericWebSuggestBox implements AbstractWebSuggestBoxInterface, TestObjectInterface {

	final static Logger logger = LoggerFactory.getLogger(GenericWebSuggestBox.class);
	
	@Override
	public void select(String textToEnter, int numCharsToEnter, boolean selectExact, String otherCriteria, String otherCriteria2) {
		logger.debug("GenericWebSuggestBox|select[1]: " + textToEnter + "|" + numCharsToEnter + "|" + selectExact + "|" + otherCriteria + "|" + otherCriteria2);

	}

	@Override
	public void select(String textToEnter, int numCharsToEnter, boolean selectExact, String otherCriteria) {
		logger.debug("GenericWebSuggestBox|select[2]: " + textToEnter + "|" + numCharsToEnter + "|" + selectExact + "|" + otherCriteria);

	}

	@Override
	public void select(String textToEnter, int numCharsToEnter, boolean selectExact) {
		logger.debug("GenericWebSuggestBox|select[3]: " + textToEnter + "|" + numCharsToEnter + "|" + selectExact);

	}

	@Override
	public void select(String textToEnter, int numCharsToEnter) {
		logger.debug("GenericWebSuggestBox|select[4]: " + textToEnter + "|" + numCharsToEnter);

	}

	@Override
	public void select(String textToEnter) {
		logger.debug("GenericWebSuggestBox|select[5]: " + textToEnter);

	}

	@Override
	public void removeSelection() {
		logger.debug("GenericWebSuggestBox|removeSelection");

	}

	@Override
	public void clearText() {
		logger.debug("GenericWebSuggestBox|clearText");

	}

	@Override
	public List<List<String>> searchAndReturnList(String textToEnter, int numCharsToEnter) {
		logger.debug("GenericWebSuggestBox|searchAndReturnList: " + textToEnter + "|" + numCharsToEnter);
		return null;
	}

	@Override
	public void pickSuggestion(String textSearchedFor, boolean selectExact, String otherCriteria, String otherCriteria2) {
		logger.debug("GenericWebSuggestBox|pickSuggestion: " + textSearchedFor + "|" + selectExact + "|" + otherCriteria + "|" + otherCriteria2);

	}

	@Override
	public boolean exists() {
		logger.debug("GenericWebSuggestBox|exists");
		return false;
	}
}
