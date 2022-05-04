package cssSelector_Validation;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class LocationValidation {

	public static void main(String[] args) {
		
		SeleniumUtility s1=new SeleniumUtility();
		
		WebDriver drive=s1.setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		
			/**
			 * Verify that password field comes after username field 
			 * Verify that signIn button comes after password field 
			 * 
			 * Object Location validation : for this use getLocation() of selenium which will return point Class Object 
			 * 
			 * In order to get 'x' and get 'y' use below method of point class
			 * 
			 * 	getX();----> int 
			 * 	getY();----> int
			 *
			 */
		
		WebElement userNameField=drive.findElement(By.id("username"));
		
		Point userNameLocation=userNameField.getLocation();// getLocation returns Point 
		userNameLocation.getX();// get getX() returns Int type
		userNameLocation.getY();
		int username_X=userNameLocation.getX();
		int username_Y=userNameLocation.getY();
		
		System.out.println("usename co ordinate of X :"+username_X);
		System.out.println("usename co ordinate of Y :"+username_Y);
		
		
		
		WebElement pwdField =drive.findElement(By.id("password"));
		Point pwdLocation =pwdField.getLocation();
		int pwdLocation_X=pwdLocation.getX();
		int pwdLocation_Y=pwdLocation.getY();
		System.out.println("pwd field co ordinate of X :"+pwdLocation_X);
		System.out.println("pwd field co ordinate of Y :"+pwdLocation_Y);
		
		
		System.out.println("Check whether password field comes after userName field : "+(username_Y<pwdLocation_Y));
		
		WebElement signBtn=drive.findElement(By.cssSelector("button[class='button buttonBlue']"));
		Point signBtnLocation = signBtn.getLocation();
		signBtnLocation.getX();
		signBtnLocation.getY();
		int signLocation_X=signBtnLocation.getX();
		int signLocation_Y=signBtnLocation.getY();
		System.out.println("sign btn Co ordinate X:"+signLocation_X);
		System.out.println("sign btn Co ordinate Y:"+signLocation_Y);
		
		System.out.println("Check whether psw field comes after usename field :"+(username_Y<signLocation_Y));
		
		
		drive.close();
	}

}
