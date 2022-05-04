package SeleniumPractice;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice05 {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir")+".\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		WebElement userNameField = driver.findElement(By.id("username"));
		driver.findElement(By.id("loginButton"));
		System.out.println("UserName field vasibility status is : "+userNameField.isDisplayed());
		System.out.println("useName Field is editable status is :"+userNameField.isEnabled());
		String actualDefaultTextOnuserNameField=userNameField.getAttribute("placeholder");
		System.out.println(" het actual defualt text on username field "+actualDefaultTextOnuserNameField);
		userNameField.sendKeys("admin");
		WebElement pwdField =driver.findElement(By.name("pwd"));
		System.out.println("password field visible status :"+pwdField.isDisplayed());
		System.out.println("password field is editable status is :"+pwdField.isEnabled());
		String actualTextOnDefultPwdField = pwdField.getAttribute("placeholder");
		System.out.println("get actual text on pwd field is : "+actualTextOnDefultPwdField);
		pwdField.sendKeys("manager");
		WebElement checkBox=driver.findElement(By.id("keepLoggedInCheckBox"));
		System.out.println("check box is selected status :"+checkBox.isSelected());
		System.out.println(" is check Box is visible status :"+checkBox.isDisplayed());
		checkBox.click();
		System.out.println("check box is selected status :"+checkBox.isSelected());
		System.out.println(" is check box is clickable :"+checkBox.isEnabled());
		WebElement loginBtn=driver.findElement(By.id("loginButton"));
		System.out.println("login button visible status :"+loginBtn.isDisplayed());
		System.out.println(" login button is clickable :"+loginBtn.isEnabled());
		System.out.println("Get tag name for login button : "+loginBtn.getTagName());
		loginBtn.click();
		WebElement logoutBtn=driver.findElement(By.id("logoutLink"));
		logoutBtn.click();
		driver.close();
		
	}

}
