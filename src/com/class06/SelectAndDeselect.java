package com.class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import utils.CommonMethods;

public class SelectAndDeselect {
	/*
	 * TC 2: Select and Deselect values
	 */
	public static void main(String[] args) throws InterruptedException {
		// Open chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Celil\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// window maximize
		driver.manage().window().maximize();
		
		// Go to “http://uitestpractice.com/”
		driver.get("http://uitestpractice.com/");
		
		// Click on “Select” tab 
		driver.findElement(By.linkText("Select")).click();
		
		// working with Single DD
		// Verify how many options available in the first drop down and then select “United states of America” 
		WebElement countriesDD = driver.findElement(By.id("countriesSingle"));
		CommonMethods.selectValueFromDD(countriesDD, "United states of America");

		// working with muplitple DD
		//Verify how many options available in the second drop down 
		WebElement multDD = driver.findElement(By.cssSelector("select#countriesMultiple"));
		Select select = new Select(multDD);
		List<WebElement> optionList = select.getOptions();
		int ddSize = optionList.size();
		System.out.println("# of options in multiple countries dd=" + ddSize);
		
		// check if we can select multiple options
		//select all
		if (select.isMultiple()) {
			for (int i = 0; i < ddSize; i++) {
				select.selectByIndex(i);
				Thread.sleep(1000);
			}
			// another way
			for (WebElement option : optionList) {
				option.click();
				Thread.sleep(1000);
			}
		}

		Thread.sleep(2000);
		//Deselect China from the second drop down
		select.deselectByVisibleText("China");
		
		Thread.sleep(2000);
		//Quit browser
		driver.quit();

	}

}
