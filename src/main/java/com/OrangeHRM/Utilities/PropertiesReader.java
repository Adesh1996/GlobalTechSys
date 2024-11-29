package com.OrangeHRM.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
	
	public static String getValue(String key) {
		String value= null;
		String path = System.getProperty("user.dir") + "//application.properties";
		try {
			FileInputStream fis = new FileInputStream(path);
			Properties prop = new Properties();
			prop.load(fis);
			value = prop.getProperty(key);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
		
	}
	

}
