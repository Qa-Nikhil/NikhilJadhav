package browserOperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWaytoOpenChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path1 = " D:\\workspace\\seleniumTraining\\executables\\chromedriver.exe";
		String path2 =".\\executables\\chromedriver.exe";
		String path3 = System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",path2);
		
				//OR
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		
		ChromeDriver cdirver = new ChromeDriver();
		
		// Generic way to launch 
		
		WebDriver cdriver1 = new ChromeDriver();
		
		
		
	}
	

}
