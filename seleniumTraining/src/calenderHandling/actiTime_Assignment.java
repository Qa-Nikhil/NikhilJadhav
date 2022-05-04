package calenderHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.SeleniumUtility;

public class actiTime_Assignment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SeleniumUtility s1=new SeleniumUtility();
		
		WebDriver drive=s1.setUp("chrome", "https://demo.actitime.com/login.do");
		
							//OR
		
//		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
//		WebDriver drive = new ChromeDriver();
//		
//		drive.manage().window().maximize();
//		
//		drive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		
//		drive.get("https://demo.actitime.com/login.do");
		
		drive.findElement(By.id("username")).sendKeys("admin");
		
		drive.findElement(By.name("pwd")).sendKeys("manager");
		
		drive.findElement(By.id("keepLoggedInCheckBox")).click();
		
		drive.findElement(By.id("loginButton")).click();
		
		drive.findElement(By.cssSelector(".content.tasks")).click();
		
		drive.findElement(By.cssSelector(".title.ellipsis")).click();
		
		List<WebElement> addNewElement=drive.findElements(By.cssSelector("div[class='dropdownContainer addNewMenu']>div:nth-child(2).item.createNewProject"));
		
		System.out.println(" size of addnew :"+addNewElement.size());
		
		drive.findElement(By.cssSelector("div[class='dropdownContainer addNewMenu']>div:nth-child(3).item")).click(); // create new task
		
		//drive.findElement(By.cssSelector("div[class='comboboxButton'] div[class='dropdownButton']")).click();
		
		
        drive.findElement(By.cssSelector("tr[class='selectCustomerRow']>td div[class='searchItemList']>div:nth-child(4)"));
	
		System.out.println("ok done ");
		
		//drive.close();
		
		

	}

}
