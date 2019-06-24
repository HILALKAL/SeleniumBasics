package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class RigthClickTask extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		// Task for contextClick
//		 Navigate to https://www.saucedemo.com
//			 Right click on the password textbox 
//			 Close the browser 
setUpDriver("chrome","https://www.saucedemo.com");
WebElement RitghClick=driver.findElement(By.cssSelector("input#password"));
Actions action=new Actions(driver);
action.contextClick(RitghClick).perform();
Thread.sleep(2000);
driver.close();
}
}