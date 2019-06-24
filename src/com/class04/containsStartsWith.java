package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class containsStartsWith {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Celil\\Selenium\\chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("test.hk@gmail.com");
		driver.findElement(By.xpath("//input[starts-with((@type,'pass']")).sendKeys("1234qwer.");
		driver.findElement(By.xpath("//input[starts-with(@type,'sub')]")).click();
		Thread.sleep(3000);

	}

}
