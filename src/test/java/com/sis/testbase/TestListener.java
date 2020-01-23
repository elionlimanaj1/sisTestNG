package com.sis.testbase;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.sis.utils.CommonMethods;

public class TestListener extends CommonMethods implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Test Started: " + result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed -> " + result.getName());
		takeScreenshot("passed/" + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed -> " + result.getName());
		takeScreenshot("failed/" + result.getName());
	}
}