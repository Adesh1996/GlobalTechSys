package com.OrangeHRM.TestCases;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.Base.TestBase;
import com.OrangeHRM.Pages.DashboardPage;

public class DashBoardTest  extends TestBase{
	
	DashboardPage dashBoardPage;
	@Test(description="This test case will check panel list",groups="Sanity")
	public void panelListCheck() {
		dashBoardPage = new DashboardPage(driver);
		
		Assert.assertTrue(dashBoardPage.linkAdmin.isDisplayed());
		Assert.assertTrue(dashBoardPage.linkLeave.isDisplayed());
	}
	
	
	@Test(dataProvider="getData",dataProviderClass = com.OrangeHRM.Utilities.DataProviderUtils.class)
	public void PanelLinkChecks(Map<String,String> data) { //Map<String,String> data
		dashBoardPage = new DashboardPage(driver);
		dashBoardPage.linkLeave.click();
		Assert.assertEquals(dashBoardPage.headerLeaveList.getText(), "Leave List" , "Expected vs Actual is not matched");
		System.out.println(data.get("EmployeeName"));
	}
	
	
	
}
