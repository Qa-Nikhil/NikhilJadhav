package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class swaglab {

	public static void main(String[] args) {
		String path="D:\\workspace\\seleniumTraining\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.saucedemo.com/");
		WebElement usernameInputField =drive.findElement(By.id("user-name"));
		
		// OR Directly
		
		//drive.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
		
		usernameInputField.sendKeys("performance_glitch_user");
		WebElement pswField=drive.findElement(By.id("password"));
		
		pswField.sendKeys("secret_sauce");
		//or
		//drive.findElement(By.id("password")).sendKeys("secret_sauce");
		
		WebElement loginBtn=drive.findElement(By.id("login-button"));
		loginBtn.click();
		//or
		//drive.findElement(By.id("login-button")).click();
		//drive.close();
		
		
		
		
		

	}

}
