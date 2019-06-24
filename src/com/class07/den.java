package com.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class den {

	public static void main(String[] args) throws InterruptedException {
		
		
//		    Open chrome browser
//		    Go to “https://the-internet.herokuapp.com/”
//			Click on “Multiple Windows” link
//			Click on “Elemental Selenium”
//			Verify title of second window is “Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro”
//			Close second window
//			Click on “Click Here” link
//			Verify title if newly open window is “New Window”
//			Close second window
//			Verify title of second window is “The Internet”
//			Quit browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Celil\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://the-internet.herokuapp.com/");
		
		
		//CommonMethods.setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		
        driver.findElement(By.xpath("//a[starts-with(text(),'Multiple')]")).click();
        driver.findElement(By.xpath("//a[starts-with(text(),'Elemental')]")).click();
		Set<String>ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentID=it.next();
		String childID=it.next();
		String childTitle=driver.switchTo().window(childID).getTitle();
		String expectedTitle="Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro";
		if(childTitle.equalsIgnoreCase(expectedTitle)) {
		
		    System.out.println("Child window title is expected title");
		}else {
			System.out.println("It is not expected title");
		}
		Thread.sleep(3000);
		
		driver.close();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[starts-with(text(),'Click')]")).click();
		childID=driver.getWindowHandle();
		childTitle=driver.switchTo().window(childID).getTitle();
		if(childTitle.equalsIgnoreCase("New Window")) {
			System.out.println("'New Window' is the correct title");
			
		}else {
			System.out.println("it is Not the expected  title ");
		}
		driver.close();
		Thread.sleep(3000);
		
		String parentTitle=driver.switchTo().window(parentID).getTitle();
		if(parentTitle.equalsIgnoreCase("The Internet")) {
			System.out.println("it is the correct title");
			
		}else {
			System.out.println("it is Not the expected  title ");
		}
		Thread.sleep(3000);
		driver.quit();
	  
	}

}
