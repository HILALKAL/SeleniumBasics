package ExpSelenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC2 {
	/*
	 * TC 2: Select and Deselect values





Deselect China from the second drop down
Quit browser (edited) 
	 */
	
	//Open chrome browser
	public static void main(String[]args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Celil\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	//Go to “http://uitestpractice.com/”
	driver.get("http://uitestpractice.com/");
	//Click on “Select” tab
	driver.findElement(By.partialLinkText("Select")).click();//-->text kismini kopyala>    <
	
	//Verify how many options available in the first drop down and then select “United states of America”
	Select obj;
	List<WebElement> list;
	WebElement country=driver.findElement(By.cssSelector("select#countriesSingle"));
	obj=new Select(country);
	list=obj.getOptions();//objeleri listelemek icin
	System.out.println(list.size());
	obj.selectByVisibleText("United states of America");//sayfada gorunen visibleText
	//obj.selectValue("usa");//ins dekini girmek lazim
	
	
	//Verify how many options available in the second drop down and then select all.
	WebElement multDD=driver.findElement(By.id("countriesMultiple"));
	obj=new Select(multDD);
	list=obj.getOptions();
	System.out.println(list.size());
	
//	System.out.println("---for advance----");
//	for(WebElement DD:list) {
//		DD.click();
//	}
//	System.out.println("--for for regular---");
//	for(int i=0;i<list.size();i++) {
//		obj.selectByIndex(i);
//	}
	System.out.println("--iterator--");
	Iterator<WebElement> it=list.iterator();
	while(it.hasNext()) {
		String str=it.next().getText();
		System.out.println(str);
	}
	
	
	driver.quit();
}
}
