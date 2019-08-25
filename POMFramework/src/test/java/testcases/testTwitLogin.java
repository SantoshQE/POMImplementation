package testcases;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import config.Configuration;
import junit.framework.Assert;
import pages.twitEditProfilePage;
import pages.twitLandingPage;
import pages.twitLoginPage;
import pages.twitMyProfilePage;

public class testTwitLogin 
{
	//static WebDriver driver ;
	//static WebDriver driver = new ChromeDriver();
	//@Test //
	//public static Properties config = new Properties();
	
	public static void main(String args[]) throws IOException, InterruptedException
	{
		/*FileInputStream fis = new FileInputStream(System.getProperty("user.dir").toString()+"/src/test/java/config/OR.properties");
		config.load(fis);*/
		
		String projectPath  = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/Resources/SeleniumDrivers/Chromedriver/chromedriver.exe");
		//driver = new WebDriver;
		WebDriver driver = new ChromeDriver();
		//driver.get("https://twitter.com/login");
		//driver.get(config.getProperty("testsite"));
		driver.get(Configuration.testsite);
		driver.manage().window().maximize();
		twitLoginPage tLoginPage = PageFactory.initElements(driver, twitLoginPage.class);
		//tLoginPage.dologin("9967887510", "Tcs@1983");
		twitLandingPage tLandingPg = tLoginPage.dologin("9967887510", "Tcs@1983");
		twitMyProfilePage tMyProfilePg = tLandingPg.goToProfileLink();
		twitEditProfilePage tEditProfilePg = tMyProfilePg.editProfile();
		tEditProfilePg.changePic();
		//Assert.assertTrue(true);
		//driver.close();
	

	}

}
