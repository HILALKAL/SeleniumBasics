package com.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class ar extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
        String parent =driver.getTitle();
        String parentId= driver.getWindowHandle();
        System.out.println("Parent title: "+parent+" "+" ID: "+parentId);
        driver.findElement(By.linkText("Opens in a new window")).click();
        Set<String> allWindows = driver.getWindowHandles();
        Iterator<String> it = allWindows.iterator();
        String ChildID="" ;
        while(it.hasNext()) {
        	String ID=it.next();
        	if(!parentId.equals(ID)) {
        		ChildID=ID;
        	}
        }
        driver.close();
        driver.switchTo().window(ChildID);
        Thread.sleep(5000);
        String childTitle=driver.getTitle();
        ChildID= driver.getWindowHandle();
        System.out.println("Child title: "+childTitle+" "+" ID: "+ChildID);
        driver.close(); 
       
        allWindows = driver.getWindowHandles();
        it = allWindows.iterator();
         parentId="" ;
        while(it.hasNext()) {
        	String ID=it.next();
        	if(!ChildID.equals(ID)) {
        		parentId=ID;
        	}
        }
        driver.switchTo().window(parentId);
        Thread.sleep(2000);
        driver.close();
	}

}
