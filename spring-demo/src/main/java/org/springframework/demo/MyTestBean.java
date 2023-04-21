package org.springframework.demo;

public class MyTestBean {
	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}

	private String testStr = "test";

}
