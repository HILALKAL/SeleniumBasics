package com.class08;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class taskClickDbClikAlert extends CommonMethods {
//	Task One
//	Ahead to http://uitestpractice.com/Students/Index
//	Click on the Actions
//	Click on the click me !
//	Handle the alert and click okay
//	Double Click Double Click Me !
//	Handle the alert and click okay
//	Close the browser
	
	public static void main(String[] args) throws InterruptedException {
//		Ahead to http://uitestpractice.com/Students/Index
		setUpDriver("chrome","http://uitestpractice.com/Students/Index");
		
//		Click on the Actions
		driver.findElement(By.xpath("//a[ text()='Actions']")).click();
		
//		Click on the click me !	
		WebElement clickMe = driver.findElement(By.xpath("//button[@name='click']"));
		Actions action=new Actions(driver);
		action.moveToElement(clickMe).click().perform();
		
//		Handle the alert and click okay
		Alert alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
//		Double Click Double Click Me !		
		WebElement dClick=driver.findElement(By.xpath("//button[@name='dblClick']"));
		action.doubleClick(dClick).perform();

//		Handle the alert and click okay
		alert=driver.switchTo().alert();
		alert.accept();
		
		driver.close();
		
	}

}
