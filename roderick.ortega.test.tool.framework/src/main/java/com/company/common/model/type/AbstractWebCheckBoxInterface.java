package com.company.common.model.type;

public interface AbstractWebCheckBoxInterface extends AbstractWebElementInterface {
	public void check();
	public void uncheck();
	public int getState();
}
