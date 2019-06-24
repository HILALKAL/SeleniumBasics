package com.class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.CommonMethods;

public class HW1 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * TC 1: Tools QA check all elements
         * Open chrome browser
         * Go to “https://www.toolsqa.com/automation-practice-form/”
         * Fill out:
         * First Name
         * Last Name
         * Check that sex radio buttons are enabled and select “Male”
         * Check all Years of Experience radio buttons are clickable
         * Date
         * Select both checkboxes for profession
         * Check all Automation Tools checkboxes are clickable and keep “Selenium WebDriver” option as selected
         * Quit browser
		 */
		
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Celil\\Selenium\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.toolsqa.com/automation-practice-form/");
//		driver.manage().window().maximize();
		setUpDriver("chrome","https://www.toolsqa.com/automation-practice-form/");
		
		
		WebElement name=driver.findElement(By.cssSelector("input[name='firstname']"));
		name.sendKeys("abcd");
		Thread.sleep(1000);
		name.clear();
		name.sendKeys("Kemal");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name*='last']")).sendKeys("Berk");
		Thread.sleep(1000);
		
		WebElement gender=driver.findElement(By.cssSelector("input[name='sex']"));
		System.out.println(gender.isEnabled());
		Thread.sleep(1000);
		
		String selectvalue="Male";
		List<WebElement> genderList=driver.findElements(By.name("sex"));
		for(WebElement test:genderList) {
			if(test.isEnabled()) {
				String value = test.getAttribute("value");
		if(value.equals(selectvalue)) {
				test.click();
		}
		}
		}
		Thread.sleep(1000);
		String yr="6";
	List<WebElement>years=driver.findElements(By.cssSelector("input[name='exp']"));
		for(WebElement exp:years) {
		if(exp.isEnabled()) {
			String vl=exp.getAttribute("value");
			if(vl.equals(yr)) {
				exp.click();
			}
		}
		}
		
			

	
		Thread.sleep(3000);
	}

}
