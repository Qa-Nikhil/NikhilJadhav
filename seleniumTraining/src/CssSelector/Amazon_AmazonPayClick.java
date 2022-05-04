package CssSelector;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon_AmazonPayClick {
//#nav-xshop>a:nth-of-type(10)
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_UP);
		
		WebElement amazonPayLink=driver.findElement(By.cssSelector("#nav-xshop>a:nth-of-type(10)"));
		amazonPayLink.click();
		driver.navigate().back();// will go backword
		
		driver.navigate().to("https://spcindia.spinehr.in/login.aspx");// will jump to that spc url link
		
		driver.navigate().refresh();// refresh the page
		
		driver.navigate().to("https://www.amazon.in/");
		
		driver.findElement(By.cssSelector("#nav-xshop>a:nth-of-type(9)")).click();
		
		driver.navigate().refresh(); 
		
		driver.navigate().back();
		
		//Identify the link from the main menu using findElemnts method
		List<WebElement> allOptions=driver.findElements(By.cssSelector("#nav-xshop>a"));
		
		System.out.println("Total Identified Element "+allOptions.size());
		
		for(int i=0;i<allOptions.size();i++) {
			
			WebElement option=allOptions.get(i);
			String names=option.getText();
			System.out.println("Option names : "+names);
			if(names.equals("Amazon Pay")){
				option.click();
				break;
				
			}else {
				System.out.println(" not matched ");
			}
		}

		
		
		driver.close();// close the web browser

	}

}
