package com.class08;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class HW extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		/*
		 * TC 1: ToolsQA Windows verification
		Open chrome browser
		Go to “https://the-internet.herokuapp.com/”
		Click on “Multiple Windows” link
		Click on “Elemental Selenium”
		Verify title of second window is “Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro”
		Close second window
		Click on “Click Here” link
		Verify title if newly open window is “New Window”
		Close second window
		Verify title of second window is “The Internet”
		Quit browser
		 */
		
		CommonMethods.setUpDriver("chrome", "https://the-internet.herokuapp.com/");
	       driver.findElement(By.xpath("//a[starts-with(text(),'Multiple')]")).click();
	       String parentID=driver.getWindowHandle();
	       driver.findElement(By.xpath("//a[starts-with(text(),'Elemental')]")).click();
	       Thread.sleep(1000);
	        Set<String>ids=driver.getWindowHandles();
	        Iterator<String> it=ids.iterator();
	        String childID="";
	        while(it.hasNext()) {
	            String ID=it.next();
	            if(!parentID.equals(ID)) {
	                childID=ID;
	                }
	            }
	        Thread.sleep(2000);
	        String Title=driver.switchTo().window(childID).getTitle();
	        String expectedTitle="Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro";
	        if(Title.equalsIgnoreCase(expectedTitle)) {
	        
	            System.out.println(expectedTitle+" is  expected title");
	        }else {
	            System.out.println("It is Not expected title");
	        }
	        Thread.sleep(1000);
	        driver.close();
	        
	        driver.switchTo().window(parentID);
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//a[starts-with(text(),'Click')]")).click();
	        Thread.sleep(1000);
	        ids=driver.getWindowHandles();
	        it=ids.iterator();
	        while(it.hasNext()) {
	            String ID=it.next();
	            if(!parentID.equals(ID)) {
	                childID=ID;
	            }
	        }
	        Thread.sleep(2000);
	        Title=driver.switchTo().window(childID).getTitle();
	        expectedTitle="New Window";
	        if(Title.equalsIgnoreCase(expectedTitle)) {
	            System.out.println("'New Window' is the correct title");
	        }else {
	            System.out.println("it is Not the expected  title ");
	        }
	        driver.close();
	        
	        
	        
	        driver.switchTo().window(parentID);
	        Thread.sleep(2000);
	        expectedTitle="The Internet";
	        Title=driver.switchTo().window(parentID).getTitle();
	        Thread.sleep(3000);
	        if(Title.equalsIgnoreCase(expectedTitle)) {
	            System.out.println("'The Internet' is the correct title");
	        }else {
	            System.out.println("it is Not the expected  title ");
	        }
	        Thread.sleep(2000);
	        driver.quit();
	      
	    
	}

}
