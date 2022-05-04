package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class xPathExample01 {

	public static void main(String[] args) {
		
		SeleniumUtility s1= new SeleniumUtility();
		WebDriver drive =s1.setUp("chrome","http://vtiger-demo.it-solutions4you.com/");
		
		// identify " sign in " inner text in Html code  by text()  ex:<button type ="submit class="button buttonBlue" > Sign in < /buttn>
		
		// x path locator will be "  //button[text()='Sign in']  "
		
		WebElement usrnamefield =drive.findElement(By.xpath("//label[text()='Username']")); // x path 
		
		String usernameText =usrnamefield.getText();
		System.out.println(" text : "+usernameText);
		
		drive.findElement(By.xpath("//button[text()='Sign in']")); // sign in field identified and clicked 
		

		drive.findElement(By.xpath("//input[ contains(@name,'username') ]")); // contains function by attribute name and value  //htmltag[contains(@attributename,'attribute value')]
		           //htmltag[contains(@attributename,'attribute value')]
		
		/**
		 * Xpath:
XML--> its used to store data ---> form node ---> present in XML tree --->path of the node in xml tree is known as xpath
HTML--> Xpath also support HTML

Xpath -->	
		1. Absolute xpath --> starting from root till the target element
		2. Relative xpath --> starting from anywhere till the target element
		
Absolute Xpath Examples:
/html/body/div/div/div/div/div/div/form/div/input
html>body>div>div>div>div>div>div>form>div>input

Google:
/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input
html>body>div:nth-of-type(1)>div:nth-of-type(3)>form>div:nth-of-type(1)>div:nth-of-type(1)>div:nth-of-type(1)>div>div:nth-of-type(2)>input

Relative xpath Examples:
/html/body/div/div/div/div/div/div/form/div/input
	//or
//form/div/input
/html/body//form/div/input
/html//form/div/input

Google:
/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input
/html/body/div[1]//div[1]/div[1]/div/div[2]/input

Xpath by Attribute:
//htmltag[@AN='AV']

<input maxlength="10" name="UserName" type="text">
//input[@name='Username']
//input[@type='text']

<input type="text" value="" class="_3704LK" title="Search for products, brands and more" name="q" autocomplete="off" placeholder="Search for products, brands and more">

//input[@type='text'] //or
//input[@class='']
//input[@title='']
//input[@name='']
//input[@placeholder='']
	   


//htmltag[@PN='PV' or @PN='PV']
//input[@name='username' or @type='text']
//htmltag[@PN='PV' and @PN='PV']
//input[@name='username' and @type='text']

Xpath with functions/Axes :
1. text() --> //htmltag[text()='innertext']
HTML code: <button id="submit" type="submit" class="btn btn-primary">Submit</button>
			--->//button[text()='Submit']


2. contains(args, args)-->//htmltag[contains(args1,args2)]
		args1: any html attribute preceded by '@' or text()
		args2: attribute value or inner text
		//h1[contains(text(),'Automation Demo Site')]
	* ----->	//input[contains(@id,'username')]
HTML Code:		
<input maxlength="10" name="UserName3232" type="text">  //or
<input maxlength="10" name="avhg_UserName" type="text">  //or
<input maxlength="10" name="nbjh_UserName3232" type="text">
		//input[contains(@name,'UserName')]

<div> Login </div>
		//div[text()='Login'] -----> no match
		//div[conatins(text(),'Login')]

^ ---> starts-with(arg1,arg2)
$ ---> ends-with(arg1,arg2)
* ---> contains(arg1,arg2)


<input maxlength="10" name="UserName3232" type="text">
<input maxlength="10" name="UserName_6565" type="text">
<input maxlength="10" name="UserName_r7ug" type="text">
<input maxlength="10" name="UserName-658" type="text">
CSS: input[name^='UserName']
3. starts-with(args, args) --->'^'--->//input[starts-with(@name,'UserName')]

<input maxlength="10" name="11232UserName" type="text">
<input maxlength="10" name="dwer23UserName" type="text">
<input maxlength="10" name="234fefUserName" type="text">
<input maxlength="10" name="242reUserName" type="text">
CSS: input[name$='UserName']
3. ends-with(args, args) --->'$'--->//input[ends-with(@name,'UserName')]


4. following : https://www.demoblaze.com/
5. preceding 
6. following-sibling
7. preceding-sibling

8. Dependent and Independent
i. identify dependent and independent element
ii. right click on independent element and see the HTML tree
iii. in the HTML tree move your mouse pointer upwards in HTML tree till the both independent and dependent elements are highlighted or covered
iv. note down the HTML structure from comman parent
v. write xpath expression for independent element
vi. using independent element expression write xpath expression for comman parent(make sure in UI
	both dependent and independent elements are highlighted together)
vii. from the comman parent expression write xpath for dependent element
		 */
		
		
		

	}

}
