package browserOperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators01 {

	public static void main(String[] args) {
		String path= ".\\executables\\chromedriver.exe";
		System.getProperty("webdriver.chrome.driver",path);
		WebDriver ddriver = new ChromeDriver();
		System.out.println(" get current page Url :"+ddriver.getCurrentUrl());
		System.out.println(" get current page title :"+ddriver.getTitle());
		
		
	}

}
