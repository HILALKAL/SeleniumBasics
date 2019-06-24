package ExpSelenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Broken {
	WebDriver driver;

	@BeforeMethod

	public void SetUp() {

		System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String url = "http://newtours.demoaut.com/";
		driver.get(url);

	}

	@Test
	
	public void BrokenLinks() {
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for (WebElement link:links) {
			String linkURL = link.getAttribute("href");
			try {
				URL url=new URL(linkURL);
				HttpURLConnection con=(HttpURLConnection) url.openConnection();
				int code= con.getResponseCode();
				
				if(code==200) {
					System.out.println("Link is valid "+link.getText());
				}else {
					System.out.println("Link is NOT valid "+link.getText());
				}
			
			}catch (Exception e){
				
				e.printStackTrace();
			
			}
		
		}
		
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	

}
