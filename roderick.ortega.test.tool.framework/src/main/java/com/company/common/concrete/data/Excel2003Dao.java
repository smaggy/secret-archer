package com.company.common.concrete.data;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.model.database.DatabaseReadInterface;

public final class Excel2003Dao implements DatabaseReadInterface {
	
	private static Logger logger = LoggerFactory.getLogger(Excel2003Dao.class);
	
	static final String DRIVER = "sun.jdbc.odbc.JdbcOdbcDriver";
	
	static final String KEY_FILE_PATH = "##KEY_FILE_PATH##";
	static final String KEY_SHEET = "##SHEET@NAME##";
	static final String KEY_COLUMN = "##DATA@KEY##";
	static final String KEY_COLUMN_VALUE = "##DATA@KEY@VALUE##";
	
	static final String TEMPLATE_CONNECTION_STRING = "jdbc:odbc:Driver={Microsoft Excel Driver (*.xls)};DriverID=22;READONLY=false;DBQ=" + KEY_FILE_PATH + ";";
	static final String TEMPLATE_SQL_READ_BASIC = "SELECT * FROM [" + KEY_SHEET + "$]";
	static final String TEMPLATE_SQL_READ_WITH_WHERE_BASIC = "SELECT * FROM [" + KEY_SHEET + "$] WHERE " + KEY_COLUMN + " = '" + KEY_COLUMN_VALUE + "'";
	
	private File excel2003File;
	private String pathToExcel2003File;
	private String connectionString;
	private String dbUsername;
	private String dbPassword;
	
	public File getExcel2003File() {
		return excel2003File;
	}

	public void setExcel2003File(File excel2003File) {
		this.excel2003File = excel2003File;
	}

	public String getPathToExcel2003File() {
		return pathToExcel2003File;
	}

	public void setPathToExcel2003File(String pathToExcel2003File) {
		this.pathToExcel2003File = pathToExcel2003File;
	}
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	@Override
	public String getDbUsername() {
		if (dbUsername==null) {
			return "";
		}
		else {
			return dbUsername;
		}
	}

	@Override
	public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}

	@Override
	public String getDbPassword() {
		if (dbPassword==null) {
			return "";
		}
		else {
			return dbPassword;
		}
	}

	@Override
	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}

	public Excel2003Dao(File excel2003File) {
		this.setExcel2003File(excel2003File);
	}
	
	public Excel2003Dao(String pathToExcel2003File) {
		this.setPathToExcel2003File(pathToExcel2003File);
		this.setExcel2003File(new File(this.getPathToExcel2003File()));
	}
	
	@Override
	public List<String> getFieldNames(String sheetName) throws SQLException, ClassNotFoundException {
		Class.forName(DRIVER);
		setConnectionString(TEMPLATE_CONNECTION_STRING.replace(KEY_FILE_PATH, getExcel2003File().getAbsolutePath()));
		
		List<String> fieldNames = new ArrayList<String>();
		
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		logger.debug("Getting Field Names from Table");
		
		try {
			connection = DriverManager.getConnection(getConnectionString(), getDbUsername(), getDbPassword());
			statement = connection.createStatement();
			String query = TEMPLATE_SQL_READ_BASIC.replace(KEY_SHEET, sheetName);
			resultSet = statement.executeQuery(query);
			ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
			
			for (int j = 0; j < resultSetMetaData.getColumnCount() ; j++) {
				fieldNames.add(resultSetMetaData.getColumnName(j+1));
		    }
		}
		catch (Throwable t) {
			t.printStackTrace();
			
			if (connection != null) {
				connection.close();
			}
			if (statement != null) {
				statement.close();
			}
			if (resultSet != null) {
				resultSet.close();
			}
			
		}
		
		return fieldNames;
	}
	
	@Override
	public List<String> getFieldValues(String sheetName, String columnName, String columnValue) throws ClassNotFoundException, SQLException {
		Class.forName(DRIVER);
		setConnectionString(TEMPLATE_CONNECTION_STRING.replace(KEY_FILE_PATH, getExcel2003File().getAbsolutePath()));
		
		List<List<String>> resultTable = new ArrayList<List<String>>();
		
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		int columnCount;
		
		logger.debug("Getting Field Values from Table");
		
		try {
			connection = DriverManager.getConnection(getConnectionString(), getDbUsername(), getDbPassword());
			statement = connection.createStatement();
			String query = TEMPLATE_SQL_READ_WITH_WHERE_BASIC.replace(KEY_SHEET, sheetName).replace(KEY_COLUMN, columnName).replace(KEY_COLUMN_VALUE, columnValue);
			resultSet = statement.executeQuery(query);
			
			ResultSetMetaData rsmd = resultSet.getMetaData();
			columnCount = rsmd.getColumnCount();
			
			// TODO: need to throw custom exception indicating more than 1 row is found.
			while (resultSet.next()) {
				List<String> fieldValues = new ArrayList<String>();
				for (int i = 1; i < columnCount; i++) {
					fieldValues.add(resultSet.getString(i));
				}
				resultTable.add(fieldValues);
			}
			
		}
		catch (Throwable t) {
			t.printStackTrace();
			
			if (connection != null) {
				connection.close();
			}
			if (statement != null) {
				statement.close();
			}
			if (resultSet != null) {
				resultSet.close();
			}
			
		}
		
		// TODO: Throw custom exception in the event that there is more than one row
		// TODO: Throw custom exception in the event that there are no rows
		// TODO: Throw custom exception in the event that the columns do not match the number of data points
		return resultTable.get(1);
	}

	@Override
	public List<List<String>> getFieldNamesAndValues(String sheetName, String columnName, String columnValue) throws ClassNotFoundException, SQLException {
		Class.forName(DRIVER);
		setConnectionString(TEMPLATE_CONNECTION_STRING.replace(KEY_FILE_PATH, getExcel2003File().getAbsolutePath()));
		
		List<List<String>> retTable = new ArrayList<List<String>>();
		List<String> fieldNames = new ArrayList<String>();
		
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		int columnCount;
		
		logger.debug("Getting Field Names and Field Values from Table");
		
		try {
			connection = DriverManager.getConnection(getConnectionString(), getDbUsername(), getDbPassword());
			statement = connection.createStatement();
			String query = TEMPLATE_SQL_READ_WITH_WHERE_BASIC.replace(KEY_SHEET, sheetName).replace(KEY_COLUMN, columnName).replace(KEY_COLUMN_VALUE, columnValue);
			resultSet = statement.executeQuery(query);
			
			ResultSetMetaData rsmd = resultSet.getMetaData();
			columnCount = rsmd.getColumnCount();
			
			// get the field names
			for (int j = 0; j < columnCount ; j++) {
				fieldNames.add(rsmd.getColumnName(j+1));
		    }
			
			// add field names to the return object
			retTable.add(fieldNames);
			
			while (resultSet.next()) {
				List<String> fieldValues = new ArrayList<String>();
				for (int i = 1; i < columnCount; i++) {
					fieldValues.add(resultSet.getString(i));
				}
				// add field values to the return object
				retTable.add(fieldValues);
			}
			
		}
		catch (Throwable t) {
			t.printStackTrace();
			
			if (connection != null) {
				connection.close();
			}
			if (statement != null) {
				statement.close();
			}
			if (resultSet != null) {
				resultSet.close();
			}
			
		}
		
		// TODO: need to throw custom exception indicating more than 2 rows are found.
		return retTable;
	}

}
