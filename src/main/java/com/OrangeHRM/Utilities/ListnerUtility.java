package com.OrangeHRM.Utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.OrangeHRM.Base.TestBase;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListnerUtility extends TestBase implements ITestListener{
	
	ExtentReports extent = new ExtentReports();
	String path = System.getProperty("user.dir") + "\\Reports\\SparkReport.html";
	ExtentSparkReporter spark = new ExtentSparkReporter(path);
	
	
	@Override
	public void onTestStart(ITestResult result) {
		extent.attachReporter(spark);
		spark.config().setReportName("Global Orange HRM");
		spark.config().setDocumentTitle("Global Orange HRM Result");
		spark.config().setTheme(Theme.DARK);
		spark.config().setTimeStampFormat("MMMM dd, yyyy HH:mm:ss");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		ExtentTest test = extent.createTest(result.getMethod().getDescription());
		test.pass(result.getMethod().getDescription());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
	
		
	}

	@Override
	public void onFinish(ITestContext context) {
	extent.flush();
		
	}

}
