package handlingMultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cricInfocOM {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		 WebDriver drive =new ChromeDriver();
		 
		 drive.manage().window().maximize();
		 
		 drive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 drive.get("https://www.espncricinfo.com/");
		 drive.navigate().refresh();
		 System.out.println("get homepage url :"+drive.getCurrentUrl());
		 System.out.println("get homepage title :"+drive.getCurrentUrl());
		 System.out.println("get source code length :"+drive.getPageSource().length());
		 
		 drive.navigate().refresh();
		 
		 //section#main-container>div:nth-child(3)>div>nav>div>div>div>div:nth-child(2)>div>div>a
		 
		 List<WebElement>Categry=drive.findElements(By.cssSelector("section#main-container>div:nth-child(3)>div>nav>div>div>div>div:nth-child(2)>div>div>a"));
		 
		 System.out.println("*size count * "+Categry.size());
		 
		 for(int i=0;i<Categry.size();i++){
			 
			 WebElement options=Categry.get(i);
			 String names=options.getText();
			 System.out.println("names :"+names);
			 
			 
		 }
		 
		 drive.close();
		 

	}

}
