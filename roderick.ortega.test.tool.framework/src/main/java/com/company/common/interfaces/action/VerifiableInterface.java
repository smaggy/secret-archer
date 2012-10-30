package com.company.common.interfaces.action;

public interface VerifiableInterface {
	public void verify();
	public void haltOnError();
	public void continueOnError();
}
