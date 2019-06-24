package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * TC 2: Syntax Page URL Verification:
Open chrome browser
Navigate to “https://www.syntaxtechs.com/”
Navigate to “https://www.google.com/”
Navigate back to Syntax Technologies Page
Refresh current page
Verify url contains “Syntax”
		 */
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Celil\\Selenium\\chromedriver.exe")	;
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.syntaxtechs.com/");
		Thread.sleep(1000);
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().refresh();
		
		String url=driver.getCurrentUrl();
		 if (url.contains("syntax")) {
		        System.out.println("valid title");
		    }
		    else {
		        System.out.println("invalid title");
		    }
		 driver.close();//driver.quit();
		
	}

}
