package com.company.common.model.action;

public interface KeyableInterface {
	public void pressKeys(String keys);
	public void typeKeys(String keys);
	public void typeKeys(String keys, int delay);
}
