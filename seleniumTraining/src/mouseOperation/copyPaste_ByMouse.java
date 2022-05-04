package mouseOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class copyPaste_ByMouse {

	public static void main(String[] args) {
		
		SeleniumUtility s1= new SeleniumUtility();
		
		WebDriver drive = s1.setUp("chrome", "http://demo.automationtesting.in/Register.html");
		
		// identify first name field 
		WebElement usernameField=drive.findElement(By.cssSelector("input[placeholder='First Name']"));
		usernameField.sendKeys("Nikhil"); // type nikhil in above field 
		
		Actions act = new Actions(drive);
		
		act.moveToElement(usernameField).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform(); //cont(down)+c+comt(up)
		
		WebElement lastNameField = drive.findElement(By.cssSelector("input[placeholder='Last Name']"));
		
		act.moveToElement(lastNameField).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		
		
		
		

	}

}
