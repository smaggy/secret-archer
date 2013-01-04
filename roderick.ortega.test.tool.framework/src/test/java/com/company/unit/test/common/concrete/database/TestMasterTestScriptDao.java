package com.company.unit.test.common.concrete.database;

import java.io.File;
import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.company.common.concrete.data.MasterTestScriptDataFactory;
import com.company.common.concrete.data.MasterTestScriptData;

public class TestMasterTestScriptDao {
	
	private Logger logger = LoggerFactory.getLogger(TestMasterTestScriptDao.class);
	
	private MasterTestScriptDataFactory masterTestScriptDao;
	
	@Before
	public void before() {
		System.out.println(" ===== NEW TEST ===== ");
		this.masterTestScriptDao = new MasterTestScriptDataFactory(new File("./Resources/DataSheets/TestSample/Excel2003/TestSampleData.xls"));
	}
	
	@Test
	public void test01() throws SQLException, ClassNotFoundException {
		logger.info(masterTestScriptDao.getActionHeaders().toString());
	}
	
	@Test
	public void test02() throws Throwable {
		logger.info(masterTestScriptDao.getActionHeaders().toString());
		logger.info(masterTestScriptDao.getActions("SampleData02").toString());
	}
	
	@Test
	public void test03() throws Throwable {
		MasterTestScriptData masterTestScriptDto = masterTestScriptDao.getMasterTestScriptData("SampleData02");
		logger.info(masterTestScriptDto.getActionHeaders().toString());
		logger.info(masterTestScriptDto.getActions().toString());
	}
	
	@After
	public void after() {
			
	}
	
}
