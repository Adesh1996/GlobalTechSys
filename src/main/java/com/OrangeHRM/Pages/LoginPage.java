package com.OrangeHRM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.OrangeHRM.Base.TestBase;
import com.OrangeHRM.Utilities.CommonActions;

public class LoginPage extends TestBase{
	
	public  WebDriver driver;
	CommonActions commonActions;
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement textBoxUsername;

	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement textBoxPassword;
	
	@FindBy(css= "button[type='submit']")
	private WebElement buttonLogin;
	
	public void LoginToApplication() {
		commonActions = new CommonActions();
		commonActions.enters_data("Admin", textBoxUsername);
		commonActions.enters_data("admin123", textBoxPassword);
		
		Assert.assertTrue(buttonLogin.isEnabled());
		buttonLogin.click();
	}
	

}
