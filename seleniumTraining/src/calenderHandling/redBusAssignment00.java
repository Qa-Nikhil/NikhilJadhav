package calenderHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtility;

public class redBusAssignment00 {

	public static void main(String[] args) {
		
		SeleniumUtility s1=new SeleniumUtility();
		
		WebDriver driver=s1.setUp("chrome","https://www.redbus.in/");
		
		WebElement puneclick=driver.findElement(By.id("src"));
		puneclick.sendKeys("Pune");
		driver.findElement(By.id("src")).sendKeys(Keys.ENTER);
		
		
		WebElement goaclick=driver.findElement(By.id("dest"));
		goaclick.sendKeys("Goa");
		driver.findElement(By.id("dest")).sendKeys(Keys.ENTER);
		
		//drive.findElement(By.cssSelector("body")).sendKeys(Keys.END);

        driver.findElement(By.cssSelector(".fl.search-box.date-box.gtm-onwardCalendar")).click(); // click on data element 
		
		driver.findElement(By.cssSelector(".rb-monthHeader>td:nth-of-type(3)")).click(); //click on arrow of next month
		
		driver.findElement(By.cssSelector(".rb-monthTable.first.last>tbody>tr:nth-child(4)>td.wd.day")).click();//2nd of may 2022
		
//		WebElement searchBtn=driver.findElement(By.cssSelector("button[class='fl button']"));
//		System.out.println(" >>>"+searchBtn.isEnabled());
		
		WebDriverWait wt = new WebDriverWait(driver, 5);
		
		wt.until(ExpectedConditions.elementToBeClickable (By.id("search_btn")));
		
		System.out.println("ok done ");
		
		//driver.close();
	}

}
