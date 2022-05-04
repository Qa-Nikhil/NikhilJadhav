package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice04 {

	public static void main(String[] args) {
		String path = ".\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver cdriver = new ChromeDriver();
		cdriver.get("https://www.flipkart.com/");
		String sourcecode = cdriver.getPageSource();
		System.out.println(" get current page sourcecode "+sourcecode);
		//or 
		System.out.println(" another way to get source code : "+cdriver.getPageSource());
		System.out.println(" get current page url :"+cdriver.getCurrentUrl());
		System.out.println(" get current page title "+cdriver.getTitle());
		cdriver.close();
		
	}

}
