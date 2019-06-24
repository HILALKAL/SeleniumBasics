package com.class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintEachDepartmant {
/*
 * TC 1: Amazon Department List Verification
Open chrome browser
Go to “http://amazon.com/”
Verify how many department options available.
Print each department
Select Computers
Quit browser
 */
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Celil\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("http://amazon.com/");
		
		//Verify how many department options available.
		WebElement depDD=driver.findElement(By.cssSelector("select#searchDropdownBox"));
		Select select=new Select(depDD);
		List<WebElement> allOptions=select.getOptions();
		System.out.println(allOptions.size());
		
		for(WebElement list:allOptions) {//depatmanlari yazdirmak icin
			
			System.out.println(list.getText());
		}
		select.selectByVisibleText("Computers");
		Thread.sleep(2000);
		
		driver.quit();
	}

}
