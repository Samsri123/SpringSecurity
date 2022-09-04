package com.sri.lp.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Size;

public class UserInfo {
	@Size(min = 3, max = 20, message = "* name should be not be blank")
	private String yourName;
	@Size(min = 3, max = 20, message = "* name should be not be blank")
	private String crushName;
	@AssertTrue(message = "agree to use our app")
	private boolean termsAndConditions;
	private String result;

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public boolean isTermsAndConditions() {
		return termsAndConditions;
	}

	public void setTermsAndConditions(boolean termsAndConditions) {
		this.termsAndConditions = termsAndConditions;
	}

	public String getYourName() {
		return yourName;
	}

	public void setYourName(String yourName) {
		this.yourName = yourName;
	}

	public String getCrushName() {
		return crushName;
	}

	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}

}
