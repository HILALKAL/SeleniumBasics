package com.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import utils.CommonMethods;

public class HW2 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		/*
		 * TC 1: Facebook dropdown verification
          Open chrome browser
          Go to “https://www.facebook.com”
          Verify:
          month dd has 12 month options
          day dd has 31 day options
          year dd has 115 year options
          Select your date of birth    
          Quit browser
		 */
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Celil\\Selenium\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com");
		setUpDriver("chrome","https://www.facebook.com");
		
		WebElement day=driver.findElement(By.id("day"));
		Select obj=new Select(day);
		List<WebElement> OptionsDay=obj.getOptions();
		System.out.println(OptionsDay.size());
		obj.selectByVisibleText("1");
		
		WebElement month=driver.findElement(By.cssSelector("select[name$='month']"));
		Select obj1=new Select(month);
		List<WebElement> OptionsMonth=obj1.getOptions();
		System.out.println(OptionsMonth.size());
		obj1.selectByIndex(1);
		
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		Select obj2=new Select(year);
		List<WebElement> OptionsYear=obj2.getOptions();
		System.out.println(OptionsYear.size());
		obj2.selectByValue("2001");
		
		Thread.sleep(2000);
		
		driver.quit();
		}

}
