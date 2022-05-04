package keyBoardOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class keyBoard_CopyPaste {

	public static void main(String[] args) {
SeleniumUtility s1= new SeleniumUtility();
		
		WebDriver drive = s1.setUp("chrome", "http://demo.automationtesting.in/Register.html");
		
		WebElement firstnameField =drive.findElement(By.cssSelector("input[placeholder='First Name']"));
		firstnameField.sendKeys("Nikhil",Keys.chord(Keys.CONTROL,"a")); // its will type nikhil and press control plus a (whoch is select all )
		firstnameField.sendKeys(Keys.chord(Keys.CONTROL,"c")); // and after selecting its will copy (by control plus c
		
		drive.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys(Keys.chord(Keys.CONTROL,"v")); //its will paste (by pressing control plus v)
		
		drive.close();
		

	}

}
