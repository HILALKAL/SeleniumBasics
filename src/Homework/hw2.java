package Homework;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class hw2 extends CommonMethods{
/*
 * OrangeHRM Login
 * 3.Navigate to “https://opensource-demo.orangehrmlive.com/”
 * 4.Login to the application by writing xpath based on “following and preceding siblings”
 */
	public static void main(String[] args) {
		String url="https://opensource-demo.orangehrmlive.com/";
		setUpDriver("chrome", url);
		
		sendText(driver.findElement(By.xpath("//span[text()='Username']/preceding-sibling::input")), "Admin");
		sendText(driver.findElement(By.xpath("//input[@id='txtPassword']/../input")), "admin123");
		driver.findElement(By.xpath("//div[@id='divLoginButton']/input")).click();

	}

}
