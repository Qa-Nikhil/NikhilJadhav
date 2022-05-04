package handlingMultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipKart_Assignment {
//div#container>div:nth-of-type(1)>div:nth-of-type(2)>div>div
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.navigate().refresh();
		List<WebElement> chategry=driver.findElements(By.cssSelector("div#container>div>div:nth-of-type(2)>div>div>div"));
		System.out.println(" get all categerys count :"+chategry.size());
		for(int i=0;i<chategry.size();i++) {
			WebElement options=chategry.get(i);
			String names=options.getText();
			System.out.println("--> "+names);
		}
		
		driver.close();
		
		
		
		

	}

}
