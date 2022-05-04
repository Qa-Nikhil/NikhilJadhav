package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice03 {

	public static void main(String[] args) {
		String path= "D:\\workspace\\seleniumTraining\\executables\\chromedriver.exe";
		String path1=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path1);
		WebDriver cdriver = new ChromeDriver();
		cdriver.get("https://www.facebook.com/");
		String sourcecode=cdriver.getPageSource();
		System.out.println("get current page source code : "+sourcecode);
		System.out.println("get source code length :  "+sourcecode.length());
		System.out.println(" get current page title : "+cdriver.getCurrentUrl());
		System.out.println("get title of current webpage : "+cdriver.getTitle());
		cdriver.close();
		
	}

}
