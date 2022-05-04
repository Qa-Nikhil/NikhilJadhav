package dropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown01 {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		 
		 WebDriver drive=new ChromeDriver();
		 
		 drive.manage().window().maximize();
		 drive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 drive.get("http://demo.automationtesting.in/Register.html");
		 
		WebElement yearDropDown= drive.findElement(By.id("yearbox"));
		
		Select yearselect=new Select(yearDropDown);
		
		System.out.println("is dropdown is allowing u to select multiple option :"+yearselect.isMultiple());
		
//		WebElement selectoption = yearselect.getFirstSelectedOption();
//		String selectoptionName=selectoption.getText();
//		System.out.println(" option names :"+selectoptionName);
		
								//OR
		
		System.out.println("already select 	option Name :"+yearselect.getFirstSelectedOption().getText());
		
		List<WebElement> option =yearselect.getOptions();
		
		System.out.println("option :"+option.size());
		
		drive.findElement(By.cssSelector("body")).sendKeys(Keys.END);
		
		for(int i=0;i<option.size();i++) {
			
//			WebElement listdropDown=option.get(i);
//			
//			String names=listdropDown.getText();
//			
//			System.out.println(" > "+names);
			
			//or
			
			
			System.out.println("option "+i+" : "+option.get(i).getText());
			
			
			
		}
			// select option from dropDown 
		yearselect.selectByIndex(4);
		//OR
		yearselect.selectByValue("1994");
		//or
		yearselect.selectByVisibleText("1975");
		
	
		
		drive.close();

	}
	

}
