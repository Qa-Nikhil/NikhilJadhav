package keyBoardOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class keyBoard_flipkart {

	public static void main(String[] args) {
			
		SeleniumUtility s1= new SeleniumUtility();
		
		WebDriver drive =s1.setUp("chrome", "https://www.flipkart.com/");
		// when opne flipkart web page you will get pop of login  automatically so for that avoiding or ecaping u can directly click on escape button from keyboard by selenium
		// as follows
		
		drive.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE); // in html body,press escape button to avoid from pop up 
		
		//drive.close();
		
		

	}

}
