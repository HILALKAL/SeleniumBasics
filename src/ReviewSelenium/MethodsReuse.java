package ReviewSelenium;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MethodsReuse {

	public static WebDriver driver;
	public static Select name;
	/**********************************************************
	 * 
	 * @param element
	 * @param text
	 * Below is for Sending Keys
	 **********************************************************/
	
	public static void sendText(WebElement element,String text) {
		element.clear();
		element.sendKeys(text);
	}
	
	/**********************************************************
     * 
     * @param element
     * @param broswer
     * Below is for browserSetUp
     **********************************************************/
	
	public static void browserSetUp(String browser,String URL) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Celil\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Celil\\Selenium\\chromedriver.exe");
				driver=new FirefoxDriver();
		}
		driver.get(URL);
	}	
		 /**********************************************************
	     * 
	     * @param element
	     * @param broswer
	     * Below is for selectByValue
	     **********************************************************/
	
		 public static void selectByValue(WebElement element,String value) {
	         name=new Select(element);
	        List<WebElement> list=name.getOptions();
	        for(WebElement ele:list) {
	            System.out.println(ele.getText());
	            if(value.equals(ele.getAttribute("value"))) {
	                 name.selectByValue(value);
	            
	        }
	    }
		 
	}
	
}
