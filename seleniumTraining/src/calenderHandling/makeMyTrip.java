package calenderHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class makeMyTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	       SeleniumUtility s1=new SeleniumUtility();	// please see in Package utilities for your ref.
			
			WebDriver driver=s1.setUp("chrome","https://www.makemytrip.com/");
			
			driver.findElement(By.cssSelector("li[data-cy='account']")).click(); // clcik on pop up arrow
			
			List<WebElement>tripOption=driver.findElements(By.cssSelector("ul[class='makeFlex font12']>li>a")); // list of options 
			
			tripOption.size();
			for(int i=0;i<tripOption.size();i++) {
				
				System.out.println("> "+tripOption.get(i).getText());
			}
			driver.findElement(By.cssSelector("li[class='menu_Flights']")).click();
		
			
			driver.findElement(By.cssSelector("label[for='departure']")).click();
			
			driver.findElement(By.cssSelector("div[class='DayPicker-Months']>div:nth-child(2)>div:nth-child(3)>div:nth-child(2)>div:nth-child(2)")).click();
			
			System.out.println("Ok Done");
			
			 	
			driver.close();
	}

}
