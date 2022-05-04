package validation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangeHrm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		drive.manage().window().maximize();//window maximize
		drive.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement forgotPwd=drive.findElement(By.linkText("Forgot your password?"));
		forgotPwd.click();
		drive.navigate().back();//backword
		Thread.sleep(2000);
		drive.navigate().forward();//forword
		Thread.sleep(2000);
		drive.navigate().refresh();//window refresh
		Thread.sleep(2000);
		drive.navigate().to("https://spcindia.spinehr.in/login.aspx");
		Thread.sleep(5000);
		
		drive.close();		
	}

}
