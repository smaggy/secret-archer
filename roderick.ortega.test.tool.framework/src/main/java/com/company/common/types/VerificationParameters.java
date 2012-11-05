package com.company.common.types;

import java.util.List;

import com.company.common.enums.VerificationType;

public class VerificationParameters {
	
	private String verificationMessage;
	private boolean bActual;
	private boolean bExpected;
	private String sActual;
	private String sExpected;
	private int iActual;
	private int iExpected;
	private List<String> lsActual;
	private List<String> lsExpected;
	private VerificationType verificationType;
	
	public VerificationParameters(boolean actual, boolean expected, String verificationMessage) {
		setVerificationMessage(verificationMessage);
		setbActual(actual);
		setbExpected(expected);
		setVerificationType(VerificationType.BOOLEAN_VERIFICATION);
	}
	
	public VerificationParameters(String actual, String expected, String verificationMessage) {
		setVerificationMessage(verificationMessage);
		setsActual(actual);
		setsExpected(expected);
		setVerificationType(VerificationType.STRING_VERIFICATION);
	}
	
	public VerificationParameters(int actual, int expected, String verificationMessage) {
		setVerificationMessage(verificationMessage);
		setiActual(actual);
		setiExpected(expected);
		setVerificationType(VerificationType.INTEGER_VERIFICATION);
	}
	
	public VerificationParameters(List<String> actual, List<String> expected, String verificationMessage) {
		setVerificationMessage(verificationMessage);
		setLsActual(actual);
		setLsExpected(expected);
		setVerificationType(VerificationType.LIST_OF_STRING_VERIFICATION);
	}
	
	public String getVerificationMessage() {
		return verificationMessage;
	}

	private void setVerificationMessage(String verificationMessage) {
		this.verificationMessage = verificationMessage;
	}

	public boolean isbActual() {
		return bActual;
	}
	
	private void setbActual(boolean bActual) {
		this.bActual = bActual;
	}
	
	public boolean isbExpected() {
		return bExpected;
	}
	
	private void setbExpected(boolean bExpected) {
		this.bExpected = bExpected;
	}
	
	public String getsActual() {
		return sActual;
	}
	
	private void setsActual(String sActual) {
		this.sActual = sActual;
	}
	
	public String getsExpected() {
		return sExpected;
	}
	
	private void setsExpected(String sExpected) {
		this.sExpected = sExpected;
	}
	
	public int getiActual() {
		return iActual;
	}
	
	private void setiActual(int iActual) {
		this.iActual = iActual;
	}
	
	public int getiExpected() {
		return iExpected;
	}
	
	private void setiExpected(int iExpected) {
		this.iExpected = iExpected;
	}
	
	public List<String> getLsActual() {
		return lsActual;
	}
	
	private void setLsActual(List<String> lsActual) {
		this.lsActual = lsActual;
	}
	
	public List<String> getLsExpected() {
		return lsExpected;
	}
	
	private void setLsExpected(List<String> lsExpected) {
		this.lsExpected = lsExpected;
	}
	
	public VerificationType getVerificationType() {
		return verificationType;
	}

	private void setVerificationType(VerificationType verificationType) {
		this.verificationType = verificationType;
	}
	
	public String toString() {
		return "[" + getVerificationMessage() + "]";
	}
	
}
