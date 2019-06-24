package com.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class btl2 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
	    String parentTitle=driver.getTitle();
	    String parentID=driver.getWindowHandle();
	    System.out.println(parentID +" has the title: "+parentTitle);
	    driver.findElement(By.xpath("//a[text()='Opens in a new window']"));
	    Set<String> ids=driver.getWindowHandles();
	    Iterator<String> it=ids.iterator();
	    parentID=it.next();
	    Thread.sleep(2000);
	    String childID=it.next();
//	    while(it.hasNext()) {
//	        if(!parentID.equals(it.next())) {
//	            childID=it.next();
//	        }
//	    }
	    Thread.sleep(2000);
	    String childTitle=driver.switchTo().window(childID).getTitle();
	    Thread.sleep(2000);
	    System.out.println(childID +" has the title: "+childTitle);
	    Thread.sleep(2000);
	    driver.close();

	}

}
