package handlingMultipleElements;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoBlazeAssignemt01 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demoblaze.com/");
		
		List<WebElement> allOptions=driver.findElements(By.cssSelector(".list-group>a"));
		
		System.out.println("all otions count :"+allOptions.size());
		
		//Creatind Expecting result
		List<String> n1=new ArrayList<String>();
		
		
		n1.add("CATEGORIES");
		
		n1.add("Phones");
		
		n1.add("Laptops");
		
		n1.add("Monitors");
		
		for(int i=0;i<allOptions.size();i++) {
		
			WebElement cat =allOptions.get(i);
			
			System.out.println(" *****Element of list is : "+cat.getText()+"  *******");
			
			System.out.println("cat is displayed  :"+cat.isDisplayed());
			
			System.out.println(" cat is editable  :"+cat.isEnabled());
			
			System.out.println(cat.getText().equals(n1.get(i)));
		}
		
		
	}

}
