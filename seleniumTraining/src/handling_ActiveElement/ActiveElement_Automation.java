package handling_ActiveElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class ActiveElement_Automation {

	public static void main(String[] args) {
		 
		SeleniumUtility s1= new SeleniumUtility();
		
		WebDriver drive=s1.setUp("chrome", "http://demo.automationtesting.in/Register.html");
		
		Actions act = new Actions(drive);
		
		WebElement firstNameField=drive.findElement(By.cssSelector("input[type='text']"));
		
		
		
		firstNameField.sendKeys("Nikhil",Keys.TAB);
		
		WebElement activeObject=drive.switchTo().activeElement();
		
       String activebjectPlaceHolder=activeObject.getAttribute("placeholder");
		
		String expectedActiveObject="Last Name";
		
		if(activebjectPlaceHolder.equals(expectedActiveObject)) {
			System.out.println("cursor pointer validation is successful");
		}else {
			System.out.println("Unsuccessfull");
		}		
		activeObject.sendKeys("Jadhav",Keys.TAB);
		
		drive.switchTo().activeElement().sendKeys("Pune",Keys.TAB);
		
		drive.switchTo().activeElement().sendKeys("nikhil_nj@yahoo.com",Keys.TAB);
		
		drive.switchTo().activeElement().sendKeys("8888273544",Keys.TAB);
		
		drive.switchTo().activeElement().click();
		
		drive.switchTo().activeElement().sendKeys(Keys.TAB);
		
		drive.switchTo().activeElement().click();
		
		drive.switchTo().activeElement().sendKeys(Keys.END);
		
		drive.findElement(By.id("msdd")).click();
				
		List<WebElement>list01=drive.findElements(By.cssSelector(".ui-autocomplete.ui-front>li"));
		
		
		System.out.println(": "+list01.size());
		
		for(int i=0;i<list01.size();i++) {
			
			System.out.println(""+i+":"+list01.get(i).getText());
			
			
			
		}
	
		
		
		
//		List<WebElement> skillList=drive.findElements(By.xpath("//select[@type='text']/option[2]"));
//		
//		System.out.println( skillList.size());
		
		
		
		
		
	}

}
