package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {
/*
 * TC 1: Swag Labs Positive login:
Open chrome browser
Go to “https://www.saucedemo.com/”
Enter valid username and valid password and click login
Verify robot icon is displayed
Verify “Products” text is available next to the robot icon
 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Celil\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		boolean isDisplayed = driver.findElement(By.cssSelector("div.login_logo")).isDisplayed();

		if (isDisplayed) {
			System.out.println("Logo is displayed");
		} else {
			System.out.println("Logo is NOT displayed");
		}
		
		WebElement username=driver.findElement(By.cssSelector("input.form_input"));
		username.sendKeys("abcd");
		username.clear();
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.cssSelector("input#password"));
		password.sendKeys("123456");
		password.clear();
		password.sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class*='btn']")).click();
		Thread.sleep(2000);
		
		WebElement product=driver.findElement(By.cssSelector("div.product_label"));
		boolean displayP=product.isDisplayed();
		String productText=product.getText();
		
		String expectedText="Products";
		
		if (displayP && productText.equals(expectedText)) {
			System.out.println("Element is displayed and texts is "+productText);
		}else {
			System.out.println("Element is NOT displayed OR textis NOT="+productText);
		}
		
		Thread.sleep(2000);
		driver.close();
	}

}
