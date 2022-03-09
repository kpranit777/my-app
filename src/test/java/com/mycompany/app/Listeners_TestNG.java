package com.mycompany.app;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners_TestNG implements ITestListener {

	@Override
	public void onTestStart(ITestResult result)
	{
		System.out.println(result.getName()+" method started to execute");
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println(result.getName()+" method succeeded");
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println(result.getName()+" method failed");
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
		System.out.println(result.getName()+" method skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		System.out.println("onTestFailedButWithinSuccessPercentage method started "+result.getName());
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result)
	{
		System.out.println("onTestFailedWithTimeout method started "+result.getName());
	}

	@Override
	public void onStart(ITestContext context)
	{
		System.out.println("methods started execution");
	}

	@Override
	public void onFinish(ITestContext context)
	{
		System.out.println("method finished execution");
	}

}
