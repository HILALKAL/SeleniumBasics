package com.class07;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class iframeHandling extends CommonMethods{

	public static void main(String[] args) throws InterruptedException  {
		/*
		 * TC 1: ToolsQA Frame verification
		 *Open chrome browser
		 *Go to “https://www.toolsqa.com/iframe-practice-page/”
         *Click on “Blogs” link inside first frame
         *Verify element “Interactions” is present in second frame
         *Navigate to Home Page
         *Quit browser
		 */
		CommonMethods.setUpDriver("chrome", "https://www.toolsqa.com/iframe-practice-page/");
		driver.switchTo().frame("IF1");
		driver.findElement(By.xpath("//a[text()='Git Log']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("IF2");
		boolean disp=driver.findElement(By.xpath("//h3[text()='Interactions']")).isDisplayed();
		if(disp=true) {
			System.out.println("true");
		}
		driver.switchTo().defaultContent();//frame dan cikip home page e donmek icin
		 Thread.sleep(2000);
		 driver.quit();
		
		
	}

}
