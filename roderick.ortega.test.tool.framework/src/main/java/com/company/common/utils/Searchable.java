package com.company.common.utils;

import java.util.ArrayList;
import java.util.List;

import com.company.common.types.SearchParameters;
import com.company.common.types.TableCell;

public class Searchable {

	protected Searchable() {
		// protect the class since only static class
	}
	
	public static List<Integer> searchList(List<String> list, SearchParameters searchParameters) {
		List<Integer> hits = new ArrayList<Integer>();
		int counter = 1;
		for (String item : list) {
			
			if (searchParameters.isExplicitSearch()) {
				if (item.contentEquals((searchParameters.getMainSearch()))) {
					hits.add(counter);
				}
			}
			else {
				if (item.contains((searchParameters.getMainSearch()))) {
					hits.add(counter);
				}
			}
			
			counter = counter + 1;
		}
		return hits;
	}

	public static List<TableCell> searchTable(List<List<String>> table, SearchParameters searchParameters) {
		List<TableCell> hits = new ArrayList<TableCell>();
		
		String main = searchParameters.getMainSearch();
		String firstQualifier = searchParameters.getFirstQualifier();
		String secondQualifier = searchParameters.getSecondQualifier();
		String thirdQualifier = searchParameters.getThirdQualifier();
		
		if (firstQualifier == null) {
			firstQualifier = "";
		}
		if (secondQualifier == null) {
			secondQualifier = "";
		}
		if (thirdQualifier == null) {
			thirdQualifier = "";
		}
		
		int rowCounter = 1;
		int colCounter = 1;
		
		for (List<String> rows : table) {
			
			for (String cell : rows) {
				
				if (searchParameters.isExplicitSearch()) {
					if (cell.contentEquals(main.trim()) && searchList(rows, new SearchParameters(firstQualifier)).size() != 0 && searchList(rows, new SearchParameters(secondQualifier)).size() != 0 && searchList(rows, new SearchParameters(thirdQualifier)).size() != 0) {
						hits.add(new TableCell(rowCounter, colCounter));
					}
				}
				else {
					if (cell.contains(main.trim()) && searchList(rows, new SearchParameters(firstQualifier)).size() != 0 && searchList(rows, new SearchParameters(secondQualifier)).size() != 0 && searchList(rows, new SearchParameters(thirdQualifier)).size() != 0) {
						hits.add(new TableCell(rowCounter, colCounter));
					}
				}
				
				colCounter = colCounter + 1;
				
			}
			
			rowCounter = rowCounter + 1;
			colCounter = 1;
		}
		
		return hits;
	}
	
	public static List<String> normalizeList(List<String> list) {
		List<String> retList = new ArrayList<String>();
		for (String item : list) {
			retList.add(item.toLowerCase().trim());
		}
		return retList;
	}
	
	public static List<List<String>> normalizeTable(List<List<String>> table) {
		
		List<List<String>> retTable = new ArrayList<List<String>>();
		
		for (List<String> row : table) {
			List<String> newRow = new ArrayList<String>();
			for (String item : row) {
				newRow.add(item.toLowerCase().trim());
			}
			retTable.add(newRow);
		}
		
		return retTable;
	}
}
