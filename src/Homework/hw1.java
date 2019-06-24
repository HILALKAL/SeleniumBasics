package Homework;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class hw1 extends CommonMethods{
/*
 * TC 1: OrangeHRM Login
 * 1.Navigate to “https://opensource-demo.orangehrmlive.com/”
 * 2.Login to the application by writing xpath based on “parent and child relation”
 */
	public static void main(String[] args) {
		
		setUpDriver("chrome","https://opensource-demo.orangehrmlive.com/");
		
		sendText(driver.findElement(By.xpath("//div[@id='divUsername']/input")), "Admin");
		System.out.println(driver.findElement(By.xpath("//input[@id='txtUsername']/..")).getAttribute("class"));
		
		sendText(driver.findElement(By.xpath("//div[@id='divPassword']/input")), "admin123");
		if(driver.findElement(By.xpath("//input[@id='txtPassword']/..")).isDisplayed()) {
			System.out.println(" Displayed");
		}else {
			System.out.println("Not Displayed");
		}
		driver.findElement(By.xpath("//div[@id='divLoginButton']/input")).click();
	}

}
