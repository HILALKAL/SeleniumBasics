package udemy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class calender extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		String url="http://www.path2usa.com/travel-companions";
		setUpDriver("chrome",url);
		//April 14
		
		driver.findElement(By.id("travel_date")).click();
		WebElement month=driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']"));
		//boolean flag=month.getText().contains("June");
	
		while(!month.getText().contains("May")) {
			driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='next']")).click();
		}
		
		List <WebElement> dates=driver.findElements((By.cssSelector(".day")));
		int count=dates.size();
		//System.out.println(counts);
		for(int i=0;i<count;i++) {
		WebElement date=dates.get(i);
		String text=date.getText();
		
		if(text.equalsIgnoreCase("30")) {
			date.click();
			System.out.println(text);
			break;
		}
		}
	}

}
