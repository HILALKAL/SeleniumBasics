package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {

	public static void main(String[] args) {
		/*
		 * TC 1: Amazon Page Title Verification:
           Open chrome browser
           Go to “https://www.amazon.com/”
           Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed
		 */
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Celil\\Selenium\\chromedriver.exe")	;
		WebDriver driver=new ChromeDriver();
		driver.get("http://amazon.com");
		System.out.println(driver.getTitle());
		String title=driver.getTitle();
		if(title.equalsIgnoreCase(":Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")){
			System.out.println("this is the rigth title");
		}else {
			System.out.println("sorry this not rigth title");
		}

	}

}
