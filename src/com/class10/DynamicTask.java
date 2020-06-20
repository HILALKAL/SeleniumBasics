package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class DynamicTask extends CommonMethods {
/*
 * TC 1: Table headers and rows verification

Open chrome browser
Go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
Login to the application
Verify customer “Susan McLaren” is present in the table
Click on customer details
Update customers last name
Verify updated customers name is displayed in table
Close browser
 */
	public static void main(String[] args) {
		String url="http://secure.smartbearsoftware.com/samples/testComplete11/WebOrders/login.aspx";
		setUpDriver("chrome", url);
		
		//login to the application
		sendText(driver.findElement(By.cssSelector("input[id$='username']")), "Tester");
		sendText(driver.findElement(By.cssSelector("input[id*='password']")), "test");
		driver.findElement(By.cssSelector("input[value='Login']")).click();

		List<WebElement> rows=driver.findElements(By.xpath("table.SampleTable/tbody/tr"));
		//List<WebElement> cols=driver.findElements(By.xpath("table.SampleTable/tbody/tr/td[2]"));
		 List<WebElement> columns=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[2]"));
		
		 String name="Susan McLaren";
		    for (int i=1; i<=rows.size(); i++) {
		        String rowText=driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr["+i+"]")).getText();
		    
		        if(rowText.contains(name)) {
		        System.out.println("Contains name");
		    
		        }
		    
		    }		
	}

}
