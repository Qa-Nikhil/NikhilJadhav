package dropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiTime_dropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		
		drive.manage().window().maximize();
		
		drive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		drive.get("https://demo.actitime.com/login.do");
		
		drive.findElement(By.id("username")).sendKeys("admin");
		
		drive.findElement(By.name("pwd")).sendKeys("manager");
		
		drive.findElement(By.id("keepLoggedInCheckBox")).click();
		
		drive.findElement(By.id("loginButton")).click();
		
		drive.findElement(By.cssSelector("div#container_tasks")).click();
		
		
		
		
		drive.findElement(By.cssSelector(".title.ellipsis")).click();
 
		
		
		List<WebElement> listOption=drive.findElements(By.cssSelector(".customerSelector .searchItemList>.itemRow"));
		System.out.print("size of options"+listOption.size());
		
		
		
		for(int i=0;i<listOption.size();i++) {
			System.out.print(""+i+":"+listOption.get(i).getText());
			
		}
		
	//	drive.findElement(By.cssSelector("div[class='itemRow cpItemRow selected']")).click();
		
		
		
		drive.close();		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
