package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HWXpathFacebook {
/*
 * TC 1: Facebook login:
Open chrome browser
Go to “https://www.facebook.com/”
Enter valid username and valid password and click login
User successfully logged in
 */
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\Celil\\Selenium\\chromedriver.exe");
//		WebDriver driver=new FirefoxDriver();
//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test.hk@gmail.com");
//		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1234qwer");
//		driver.findElement(By.xpath("//input[@data-testid='royal_login_button']")).click();
//		Thread.sleep(3000);
//		driver.close();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Celil\\Selenium\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.navigate().to("https://www.facebook.com/");
		driver1.findElement(By.cssSelector("input[class='inputtext']")).sendKeys("testhk@gmail.com");
		Thread.sleep(2000);
		driver1.findElement(By.cssSelector("input.inputtext")).sendKeys("1234qwer");
		Thread.sleep(2000);
		driver1.findElement(By.cssSelector("input[type*='submit']")).click();
		
	}

}
