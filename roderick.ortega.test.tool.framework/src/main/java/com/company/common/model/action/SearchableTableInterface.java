package com.company.common.model.action;

import java.util.List;

import com.company.common.types.SearchParameters;
import com.company.common.types.TableCell;

public interface SearchableTableInterface {
	public List<TableCell> searchTable(List<List<String>> table, SearchParameters searchParameters);
}
