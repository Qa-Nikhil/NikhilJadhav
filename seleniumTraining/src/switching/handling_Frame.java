package switching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class handling_Frame {

	public static void main(String[] args) throws InterruptedException {
		
		SeleniumUtility s1= new SeleniumUtility();
		
		WebDriver drive=s1.setUp("chrome", "https://jqueryui.com/droppable/");
		
		WebElement frame = drive.findElement(By.cssSelector(".demo-frame"));
		// switch your control to frame using webelement 
		 drive.switchTo().frame(frame);
		 		//OR
		 //drive.switch().frame(0) ---> switch your control to frame by using index 
		 
		Actions act=new Actions(drive);
		
		WebElement sorce=drive.findElement(By.id("draggable"));
		
		WebElement target=drive.findElement(By.id("droppable"));
		
		act.dragAndDrop(sorce, target).build().perform(); // drag and drop operation perform
		
		// switch command frame to main page 
		
		drive.switchTo().defaultContent();
		
		drive.findElement(By.cssSelector(".logo")).click();
		
		Thread.sleep(2000);
		
		drive.close();
		
		

	}

}
