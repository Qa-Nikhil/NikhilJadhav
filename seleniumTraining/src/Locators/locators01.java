package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators01 {

	public static void main(String[] args) {
		
		String path = "D:\\workspace\\seleniumTraining\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver ddriver = new ChromeDriver();
		ddriver.get("https://demo.actitime.com/login.do");
		String sourcecode = ddriver.getPageSource();
//		System.out.println("get current page source code:"+sourcecode);
//		System.out.println(" get length of source code :"+sourcecode.length());
//		System.out.println(" get current page url "+ddriver.getCurrentUrl());
//		System.out.println(" get current page title "+ddriver.getTitle());
		
		WebElement usenameInputfield =	ddriver.findElement(By.id("username"));
		usenameInputfield.sendKeys("NikhilJadhav");
		usenameInputfield.clear();
		usenameInputfield.sendKeys("admin");
		WebElement pwdInputField=ddriver.findElement(By.name("pwd"));
		pwdInputField.sendKeys("manager");
		WebElement clcikOnLoggedIn =ddriver.findElement(By.id("keepLoggedInLabel"));
		clcikOnLoggedIn.click();
		WebElement loginBtn =ddriver.findElement(By.id("loginButton"));
		loginBtn.click();
		
		ddriver.close();
		
		
		
		
		
		
	//	ddriver.close();
		
		
		
		
		
		

	}

}

