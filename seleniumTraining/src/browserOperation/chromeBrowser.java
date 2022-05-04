package browserOperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
														// open CromeBrowser 
public class chromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String path1 ="D:\\workspace\\seleniumTraining\\executables\\chromedriver.exe" ;
 String path2 = System.getProperty("user.dir")+"\\\\executables\\\\chromedriver.exe";
 System.setProperty("webdriver.chrome.driver", path2);
 ChromeDriver cdriver=new ChromeDriver();
 		//OR 
 // Generic way to launch browser 
 
 	WebDriver cdriver1 = new ChromeDriver();
 
	}

}
