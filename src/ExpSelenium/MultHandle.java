package ExpSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Celil\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://uitestpractice.com/");
		driver.findElement(By.partialLinkText("Switch to")).click();;
		driver.findElement(By.partialLinkText("Opens in a new window")).click();;
		System.out.println(driver.getTitle());
		Set<String>ids=driver.getWindowHandles();
		Iterator<String>it=ids.iterator();
		String parent=it.next();
		String child=it.next();
		System.out.println(driver.switchTo().window(parent).getTitle());
		System.out.println(driver.switchTo().window(child).getTitle());
	}

}
