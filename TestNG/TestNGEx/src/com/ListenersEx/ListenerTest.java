package com.ListenersEx;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class ListenerTest implements ITestListener {
 
@Override
public void onTestStart(ITestResult result) {
}

@Override
public void onTestSuccess(ITestResult result) {
}

@Override
public void onTestFailure(ITestResult result) {
	try {
		GetScreenShot.capture(result.getName());
		
	}catch(Exception e) {
		e.printStackTrace();
	}
}

@Override
public void onTestSkipped(ITestResult result) {
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
}

@Override
public void onStart(ITestContext result) {
}

@Override
public void onFinish(ITestContext context) {
}
}
