package webDriverMangerSetUpChrome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webDriverMangerChrome00 {

	public static void main(String[] args) {
		
//		String drivePath=System.getProperty("user.dir")+".\\executables\\chromedriver.exe";
//		System.setProperty("webdriver.chrome.driver", drivePath);
		
		
		//OR
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver drive=new ChromeDriver();
		
		drive.manage().window().maximize();
		
		drive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		drive.get("https://www.facebook.com/");
		
		
		System.out.print("ok");// for confirmation 
		drive.close();
		

	}

}
