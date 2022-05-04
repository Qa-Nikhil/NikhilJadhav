package browserOperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericWayToLaunchAnyWebBrowser {
	
	
	
	public static void main(String[] args) {
		String chromeDriverpath = System.getProperty("\\.executables\\chromedriver.exe");
		String geckoDriverpath = System.getProperty(".\\executables\\geckodriver.exe");

		openBrowser(chromeDriverpath, "chrome");
		openBrowser(geckoDriverpath,"firefox");
	}
	static void openBrowser(String driverpath,String browserName) {
		if(browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
			WebDriver cdiver = new ChromeDriver();
			
		}else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",".\\executables\\geckodriver.exe");
			WebDriver cdriver1 = new FirefoxDriver();
			
		}
	}

}