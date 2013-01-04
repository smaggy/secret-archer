package com.company.common.model.database;

import java.sql.SQLException;
import java.util.List;

import com.company.common.concrete.data.MasterTestScriptData;

public interface DataInputInterface {
	public List<String> getActionHeaders() throws Exception;
	public List<String> getActions(String dataKey) throws Exception;
	public MasterTestScriptData getMasterTestScriptData(String dataKey) throws SQLException, ClassNotFoundException;
}
