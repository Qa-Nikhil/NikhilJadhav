package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		String path = ".\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS); //Implicite wait 
		driver.get("https://demo.actitime.com/login.do"); // go to that url
		driver.findElement(By.id("username")).sendKeys("admin");// type admin in username field
		driver.findElement(By.name("pwd")).sendKeys("manager");// type manager in pwd field
		driver.findElement(By.id("loginButton")).click();//click on loginButton
		WebElement logOutBtn=driver.findElement(By.id("logoutLink"));//find logoutlink button
	
		WebDriverWait wait=new WebDriverWait(driver,20);// Explicit wait 
		wait.until(ExpectedConditions.elementToBeClickable(logOutBtn));
		System.out.println(" your current page title :"+driver.getTitle());
		
		String actualHomePageTitle=driver.getTitle();
		System.out.println("actual Home Page Title "+actualHomePageTitle);
		String ExpectedlHomePageTitle="actiTIME - Enter Time-Track";
		if(actualHomePageTitle.equals(ExpectedlHomePageTitle)) {
			System.out.println("Login is successful and home page title is also varified");
		}else {
			System.out.println("Either login is failed or home page title is changed ");
		}
		driver.findElement(By.id("logoutLink")).click();//then click on logOut Button
		
		driver.close();// close the webPage	
	}

}
