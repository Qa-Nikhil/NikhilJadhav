package SeleniumPractice;

import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxBroswer {

	public static void main(String[] args) {
		// get required browser executable path
	
		String path1="D:\\workspace\\seleniumTraining\\executables\\geckodriver.exe";
		String path2 = ".\\executables\\geckodriver.exe";
		String path3 = System.getProperty("user.dir")+"\\executables\\geckodriver.exe";
		// set required browser executable path using System.setProperty(string key,path);
		System.setProperty("webdriver.gecko.driver", path2);
		
		// create an instance of required browser class
		FirefoxDriver cdirver =new FirefoxDriver();
		

	}

}
