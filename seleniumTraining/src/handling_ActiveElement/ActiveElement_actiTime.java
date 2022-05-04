package handling_ActiveElement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class ActiveElement_actiTime {

	public static void main(String[] args) {
		 
		// Active Element means when u open the web page cursor(pointer of text) should be on field 
					// then u can use drive.switchTo().activeElement();
				
				SeleniumUtility s1= new SeleniumUtility();
				
				WebDriver drive=s1.setUp("chrome", "https://demo.actitime.com/login.do");
				
				
				//without finding element you can perform operation if only cursor is active element 
				// validate by default cursor is pointing to usename field 
				
				WebElement activeObject = drive.switchTo().activeElement(); 	// its returns WebElement 
				
				String activebjectPlaceHolder=activeObject.getAttribute("placeholder");
				
				String expectedActiveObject="Username";
				if(activebjectPlaceHolder.equals(expectedActiveObject)) {
					System.out.println("cursor pointer validation is successful");
				}else {
					System.out.println("Unsuccessfull");
				}		
				activeObject.sendKeys("admin",Keys.TAB);
				
				drive.switchTo().activeElement().sendKeys("manager",Keys.ENTER);

	}

}
