package Homework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class TC3 extends CommonMethods{
/*
 *  Table headers and rows verification
 *  1.Open chrome browser
 *  2.Go to “https://jqueryui.com/”
 *  3.Click on “Datepicker”
 *  4.Select August 10 of 2019
 *  5.Verify date “08/10/2019” has been entered succesfully
 *  6.Close browser
 */
	public static void main(String[] args) {
		
		setUpDriver("chrome","https://jqueryui.com/");
		driver.findElement(By.xpath("//a[text()='Datepicker']")).click();
		
		//Click on “Datepicker”
		switchToFrame(0);
		driver.findElement(By.cssSelector("input#datepicker")).click();
		
		//Select August 10 of 2019
		  while(!driver.findElement(By.cssSelector("span.ui-datepicker-month")).getText().contains("August 2019")) {
	            driver.findElement(By.xpath("//span[text()='Next']")).click();
	           }
		  
		  List<WebElement> days=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		  for(int i=0; i<days.size();i++) {
			 String day= days.get(i).getText();
			 if(day.equalsIgnoreCase("10")) {
				
			 }
		  }
		
		  
		  //Verify date “08/10/2019” has been entered succesfully
		  String vrf=driver.findElement(By.cssSelector("input#datepicker")).getAttribute("value");
	       if(vrf.equals("08/10/2019")) {
	            System.out.println("succesfully");
	        }else {
	            System.out.println("Please try again!");
	        }
	        
	        driver.close();
		
	}

}
