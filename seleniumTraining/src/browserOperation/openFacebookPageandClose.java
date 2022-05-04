package browserOperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openFacebookPageandClose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Step 1 :Executable path
		
		String path1 = "D:\\workspace\\seleniumTraining\\executables\\chromedriver.exe";
		String path2 = System.getProperty("user.dir")+"\\\\executables\\\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", path2);
		// Step 2 : Create a Instance of required browser
		WebDriver cdDriver = new ChromeDriver();
		
		// Step 3 :Enter url
		cdDriver.get("https://www.facebook.com/");
		// Step 4.: (OPTIONAL) Get a current page Source code and print length in console 
		String SourceCode = cdDriver.getPageSource();
		System.out.println(" facebook application Source code is ="+SourceCode);
		System.out.println(" Source code length "+SourceCode.length());
		
		// Step 5: get url from current page and print in console 
		System.out.println(" Current page Url is = "+cdDriver.getCurrentUrl());
		// Step 6: get current page title and print in console
		System.out.println("current page title is = "+cdDriver.getTitle());
		cdDriver.close();
		
		
		
		
		
		}
}