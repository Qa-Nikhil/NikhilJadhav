package cssSelector_Validation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class cssSelectorValidation {

	public static void main(String[] args) {
		
		SeleniumUtility s1= new SeleniumUtility();
		
		WebDriver drive=s1.setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		
		WebElement signInBtn=drive.findElement(By.cssSelector("button[class='button buttonBlue']"));
		
		String fontSize =signInBtn.getCssValue("font-size");
		String fontColor=signInBtn.getCssValue("color");
		String backGrountImageColor=signInBtn.getCssValue("background-image");
		
		System.out.println("Font Size : "+fontSize);						
		System.out.println("Font color :"+fontColor);							// Cross Check On google rgba to hex w3
		System.out.println("Back Ground Color :"+backGrountImageColor);			// cross check--- and verified in HTML Attribute: #35aa47(which is found in google crome)
		
		

	}

}





/**
* If you want to validate CSS property of any Object than use getCssValue(String cssAtrributeNmae)---->	String 
* 
* 		*- Font size()
* 		*- Font color()
* 		*- Button color
*
*Object Location Validation 
*
*/