package keyBoardOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class scrollingOperation_flipkart {

	public static void main(String[] args) throws InterruptedException {
	
       SeleniumUtility s1= new SeleniumUtility();
		
		WebDriver drive =s1.setUp("chrome", "https://www.flipkart.com/");
		
		WebElement bodyElement =drive.findElement(By.xpath("//body"));
		
		bodyElement.sendKeys(Keys.ESCAPE);
		
//		for(int i =0;i<12;i++) {
//			
//			bodyElement.sendKeys(Keys.PAGE_DOWN); // PAGE DOWN(SCROLL DOWN Operation )
//			Thread.sleep(1500);
//			
//		}
		
		// OR 
		
		bodyElement.sendKeys(Keys.chord(Keys.CONTROL,Keys.END)); // direcly page down by cont+end 
	}

}
