package com.OrangeHRM.Constant;

public class AppConstant {
	
	private AppConstant() {
		throw new IllegalStateException("AppConstant class");
	}
	
	private static final String User_Directory = System.getProperty("user.dir");
	private static final String ChromePath= User_Directory + "//Drivers//chromedriver.exe";
	private static final String ProertiesFilePath = User_Directory + "//application.properties";
	private static final String EdgePath= User_Directory + "//Drivers//msedgedriver.exe";
	
	
	public static final String excelPath=User_Directory +  "//TestData//OrangeHRMTestData.xlsx";
	
	public static String getexcelTestDataPath() {
		return excelPath;
	}
	
	public static String getProertiesFilePath() {
		return ProertiesFilePath;
	}
	
	public static String getEdgePath() {
		return EdgePath;
	}
	
	public static String getUserDirectory() {
		return User_Directory;
	}
	
	public static String getChromePath() {
		return ChromePath;
	}
}
