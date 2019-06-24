package com.class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowmanyAmz {
/*
 * TC 1: Amazon link count:
Open chrome browser
Go to “https://www.amazon.com/”
Using Iterator get text of each link
Get number of links that has text
 */
	public static void main(String[] args) {
		
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Celil\\Selenium\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.amazon.com/");
				
				List <WebElement> links=driver.findElements(By.tagName("a"));
				int count=0;
				
				Iterator <WebElement> linksIt=links.iterator();
				while(linksIt.hasNext()) {
					String linkText=linksIt.next().getText();
					if(!linkText.isEmpty()) {
					System.out.println(linkText);
					count++;
					}
				}
				System.out.println("Total number of links with text "+count);
				driver.quit();
}
}