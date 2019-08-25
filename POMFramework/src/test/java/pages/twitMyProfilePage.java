package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import config.Configuration;

public class twitMyProfilePage 
{
	WebDriver driver;
	public twitMyProfilePage(WebDriver driver)
	{
		this.driver = driver;
	}
	@FindBy(xpath=Configuration.twit_EditProfileLink)
	public WebElement twit_EditProfileLink;

	
	public twitEditProfilePage editProfile()
	{
		twit_EditProfileLink.click();
		
		return PageFactory.initElements(driver, twitEditProfilePage.class);
	}
	
	
}
