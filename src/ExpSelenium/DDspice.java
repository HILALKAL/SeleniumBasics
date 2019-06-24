package ExpSelenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DDspice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Celil\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://book.spicejet.com");
		driver.findElement(By.cssSelector("input#ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
		WebElement departure =driver.findElement(By.cssSelector("select#ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));
		Select select=new Select (departure);
		select.selectByIndex(2);
		List<WebElement> currency=driver.findElements(By.name("ControlGroupSearchView$AvailabilitySearchInputSearchView$DropDownListCurrency"));
//		for(int i=0; i<currency.size();i++) {
//			select.selectByIndex(i);
//			
//		}
		for(WebElement wb:currency) {
			System.out.println(wb.getText());
		}
		Iterator<WebElement> it=currency.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().getText());
		}
	}

}
