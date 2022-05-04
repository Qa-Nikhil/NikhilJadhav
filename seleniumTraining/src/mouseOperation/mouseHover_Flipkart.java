package mouseOperation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class mouseHover_Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub  	////div[@id='container']/div/div[2]/div/div/div/a

		////div[contains(text(),'Top Offers')]
		
SeleniumUtility s1= new SeleniumUtility();
		
		WebDriver drive =s1.setUp("chrome", "https://www.flipkart.com/");
		// when opne flipkart web page you will get pop of login  automatically so for that avoiding or ecaping u can directly click on escape button from keyboard by selenium
		// as follows
		
		drive.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE); // in html body,press escape button to avoid from pop up 
		List<WebElement> menuList0=drive.findElements(By.xpath("//div[@id='container']/div/div[2]/div/div/div/a"));
		System.out.println(" lists: "+menuList0.size());
		
		Actions act = new Actions(drive);
		
		for (int i =0;i<menuList0.size();i++) {
				WebElement names = menuList0.get(i);
				System.out.println(i+":"+names);
				act.moveToElement(names).perform();
				Thread.sleep(2000);
		}
		drive.close();
		
		
		
	}

}
