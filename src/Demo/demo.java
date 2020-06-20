package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/SeleniumBasics/src/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("url");
		//1
		// I Have four web element list want to select one of them. Using for loop can you write the code for me.
		String valueToSelect = "QA";
		List<WebElement> listElement = driver.findElements(By.id("   "));
		for(WebElement ele:listElement) {
			String value=ele.getAttribute("value");
			if(value.equals(valueToSelect)) {
				ele.click();
			}
		}
		
		//2
		//I want to mouse over in an Element and select one from drop down list. What will be the Code.
		
		Actions action=new Actions(driver);
		WebElement element=driver.findElement(By.id("  "));
		action.moveToElement(element).build().perform();
		driver.findElement(By.id("")).click();
		
		Select select=new Select(element);
		List<WebElement> options=select.getOptions();
		String text="aaa";
		for(WebElement opt:options) {
			String option=opt.getText();
			if(option.equals(text)) {
				select.selectByVisibleText(text);
			}
		}
		
		
		
		
		
	}

}
