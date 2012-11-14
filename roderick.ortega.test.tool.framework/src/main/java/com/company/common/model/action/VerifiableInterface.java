package com.company.common.model.action;

import com.company.common.types.VerificationParameters;

public interface VerifiableInterface {
	public void verify(VerificationParameters parameters);
	public void haltOnError(VerificationParameters parameters);
	public void continueOnError(VerificationParameters parameters);
}
