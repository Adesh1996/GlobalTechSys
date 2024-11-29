package com.OrangeHRM.TestCases;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.Base.TestBase;
import com.OrangeHRM.Pages.RecuritmentPage;
import com.OrangeHRM.Utilities.CommonActions;

public class RecuritmentPageTest extends TestBase {
	
	RecuritmentPage recuritmentPage;
	CommonActions commonactions ;
	
	@Test
	public void JobTitleRecuritment() {
		recuritmentPage = new RecuritmentPage(driver);
		commonactions  = new CommonActions(); 
		commonactions.click_on_Element(recuritmentPage.linkRecruitment);
		
		Assert.assertTrue(recuritmentPage.headerRecruitment.isDisplayed());
		recuritmentPage.SelectOption(recuritmentPage.dropdownJobTitle, "QA Lead");
		
	}
	
}
