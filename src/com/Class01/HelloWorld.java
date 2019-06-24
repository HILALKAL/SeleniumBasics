package com.Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Celil\\Selenium\\chromedriver.exe")	;
	WebDriver driver=new ChromeDriver();
	driver.get("http://facebook.com");
	}

}
