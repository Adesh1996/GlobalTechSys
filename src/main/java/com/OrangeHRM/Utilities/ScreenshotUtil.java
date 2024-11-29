package com.OrangeHRM.Utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.OrangeHRM.Base.TestBase;

public final class ScreenshotUtil  extends TestBase{
	
	static WebDriver driver;
	
	public static String getBase64img(WebDriver driver) {
		ScreenshotUtil.driver= driver;
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
	}

}
