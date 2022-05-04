package SeleniumPractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
// Crome Browser Open 
	public static void main(String[] args) {
		
		// get required path of browser executable path
		String path1= "D:\\workspace\\seleniumTraining\\executables\\chromedriver.exe";
		String path2=".\\executables\\chromedriver.exe";
		String path3= System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		
		// set required browser executable path using System.setProperty(String key,path);
		System.setProperty("webdriver.chrome.driver",path2);
		
		// Create an instance of required browser class
		ChromeDriver cdriver = new ChromeDriver(); 
		
	}

}
