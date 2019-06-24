package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HWXpathNewtours {
	/*
	 * TC 2: Mercury Tours Registration:
Open chrome browser
Go to “http://newtours.demoaut.com/”
Click on Register Link
Fill out all required info
Click Submit
User successfully registered
	 */

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Celil\\Selenium\\chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.findElement(By.xpath("//td[@class='mouseOut']")).click();
		driver.findElement(By.xpath("//a[@href='mercuryregister.php']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Kemal");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Berk");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("111-222-3344");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("test@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("adtryrfdg,fghj,TX 34565");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("bbbbbb");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("cccccc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("765432");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("fjhsgxhjgs");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234568769709809");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("1234568769709809");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='register']")).click();
		

	}

}
