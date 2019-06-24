package com.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class WindowHandle extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Task
Ahead to http://uitestpractice.com/Students/Switchto
Get the parent title
Get the parentId
print the parent title and parentId
Click on the open in a new window
Get the child title
Get the childId
print the child title and childId
close the child window
		 */
		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
		String ParentTitle=driver.getTitle();
		String ParentID=driver.getWindowHandle();
		System.out.println("ParentTitle is "+ParentTitle);
		System.out.println("ParentID is "+ParentID);
		driver.findElement(By.linkText("Opens in a new window")).click();
		
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String ChildID=null;
		while(it.hasNext()) {
			String ID=it.next();
			if(!ParentID.equals(ID)) {
				ChildID=ID;
			}
		}
		driver.close();
		Thread.sleep(2000);
		System.out.println("ChildID is "+ChildID);
		Thread.sleep(2000);
		driver.switchTo().window(ChildID);
		Thread.sleep(2000);
		String childTitle=driver.getTitle();
		Thread.sleep(2000);
		System.out.println("ChildTitle is "+childTitle);
		driver.close();
		
		
	}

}
