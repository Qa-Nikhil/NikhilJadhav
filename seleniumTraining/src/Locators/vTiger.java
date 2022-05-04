package Locators;

import org.openqa.selenium.By;									
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

					/*Assignment Is http://vtiger-demo.it-solutions4you.com/ in that url already username
					 * and password field is writed so you have to REMOVE that both field and re Enter username & password
					*/

public class vTiger {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		WebDriver driveTiger=new ChromeDriver();
		driveTiger.get("http://vtiger-demo.it-solutions4you.com/");
		WebElement usernameField=driveTiger.findElement(By.id("username"));
		usernameField.clear();
		driveTiger.findElement(By.id("password")).clear();
		usernameField.sendKeys("standarduser");
		driveTiger.findElement(By.id("password")).sendKeys("password");
		driveTiger.close();
	}
}
