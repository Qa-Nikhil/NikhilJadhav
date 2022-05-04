package dropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class w3SchoolDropDown_assignment {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		 driver.findElement(By.id("menu1")).click();
		 List<WebElement> options=driver.findElements(By.cssSelector("ul[aria-labelledby='menu1']>li>a"));
		 System.out.println(":"+options.size());
		 for (int i=0;i<options.size();i++) {
			 System.out.println(" >"+i+":"+options.get(i).getText());
		 }
		
		 
		 
		 

	}

}
