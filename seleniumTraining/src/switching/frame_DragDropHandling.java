package switching;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class frame_DragDropHandling {							//Pending 

	public static void main(String[] args) {
		 
		SeleniumUtility s1= new SeleniumUtility();
		
		WebDriver drive=s1.setUp("chrome", "https://jqueryui.com/sortable/");
		
		WebElement frame=drive.findElement(By.cssSelector(".demo-frame"));
		
		drive.switchTo().frame(frame);
		
		Actions act= new Actions(drive);
		
		List<WebElement>sorceList=drive.findElements(By.cssSelector("ul#sortable>li"));
	
	   	System.out.println(":- "+sorceList.size());
	   	
	   	WebElement sorce=drive.findElement(By.cssSelector("ul#sortable>li"));
	   	System.out.println(sorce.isEnabled());
	   	
	    WebElement target=drive.findElement(By.xpath("//ul[@id='sortable']/li[7]"));
	    
	    act.dragAndDrop(sorceList.get(1), target).build().perform();    
	    
	    
	}

}
