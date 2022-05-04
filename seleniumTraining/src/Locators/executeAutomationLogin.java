package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class executeAutomationLogin {
	//https://demosite.executeautomation.com/

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("https://demosite.executeautomation.com");
		drive.findElement(By.name("UserName")).sendKeys("UserName");
		drive.findElement(By.name("Password")).sendKeys("Password");
		WebElement loginBtn=drive.findElement(By.name("Login"));
		loginBtn.click();
		
		
		

	}

}
