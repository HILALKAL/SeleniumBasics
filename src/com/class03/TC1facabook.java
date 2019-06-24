package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * TC 1: Facebook login:
Open chrome browser
Go to “https://www.facebook.com/”
Enter valid username and valid password and click login
User successfully logged in
 */

public class TC1facabook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Celil\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		
//		driver.findElement(By.id("email")).sendKeys("sdfgh");
//		Thread.sleep(2000);
//		driver.findElement(By.id("pass")).sendKeys("sdfgh");
//		Thread.sleep(2000);
//		driver.findElement(By.id("u_0_3")).click();
		
		driver.findElement(By.id("email")).sendKeys("test.rasmi@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("Syntax123");
		//driver.findElement(By.partialLinkText("Forgot")).click();
		Thread.sleep(3000);
		//driver.navigate().back();
		//driver.findElement(By.name("pass")).sendKeys("Syntax123");
		//Thread.sleep(1000);
		driver.findElement(By.id("u_0_2")).click();
		driver.close();
	}

}
