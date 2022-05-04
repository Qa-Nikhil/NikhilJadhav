package handlingMultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GSMArena_Assignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		
		WebDriver drive=new ChromeDriver();
		
		drive.get("https://www.gsmarena.com/");
		
		drive.manage().window().maximize();
		
		drive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement>category=drive.findElements(By.cssSelector(".brandmenu-v2>ul>li>a"));
		
		System.out.println(" get total count of category :"+category.size());
		
		for(int i=0;i<category.size();i++){
			
		WebElement options=category.get(i);
		
		String names=options.getText();
		
		System.out.println(" categiry name :"+names);
		
		}
		
		drive.findElement(By.cssSelector(".brandmenu-v2>ul>li>a")).click();
		List<WebElement>listOfSamsung=drive.findElements(By.cssSelector(".makers>ul>li>a>strong>span"));
		drive.navigate().refresh();
		Thread.sleep(2000);
		System.out.println(" get total cont of samsung model :"+listOfSamsung.size());
		Thread.sleep(1000);
		
		for(int j=0; j<listOfSamsung.size();j++) {
			drive.findElement(By.cssSelector(".makers>ul>li>a>strong>span"));
			WebElement option1=listOfSamsung.get(j);
			String name=option1.getText();
			System.out.println(" >"+name); 
			drive.findElement(By.cssSelector(".brandmenu-v2>ul>li>a"));
			 
		}
		drive.close();
	}

}
