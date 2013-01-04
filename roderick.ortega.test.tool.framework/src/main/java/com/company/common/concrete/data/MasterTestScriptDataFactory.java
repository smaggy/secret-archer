package com.company.common.concrete.data;

import java.io.File;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.model.database.DataInputInterface;
import com.company.common.model.database.DatabaseReadInterface;

public class MasterTestScriptDataFactory implements DataInputInterface {

	private Logger logger = LoggerFactory.getLogger(MasterTestScriptDataFactory.class);
	
	private DatabaseReadInterface databaseReadable;

	public MasterTestScriptDataFactory(File excel2003File) {
		this.databaseReadable = new Excel2003Dao(excel2003File);
	}
	
	public MasterTestScriptDataFactory(String pathToExcel2003File) {
		this.databaseReadable = new Excel2003Dao(pathToExcel2003File);
	}
	
	@Override
	public List<String> getActionHeaders() throws SQLException, ClassNotFoundException {
		logger.debug("Getting Headers from the MasterTestScript Sheet.");
		return databaseReadable.getFieldNames("MasterTestScript");
	}
	
	@Override
	public List<String> getActions(String dataKey) throws ClassNotFoundException, SQLException {
		logger.debug("Getting Actions from the MasterTestScript Sheet with key=[" + dataKey + "]");
		return databaseReadable.getFieldValues("MasterTestScript", "DataKey", dataKey);
	}
	
	@Override
	public MasterTestScriptData getMasterTestScriptData(String dataKey) throws SQLException, ClassNotFoundException {
		logger.debug("Getting Data Object from the MasterTestScript Sheet with key=[" + dataKey + "]");
		List<List<String>> table = databaseReadable.getFieldNamesAndValues("MasterTestScript", "DataKey", dataKey);
		return new MasterTestScriptData(table.get(0), table.get(1));
	}
	
}
