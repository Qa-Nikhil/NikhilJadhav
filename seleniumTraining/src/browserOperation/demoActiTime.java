package browserOperation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class demoActiTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path1 = "D:\\workspace\\seleniumTraining\\executables\\geckodriver.exe";
		String geckoDriverPath = System.getProperty("user.dir")+"\\executables\\geckodriver.exe";
		System.getProperty(geckoDriverPath,"firefox");
	
		System.setProperty("webdriver.gecko.driver",path1);
		FirefoxDriver drive=new FirefoxDriver();
		drive.get("https://www.actitime.com");
		String sourceCode = drive.getPageSource();
		System.out.println(" get Source code is ="+sourceCode);
		System.out.println(" Source code length "+sourceCode.length());
		//drive.close();
	}

}
