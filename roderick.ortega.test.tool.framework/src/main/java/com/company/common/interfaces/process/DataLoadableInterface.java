package com.company.common.interfaces.process;

import com.company.demowebapplication.data.DataTransferObject;

public interface DataLoadableInterface {
	public void setDto(DataTransferObject dataTransferObject);
	public DataTransferObject getDto();
}
