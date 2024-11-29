package com.OrangeHRM.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.Base.TestBase;
import com.OrangeHRM.Utilities.CommonActions;

public class RecuritmentPage extends TestBase{
	
	public WebDriver driver;
	
	public RecuritmentPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Recruitment']")
	public WebElement linkRecruitment;
	
	@FindBy(xpath="//h6[normalize-space()='Recruitment']")
	public WebElement headerRecruitment;	
	
	@FindBy(xpath="//label[normalize-space()='Job Title']")
	public WebElement labelJobTitle;
	
	@FindBy(xpath="//label[normalize-space()='Vacancy']")
	public WebElement labelVacancy;
	
	@FindBy(xpath="//div[@class='oxd-select-option']")
	public List<WebElement> option;
	
	@FindBy(xpath="(//label[normalize-space()='Job Title']/../..//div)[3]")
	public WebElement dropdownJobTitle;
	
	public void SelectOption(WebElement dropdown, String value) {
		dropdown.click();
		CommonActions.wait(5000);
		if(option.isEmpty()) {
			System.out.println("Options are not visible");
		}
		
		for(int i=0; i<option.size();i++) {
			if(option.get(i).getText().equalsIgnoreCase(value)) {
				System.out.println(option.get(i).getText());
				option.get(i).click();
				break;
			}
		}
		
	}

	

}
