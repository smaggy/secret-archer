package com.company.common.model.action;

import java.util.List;

import com.company.common.types.SearchParameters;

public interface SearchableListInterface {
	public List<Integer> searchList(List<String> list, SearchParameters searchParameters);
}
