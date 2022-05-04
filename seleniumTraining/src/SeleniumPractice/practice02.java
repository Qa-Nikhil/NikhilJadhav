package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice02 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe"); // u can direcrly launch by using this type
		//ChromeDriver cdriver = new ChromeDriver();
		
		// Generic way to launch browser 
		WebDriver cdriver = new ChromeDriver();
		
		
	}

}
