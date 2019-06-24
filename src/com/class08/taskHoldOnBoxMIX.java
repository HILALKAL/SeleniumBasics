package com.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import utils.CommonMethods;

public class taskHoldOnBoxMIX extends CommonMethods{
	
//	Ahead to http://uitestpractice.com/Students/Index
//	Click on the Actions
//	Click and hold on 1,2,3,4 boxes
//	Close the browser
	
	public static void main(String[] args) throws InterruptedException {
		setUpDriver("chrome","http://uitestpractice.com/Students/Index");
		driver.findElement(By.xpath("//a[text()='Actions']")).click();
		WebElement one=driver.findElement(By.xpath("//li[@name='one']"));
		WebElement two=driver.findElement(By.cssSelector("li[name='two']"));
		WebElement Three=driver.findElement(By.xpath("//li[@name='three']"));
		WebElement four=driver.findElement(By.cssSelector("li[name='four']"));
		Actions act=new Actions(driver);
		act.moveToElement(one).clickAndHold().moveToElement(two).clickAndHold().moveToElement(Three).clickAndHold().moveToElement(four).clickAndHold().build().perform();
		
		
		 //click and hold on boxes 12-9
        WebElement twelve=driver.findElement(By.xpath("//li[text()='12']"));
        WebElement eleven=driver.findElement(By.xpath("//li[text()='11']"));
        WebElement ten=driver.findElement(By.xpath("//li[text()='10']"));
        WebElement nine=driver.findElement(By.xpath("//li[text()='9']"));
        act.clickAndHold(twelve).moveToElement(eleven).clickAndHold(ten).moveToElement(nine).release().build().perform();
        Thread.sleep(1000);
        
        //click and hold on boxes 3,7,11  
        WebElement seven=driver.findElement(By.xpath("//li[text()='7']"));
        ////   action.clickAndHold(three).moveToElement(eleven).release().build().perform();   ////  
        act.moveToElement(Three).clickAndHold().moveToElement(seven).clickAndHold().moveToElement(eleven).clickAndHold().release().build().perform();
        Thread.sleep(5000);
        
        //click on box 1 move to box 12
        act.clickAndHold(one).moveToElement(twelve).release().build().perform();
        Thread.sleep(2000);
        
        //click to Switch to, pass text in iframe
        driver.findElement(By.xpath("//a[text()='Switch to']")).click();
        Thread.sleep(2000);
        driver.switchTo().frame("iframe_a");
        driver.findElement(By.cssSelector("input#name")).sendKeys("qwert");
        Thread.sleep(2000);
        
        driver.switchTo().defaultContent();//child dan parentta gecmek icin
        
        //click on Select
        driver.findElement(By.xpath("//a[text()='Select']")).click();
        Thread.sleep(2000);
        //Multiple Drop Down
        WebElement countries=driver.findElement(By.id("countriesMultiple"));
        Select select=new Select(countries);
        List<WebElement> country=select.getOptions();
        System.out.println("Total number of options available in Multiple DD: "+country.size());
        
        select.selectByVisibleText("United states of America");
        select.selectByValue("china");
        Thread.sleep(2000);
        
        if (select.isMultiple()) {
            select.deselectByVisibleText("China");
            Thread.sleep(2000);
        }
        
		
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(1000);
		driver.quit();
	}

}
