package ExpSelenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hw {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Celil\\Selenium\\chromedriver.exe");
			WebDriver d=new ChromeDriver();
			d.manage().window().maximize();
			
			 //Go to “https://www.toolsqa.com/automation-practice-form/”
	        d.get("https://www.toolsqa.com/automation-practice-form/");
	        
	        //Fill out: First Name and Last Name
	        d.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Pascal");
	        d.findElement(By.xpath("//input[@name='lastname']")).sendKeys("siso");
	        
	        //Check that sex radio buttons are enabled and select “Male”
	        List<WebElement> radio = d.findElements(By.xpath("//input[@name='sex']"));
	        boolean radioactive = false;
	        Iterator<WebElement> it = radio.iterator();
	        while (it.hasNext()) {
	            WebElement r = it.next();
	            String a=r.getAttribute("value");
	            radioactive = r.isEnabled();
	            if (radioactive) {
	                System.out.println(a+" radio button is active ?: " + radioactive);
	            }

	        }
	        d.findElement(By.xpath("//input[@name='sex' and @value='Female']")).click();
	        
	        //Check all Years of Experience radio buttons are clickable Date Select both
	        List<WebElement> Exp = d.findElements(By.xpath("//input[@name='exp' and @type='radio']"));
	        for(WebElement explist : Exp) {
	            if(!explist.isSelected()) {
	                explist.click();
	                System.out.println("from "+Exp.size()+" to "+explist.getAttribute("name")+" "+explist.getAttribute("value")+" radio button is selected? "+explist.isSelected());
	            }else {System.out.println(explist.getAttribute("value")+"radio button is deactive");
	        }
	        }
	        
	        d.quit();
			

	}

}
