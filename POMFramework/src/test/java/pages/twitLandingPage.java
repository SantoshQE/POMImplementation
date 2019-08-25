package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import config.Configuration;

public class twitLandingPage 
{
	
	WebDriver driver;
	public twitLandingPage(WebDriver driver)
	{
		this.driver = driver;
	}	
	
	@FindBy(xpath=Configuration.twit_HomeLink)
	public WebElement twit_HomeLink;
	@FindBy(xpath=Configuration.twit_ExploreLink)
	public WebElement twit_ExploreLink;
	@FindBy(xpath=Configuration.twit_NotificationsLink)
	public WebElement twit_NotificationsLink;
	@FindBy(xpath=Configuration.twit_MessagesLink)
	public WebElement twit_MessagesLink;	
	@FindBy(xpath=Configuration.twit_BookmarksLink)
	public WebElement twit_BookmarksLink;	
	@FindBy(xpath=Configuration.twit_ListsLink)
	public WebElement twit_ListsLink;		
	@FindBy(xpath=Configuration.twit_ProfileLink)
	public WebElement twit_ProfileLink;		
	@FindBy(xpath=Configuration.twit_MoreLink)
	public WebElement twit_MoreLink;		
	
	public void goToHomeLink()
	{
		twit_HomeLink.click();
	}
	public void goToExploreLink()
	{
		twit_ExploreLink.click();
	}
	public twitMyProfilePage goToProfileLink()
	{
		twit_ProfileLink.click();
		return PageFactory.initElements(driver, twitMyProfilePage.class);
	}
}
