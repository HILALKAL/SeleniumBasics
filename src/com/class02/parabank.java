package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parabank {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Celil\\Selenium\\chromedriver.exe")	;
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
		driver.findElement(By.id("customer.firstName")).sendKeys("sdfgh");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.lastName")).sendKeys("122334");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.address.street")).sendKeys("436383 jhfugij ioy96y7986 ");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.address.city")).sendKeys("aaaaaaaaa ");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.address.state")).sendKeys("bbbbbbbbbb");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("76548 ");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("4353719109");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.ssn")).sendKeys("000000000000");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.username")).sendKeys("#$%^&^U***");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.password")).sendKeys("546747-6473489");
		Thread.sleep(2000);
		driver.findElement(By.id("repeatedPassword")).sendKeys("546747-6473489");
		Thread.sleep(2000);
		driver.findElement(By.className("button")).click();
		driver.close();
		
		
		
	}

}
