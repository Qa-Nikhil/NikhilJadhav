package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitilyWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = ".\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS); //Implicite wait 
		driver.get("https://demo.actitime.com/login.do"); // go to that url
		//Identify the required element from the UI and perform required action 0-30
		driver.findElement(By.id("username")).sendKeys("admin");// type admin in username field
		
		//Identify the required element from the UI and perform required action 0-30
		driver.findElement(By.name("pwd")).sendKeys("manager");// type manager in pwd field
		
		//Identify the required element from the UI and perform required action 0-30
		driver.findElement(By.id("loginButton")).click();//click on loginButton
		
		//Identify the required element from the UI and perform required action 0-30
		driver.findElement(By.id("logoutLink")).click();//then click on logOut Button
		
		//Identify the required element from the UI and perform required action 0-30
		driver.findElement(By.id("username")).sendKeys("trainee");// again re-Enter or type 'trainee' in username field
		
		//Identify the required element from the UI and perform required action 0-30
		driver.findElement(By.name("pwd")).sendKeys("trainee");// agian re-Enter or type 'trainee' in password field
		
		//Identify the required element from the UI and perform required action 0-30
		driver.findElement(By.id("loginButton")).click();// again click on loginButton
		
		//Identify the required element from the UI and perform required action 0-30
		driver.findElement(By.id("logoutLink")).click();//then click on logOut Button
		
		//Identify the required element from the UI and perform required action 0-30
		driver.close();// close the webPage	
	}

}
