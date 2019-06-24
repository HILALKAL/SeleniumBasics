package com.class11;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class TC extends CommonMethods{

	public static void main(String[]args) {
		
		String url="https://opensource-demo.orangehrmlive.com/";
		setUpDriver("chrome", url);
		
		 sendText(driver.findElement(By.xpath("//span[@class='form-hint']/preceding-sibling::input")), "Admin");
	        
         sendText(driver.findElement(By.xpath("//span[text()='Password']/preceding-sibling::input")), "admin123");
     
		driver.findElement(By.cssSelector("input#btnLogin")).click();
	
//		driver.findElement(By.xpath("//div[@id='divUsername']/input")).sendKeys("Admin");
//        if(driver.findElement(By.xpath("//input[@id='txtPassword']/..")).isDisplayed()) {
//            System.out.println("Element is displayed");
//        }else {
//            System.out.println("None");
//        }
//        //find preceding/previous sibling from current WebElement
//        driver.findElement(By.xpath("//span[text()='Password']/preceding-sibling::input")).sendKeys("admin123");
//        
//        //find following/next sibling from current WebElement
//        driver.findElement(By.xpath("//div[@id='divLoginHelpLink']/following-sibling::div/input")).click();
	
	
	}
	
	
}
