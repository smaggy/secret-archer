package com.company.common.model.process;

import com.company.demowebapplication.data.DataTransferObject;

public interface DataLoadableInterface {
	public void setDto(DataTransferObject dataTransferObject);
	public DataTransferObject getDto();
}
