package com.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class btl extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
        String title=driver.getTitle();
        String parentID=driver.getWindowHandle();
        System.out.println("Parent window title:"+title);
        System.out.println("This is parent window ID:"+parentID);
        driver.findElement(By.xpath("//a[text()='Opens in a new window']")).click();
        Set<String>ids=driver.getWindowHandles();
        Iterator<String> it=ids.iterator();
        parentID=it.next();
        String childID=it.next();
        Thread.sleep(2000);
        String childtitle=driver.switchTo().window(childID).getTitle();
        Thread.sleep(2000);
        System.out.println("This is child window ID:"+childID);
        System.out.println("Child window title:"+childtitle);
        Thread.sleep(2000);
        driver.quit();

	}

}
