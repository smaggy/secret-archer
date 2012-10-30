package com.company.common.utils;

import junit.framework.Assert;
import junit.framework.AssertionFailedError;

import com.company.common.types.VerificationParameters;

public class Verifiable {
	
	protected Verifiable() {
		// protect the class since only static class
	}
	
	public static void verify(VerificationParameters parameters) {

		switch (parameters.getVerificationType()) {

		case INTEGER_VERIFICATION:

			System.out.println("[verify] ... Attempt Integer Assertion for '" + parameters.getVerificationMessage() + "'");
			Assert.assertEquals(parameters.getiExpected(), parameters.getiActual());
			break;

		case BOOLEAN_VERIFICATION:

			System.out.println("[verify] ... Attempt Boolean Assertion for '" + parameters.getVerificationMessage() + "'");
			Assert.assertEquals(parameters.isbExpected(), parameters.isbActual());
			break;

		case STRING_VERIFICATION:

			System.out.println("[verify] ... Attempt String Assertion for '" + parameters.getVerificationMessage() + "'");
			Assert.assertEquals(parameters.getsExpected(), parameters.getsActual());
			break;

		case LIST_OF_STRING_VERIFICATION:

			System.out.println("[verify] ... Attempt List of String Assertion for '" + parameters.getVerificationMessage() + "'");
			Assert.assertEquals(parameters.getLsExpected(), parameters.getLsActual());
			break;

		default:
			System.out.println("[verify] ... Verifiable|verify - invalid condition reached.  Throwing and assertion error.");
			Assert.fail("Invalid condition encountered.");
			break;

		}
		
	}
	
	public static void continueOnError(VerificationParameters parameters) {
		
		try {
			
			System.out.println("[continueOnError] ... Attempting verification for [" + parameters + "]");
			Verifiable.verify(parameters);
		
		}
		catch (AssertionFailedError f) {
			System.out.println("[continueOnError] ... continue on error set.  printing stack trace but allowing testcase to proceed with other verifications.");
			f.printStackTrace();
		}

	}
	
	public static void haltOnError(VerificationParameters parameters) {
		
		try {
			System.out.println("[haltOnError] ... Attempting verification for [" + parameters + "]");
			Verifiable.verify(parameters);
		}
		catch (AssertionFailedError f) {
			System.out.println("[haltOnError] ... Verification failed for [" + parameters + "]");
			f.printStackTrace();
			throw f;
		}
	}

}
