package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import config.Configuration;

public class twitLoginPage 

{
	WebDriver driver;
	public twitLoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(xpath=Configuration.twit_username)
	public WebElement twit_username;
	@FindBy(xpath=Configuration.twit_password)
	public WebElement twit_password;
	@FindBy(xpath=Configuration.twit_BtnLogin)
	public WebElement twit_BtnLogin;
	////*[@id="message-drawer"]/div/div/span
	
	public twitLandingPage dologin(String myusername,String pwd)
	{
		twit_username.sendKeys(myusername);
		twit_password.sendKeys(pwd);
		twit_BtnLogin.click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		return PageFactory.initElements(driver, twitLandingPage.class);
	} 

	

}
