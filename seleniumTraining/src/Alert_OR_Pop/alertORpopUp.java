package Alert_OR_Pop;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.github.dockerjava.api.model.Driver;

import utilities.SeleniumUtility;

public class alertORpopUp {

	public static void main(String[] args) {
		
		SeleniumUtility s1=new SeleniumUtility();
		
		WebDriver drive = s1.setUp("chrome", "https://demoqa.com/alerts");
		
		WebElement clickBtn=drive.findElement(By.id("alertButton"));
		
		clickBtn.click();
	//	alertPopUp.sendKeys(Keys.ESCAPE); // when u escape command passed its will escape the pop up but in console it will give u UnhandledAlertException as Follows
											// org.openqa.selenium.UnhandledAlertException: unexpected alert open: {Alert text : You clicked a button}
											//for that u have to use drive.switchTo().alert()......
		
		System.out.println("alert Text : "+drive.switchTo().alert().getText());
		
		drive.switchTo().alert().accept();
		
		WebElement confitmboxBtn=drive.findElement(By.id("confirmButton"));
		
		confitmboxBtn.click();
		String seeAlertText=drive.switchTo().alert().getText();
		System.out.println("get alert Text : "+seeAlertText);
		//drive.switchTo().alert().accept();
		             //or
		drive.switchTo().alert().dismiss();
		
		WebElement getTextafterClick=drive.findElement(By.id("confirmResult"));
		String seeTextAfterSelect=getTextafterClick.getText();
		System.out.println("see text after selecting ok to alert "+seeTextAfterSelect);
	
		
		
		//WebElement promeAlertResult=drive.findElement(By.xpath("//span[text()='On button click, prompt box will appear']"));
		
		//
		WebElement promeAlertResult=drive.findElement(By.cssSelector("#javascriptAlertsWrapper>div:nth-child(4)>div:nth-child(1)"));
		
		System.out.println("before selecting prompt alert Get text :"+promeAlertResult.getText());
		
		WebElement promAlert=drive.findElement(By.id("promtButton"));
		
		promAlert.click();
	
		System.out.println("Get contains Text in alert messege "+drive.switchTo().alert().getText());
		
		drive.switchTo().alert().sendKeys("Nikhil Jadhav");
		
		drive.switchTo().alert().accept();
			//OR
		//drive.switchTo().alert().dismiss();
		
		System.out.println("After selecting prompt alert Get text :"+promeAlertResult.getText());
		
		
		
		
		
		
		
		
		
		
	}

}
