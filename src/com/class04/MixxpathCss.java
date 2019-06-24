package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MixxpathCss {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Celil\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class='btn_action']")).click();//-->class ==  input.btn_action //id yerine#
		Thread.sleep(2000);
										//("input[type='submit']").click();-->attribute						
										//("input[class*='acti']").click();-->contains
										//("input[class^='btn']").click();-->starts-with
										//("input[class$='n']").click();-->ending
		driver.close();
		
		
		
	}

}
