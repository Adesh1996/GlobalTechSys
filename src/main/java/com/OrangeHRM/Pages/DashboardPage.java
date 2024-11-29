package com.OrangeHRM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
	
	public  WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath= "//span[text()='Admin']")
	public WebElement linkAdmin;
	
	@FindBy(xpath= "//span[text()='Leave']")
	public WebElement linkLeave;
	
	@FindBy(xpath="//h5[normalize-space()='Leave List']")
	public WebElement headerLeaveList;
}
