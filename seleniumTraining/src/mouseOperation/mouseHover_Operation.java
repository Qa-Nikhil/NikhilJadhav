package mouseOperation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class mouseHover_Operation {

	public static void main(String[] args) throws InterruptedException{
		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver drive = s1.setUp("chrome", "https://www.globalsqa.com/");
		List<WebElement> menuList =drive.findElements(By.cssSelector("div[id='menu']>ul>li>a"));
		System.out.println(menuList.size());
		 
		Actions act = new Actions(drive);
		
		for (int i=0;i<menuList.size();i++) {
			
			WebElement names=menuList.get(i);
			act.moveToElement(names).perform();
			Thread.sleep(2000);
			
		
		}
		

	}

}
