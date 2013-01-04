package com.company.common.model.database;

import java.sql.SQLException;
import java.util.List;

public interface DatabaseReadInterface extends DatabaseInterface {
	public List<String> getFieldNames(String sheetName) throws ClassNotFoundException, SQLException;
	public List<String> getFieldValues(String sheetName, String columnName, String columnValue) throws ClassNotFoundException, SQLException;
	public List<List<String>> getFieldNamesAndValues(String sheetName, String columnName, String columnValue) throws ClassNotFoundException, SQLException;
}
