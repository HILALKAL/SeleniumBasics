package Homework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class TC2 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException  {
		/*
		 * Table headers and rows verification 
		 * 1.Open browser and go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
		 * 2.Login to the application 
		 * 3.Create an Order 
		 * 4.Verify order of that person is displayed in the table “List of All Orders” 
		 * 5.Click on edit of that specific order 
		 * 6.Verify each order details 
		 * 7.Update street address 
		 * 8.Verify in the table that street has been updated 
		 * 9.Close browser
		 */
		String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
		setUpDriver("chrome", url);

		// Login to the application
		sendText(driver.findElement(By.cssSelector("input#ctl00_MainContent_username")), "Tester");
		sendText(driver.findElement(By.cssSelector("input#ctl00_MainContent_password")), "test");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		// Create an Order
		driver.findElement(By.xpath("//a[text()='Order']")).click();
		selectValueFromDD(driver.findElement(By.cssSelector("select[name*='Product']")), 1);
		sendText(driver.findElement(By.cssSelector("input[name*=Quantity]")), "50");
		driver.findElement(By.cssSelector("input[value='Calculate']")).click();
		sendText(driver.findElement(By.cssSelector("input[name*=txtName]")), "Kemal");
		sendText(driver.findElement(By.cssSelector("input[name*=TextBox2]")), "ABC");
		sendText(driver.findElement(By.cssSelector("input[name*=TextBox3]")), "Dallas");
		sendText(driver.findElement(By.cssSelector("input[name*=TextBox4]")), "TX");
		sendText(driver.findElement(By.cssSelector("input[name*=TextBox5]")), "12345");

		driver.findElement(By.xpath("//label[text()='Visa']")).click();
		sendText(driver.findElement(By.cssSelector("input[name*=TextBox6]")), "12347897890");

		sendText(driver.findElement(By.cssSelector("input[name*=TextBox1]")), "11/23");
		driver.findElement(By.partialLinkText("Process")).click();

		// Verify order of that person is displayed in the table “List of All Orders”
		driver.findElement(By.xpath("//a[text()='View all orders']")).click();

		

		String expectedValue = "Kemal";
		
			String Value = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[2]/td[2]")).getText();
	
			if (Value.contains(expectedValue)) {
				System.out.println("The person is displayed");
			}else {
				System.out.println("The person is NOT displayed");
			}
		
		// Click on edit of that specific order
		driver.findElement(By.cssSelector("[onclick*='editOrder$0'")).click();
		
		
		
		//Verify each order details 
		driver.findElement(By.xpath("//a[text()='View all orders']")).click();
		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@id,'orderGrid')]/tbody/tr"));
		for (int i = 1; i <= rows.size(); i++) {
	   String rowText = driver.findElement(By.xpath("//table[contains(@id,'orderGrid')]/tbody/tr[" + i + "]")).getText();
		System.out.println(rowText);
		}
		
//				String orderDetails=driver.findElement(By.xpath("//table[@id='ctl00_MainContent_fmwOrder']/tbody/tr")).getText();	
//				System.out.println(orderDetails);
		
		//Update street address 
		driver.findElement(By.cssSelector("[onclick*='editOrder$0'")).click();
		sendText(driver.findElement(By.cssSelector("input[name*=TextBox2]")), "XYZ");
		driver.findElement(By.xpath("//a[@id='ctl00_MainContent_fmwOrder_UpdateButton']")).click();
		
		//Verify in the table that street has been updated 
		
		String update="XYZ";
		String upd=driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[2]/td[6]")).getText();
		if(update.equalsIgnoreCase("XYZ")) {
			System.out.println("Update successful.");
		}else {
			System.out.println("Please update street address ");
		}
		
		Thread.sleep(2000);
		driver.close();
	}

}
