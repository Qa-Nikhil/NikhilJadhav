package mouseOperation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class dragAndDrop_Operation {

	public static void main(String[] args) {
		SeleniumUtility s1= new SeleniumUtility();
		
		WebDriver drive=s1.setUp("chrome", "https://www.globalsqa.com/demo-site/draganddrop/");
		
		//List<WebElement>options=drive.findElements(By.xpath("//ul[@id='gallery']/li")); //its in iframe thats why we can't perform action
		
		//frame Handling 
		
		WebElement frame = drive.findElement(By.cssSelector(".demo-frame.lazyloaded"));
		
		drive.switchTo().frame(frame);
			
		Actions act = new Actions(drive);
		
		List<WebElement> sourceElement =drive.findElements(By.xpath("//ul[@id='gallery']/li"));
		System.out.println(""+sourceElement.size());
		
		 WebElement target =drive.findElement(By.id("trash"));
		 
		 act.dragAndDrop(sourceElement.get(0), target).build().perform();
		 act.dragAndDrop(sourceElement.get(1), target).build().perform();
		 act.dragAndDrop(sourceElement.get(2), target).build().perform();
		 act.dragAndDrop(sourceElement.get(3), target).build().perform();
		
		//drive.close();
		

	}

}
