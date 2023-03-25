package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.ConfigReader;
import utilities.CrossBrowser;
import utilities.ExcelUtils;


public class Sign_In_Objects {

	public WebDriver driver = CrossBrowser.getDriver();
	//ExcelUtils excel= new ExcelUtils();
	
	String registerurl= ConfigReader.getRegistrationPage();
	String UserName= ExcelUtils.GetUserName(1,0);
	String PassWord= ExcelUtils.GetPassword(1, 1);
	
	By registerlink= By.xpath("//a[text()='Register!']");
	By loginlink= By.xpath("//a[text()='Login ']");
	By username = By.id("id_username");
	By password = By.id("id_password");
	By loginbtn = By.xpath("//input[@value='Login']");
	By signoutlink = By.xpath("//a[text()='Sign out']");
	
	public void Click_Register_link()
	{
		driver.findElement(registerlink).click();
	}
	public void Register_page_url()
	{
		driver.get(registerurl);
	}
	public void Enter_UserName_Password()
	{
		driver.findElement(username).sendKeys(UserName);
		driver.findElement(password).sendKeys(PassWord);
		//return user_name;
	}
	public void Click_Login_link()
	{
		driver.findElement(loginlink).click();
	}
	public void click_login_button()
	{
		driver.findElement(loginbtn).click();
	}
	public void Click_SignOut_Link()
	{
		driver.findElement(signoutlink).click();
	}


}
