package com.OrangeHRM.Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.OrangeHRM.Constant.AppConstant;
import com.OrangeHRM.Pages.LoginPage;
import com.OrangeHRM.Utilities.PropertiesReader;

public class TestBase {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public WebDriver InitializeDriver() {
		
		String browserName= PropertiesReader.getValue("browser.Type");
		System.out.println(browserName);
		
		if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", AppConstant.getChromePath());
			 driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", AppConstant.getEdgePath());
			 driver = new EdgeDriver();
		}
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get(PropertiesReader.getValue("application.url"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.LoginToApplication();
		return driver;
	}
	
	@AfterMethod
	public void teardown() {
	//	driver.quit();
	}
	
//	@Test
//	public void Test() {}

}
