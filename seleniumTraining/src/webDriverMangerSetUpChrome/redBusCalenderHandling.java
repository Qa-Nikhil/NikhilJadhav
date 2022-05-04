package webDriverMangerSetUpChrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.SeleniumUtility;

public class redBusCalenderHandling {

	public static void main(String[] args) {
		
		SeleniumUtility s1=new SeleniumUtility();

		WebDriver drive =s1.setUp("chrome","https://www.redbus.in/");
		

		
		drive.findElement(By.cssSelector(".fl.search-box.date-box.gtm-onwardCalendar")).click(); // click on data element 
		
		drive.findElement(By.cssSelector(".rb-monthHeader>td:nth-of-type(3)")).click(); //click on arrow of next month
		
		drive.findElement(By.cssSelector(".rb-monthTable.first.last>tbody>tr:nth-child(4)>td.wd.day")).click();//2nd of may 2022
		
		System.out.println(" ok done"); // for conformation of all code is ok 
		
		drive.close();
		

	}

}
