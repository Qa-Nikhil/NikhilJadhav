package dropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gsmArena_eachPageUrl {
	
	//Assignment : GSM Arena multiple element (bring each page url in console )
	
	public static void main(String[] args) throws InterruptedException {
		 //div[class='nav-pages']
		
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		
		WebDriver drive = new ChromeDriver();
		
		drive.manage().window().maximize();
		
		drive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebDriverWait wait =new WebDriverWait(drive,20);
		
		drive.get("https://www.gsmarena.com/samsung-phones-f-9-0-p2.php");
		
		List<WebElement> pageList=drive.findElements(By.cssSelector(".nav-pages>a"));
		
		
		System.out.println(":  "+pageList.size());
		
		for(int i=0;i<pageList.size();i++) {
			
			pageList.get(i).click();
			
			System.out.println(drive.getCurrentUrl());
			
			Thread.sleep(2000);
			
			pageList=drive.findElements(By.cssSelector(".nav-pages>a")); // to avoid stale element exeption 
			
			 	
		}
		
		drive.close();
	}

}
