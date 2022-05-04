package dropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown_Assignment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.END);
		
		// this method only work on dropdown Htlm element tagName start with Select name 
		//then only use below method 
		
		WebElement selectDropDown=driver.findElement(By.id("Skills"));
		
		Select selectSkill=new Select(selectDropDown);
		
		System.out.println(" is dropdown is allowing you to select multiple option :"+selectSkill.isMultiple());
		
//		WebElement selectedOption=selectSkill.getFirstSelectedOption();
//		String selectedOptionName=selectedOption.getText();
//		System.out.println("options: "+selectedOption);
//		System.out.println("selected option name :"+selectedOptionName);
		System.out.println("already selected option name :"+selectSkill.getFirstSelectedOption().getText());
		
		List<WebElement> option = selectSkill.getOptions();
		
		System.out.println("option count is :"+option.size());
		
		for(int i = 0;i<option.size();i++) {
			System.out.println(" option "+i+": "+option.get(i).getText());
		}
		
		driver.close();

	}

}
