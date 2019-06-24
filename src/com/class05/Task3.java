package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.CommonMethods;

public class Task3 extends CommonMethods{
/*
 * * Check all Years of Experience radio buttons are clickable
* -----------------------------------------------
* Check all Automation Tools checkboxes are clickable
* and keep “Selenium WebDriver” option as selected
 */
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Celil\\Selenium\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		
//		driver.get("https://www.toolsqa.com/automation-practice-form/");
		setUpDriver("chrome","https://www.toolsqa.com/automation-practice-form/");
		
//		List<WebElement> radioExp=driver.findElements(By.xpath("//input[@name='exp']"));
//		for (WebElement radio: radioExp) {
//			if(radio.isEnabled()) {
//				radio.click();
//				Thread.sleep(2000);
//			}
//		}
		Thread.sleep(2000);
		String select="Selenium WebDriver";
		List<WebElement> checkBox=driver.findElements(By.cssSelector("input[name='tool']"));
		for(WebElement check:checkBox) {
			if(check.isEnabled()) {
				String value=check.getAttribute("value");
				if(value.equals(select)) {
					check.click();
				}
			}
		}
		driver.quit();
	}

}
