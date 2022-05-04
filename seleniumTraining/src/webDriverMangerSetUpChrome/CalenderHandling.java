package webDriverMangerSetUpChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class CalenderHandling {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();	// please see in Package utilities for your ref.
		
		WebDriver driver=s1.setUp("chrome","https://www.makemytrip.com/");
		
		driver.findElement(By.cssSelector("li[data-cy='account']")).click();
		
		driver.findElement(By.cssSelector("label[for='departure']")).click();
		
		driver.findElement(By.cssSelector("div[class='DayPicker-Months']>div:nth-child(2)>div:nth-child(3)>div:nth-child(2)>div:nth-child(2)")).click();
		
		System.out.println("Ok Done");
		
		 	
		driver.close();

	}

}
