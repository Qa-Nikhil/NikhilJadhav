package dropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootStrap_dropDown {
//#bsd1-button
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		 
		 WebDriver drive = new ChromeDriver();
		 
		 drive.manage().window().maximize();
		 
		 drive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 drive.get("https://thompsonsj.com/bootstrap-select-dropdown/");
		 
		 drive.findElement(By.cssSelector("div[class='input-group-append']>button")).click();
		 
		 List<WebElement> options = drive.findElements(By.cssSelector(".dropdown-menu.dropdown-menu-right.show>div>a"));
		 
		System.out.println("number of options : "+options.size());
		
			for(int i=0;i<options.size();i++) {
				System.out.println(" option "+i+" :"+options.get(i).getText());
			}
		options.get(23).click();
		
		 
		// drive.close();

	}

}
