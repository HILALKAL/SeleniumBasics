package com.class12;

import java.util.Properties;

import org.testng.annotations.Test;

import utils.CommonMethods;

/*
 * TC 1: OrangeHRM Login

Navigate to “https://opensource-demo.orangehrmlive.com/”
Login to the application
Verify user is successfully logged in

Note: must use properties file
 */
public class TC1 extends CommonMethods {
	Properties prop;
	
	@Test
	
	public void setUp() {
		
		String filePath="src/configs/credentials.properties";
		setUpDriver(prop.getProperty("browser"), prop.getProperty("url"));
		driver.quit();
		
		
	}
	

}
