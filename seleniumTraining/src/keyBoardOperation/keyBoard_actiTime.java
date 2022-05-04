package keyBoardOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class keyBoard_actiTime {

	public static void main(String[] args) {
		SeleniumUtility s1= new SeleniumUtility();
		
		WebDriver drive = s1.setUp("chrome", "https://demo.actitime.com/login.do");
		// login in actiTime application using by enter and tap keyboard operation 
		drive.findElement(By.id("username")).sendKeys("admin",Keys.TAB); // by pressing tap it will go on next field 
		drive.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER); // after filling pwd field its will enter and directly loged in 
		
		
		
		
		
	}

}
