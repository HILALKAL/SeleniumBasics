package ReviewSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class clickEdit extends CommonMethods {

	public static void main(String[] args) {
		setUpDriver("chrome","https://the-internet.herokuapp.com/tables");
		List<WebElement>row=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        String name="Doe";
        for(int i=1;i<row.size();i++) {
            String text=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]")).getText();
            System.out.println(text);
            if(text.contains(name)) {
                driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+1+"]/td/a[1]")).click();
                break;
            }
        
        }

	}

}
