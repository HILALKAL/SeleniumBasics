package com.class12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.CommonMethods;
/*
 * TC 12356 - search flight verification
 * step 1: navigate to url
 * step 2: enter details
 * step 3: verify search is successful
 */
public class FligthSearch extends CommonMethods{
	
	@BeforeMethod
	public void setUp() {
		setUpDriver("chrome","https://www.aa.com/homePage.do");
		
	}
	
	@Test
	public void searchFlight() throws InterruptedException {
		// enter to and from
		sendText(driver.findElement(By.name("originAirport")),"DCA");
		sendText(driver.findElement(By.name("destinationAirport")), "JFK");
		driver.findElement(By.xpath("//input[@id='aa-leavingOn']/following-sibling::button")).click();
		WebElement depMonth=driver.findElement(By.xpath("//div[contains(@class,'corner-left')]/div"));
		
		while(!depMonth.getText().contains("October")) {
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			//if we wont perform this action we will get
			//StaleElementReferenceException: stale element reference :element is not attached to
			depMonth=driver.findElement(By.xpath("//div[contains(@class,'corner-left')]/div"));
		}
		// capturing all cell and than loop search for specific date
		List<WebElement> depCells=driver.findElements(By.xpath("//div[contains(@class,'group-first')]/table/tbody/tr/td"));
		for(WebElement cell:depCells) {
			if(cell.getText().equals("18")) {
				cell.click();
				break;
			}
		}
		//select arrival as December 24
		driver.findElement(By.xpath("//input[@id='aa-returningFrom']/following-sibling::button")).click();
		WebElement arrMonth=driver.findElement(By.xpath("//div[contains(@class,'corner-right')]/div"));
		
		while(!arrMonth.getText().contains("December")) {
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			arrMonth=driver.findElement(By.xpath("//div[contains(@class,'corner-right')]/div"));
		}
		
		List<WebElement> arrCells=driver.findElements(By.xpath("//div[contains(@class,'group-last')]/table/tbody/tr/td"));
		for(WebElement Acell:arrCells) {
			if(Acell.getText().equals("24")) {
				Acell.click();
				break;
			}
		}
		
		
		Thread.sleep(5000);
	
	
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
