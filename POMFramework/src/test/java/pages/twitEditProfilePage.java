package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import config.Configuration;

public class twitEditProfilePage 
{
	WebDriver driver;
	public twitEditProfilePage(WebDriver driver)
	{
		this.driver = driver;
	}
	@FindBy(xpath=Configuration.twit_BrowsePicLink)
	public WebElement twit_BrowsePicLink;
	
	@FindBy(xpath=Configuration.twit_EditMediaApplyBtn)
	public WebElement twit_EditMediaApplyBtn;
	
	
	public void changePic() throws IOException, InterruptedException
	{
		twit_BrowsePicLink.click();
		driver.switchTo().activeElement().sendKeys(Keys.ESCAPE);
		//twit_BrowsePicLink.sendKeys(Keys.ESCAPE);
		//Actions action = new Actions(driver);
		//action.sendKeys(Keys.ESCAPE).build().perform();
		//Thread.sleep(5000);
		Runtime.getRuntime().exec(System.getProperty("user.dir").toString()+"/AutoITScripts/POMAutoITScripts.exe");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		twit_EditMediaApplyBtn.click();
	}
	public void changeBio()
	{
		
	}
	public void changeTitle()
	{
		
	}
}
