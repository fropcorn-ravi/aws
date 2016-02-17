package TestSuite;
import Configuration.Pages.*;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Configuration.Screenshot;
import Configuration.TestBase;
@Listeners(Screenshot.class)
public class RegistrationTest extends TestBase {

	private static RegistrationPage registrationpage;
	
	@BeforeTest
	@Override
	public void setUpPage() 
	{
		registrationpage = new RegistrationPage(driver);
    }
	
	@Test(enabled = false)
	public static void Download() throws InterruptedException,NoSuchElementException
	{
		System.out.println("TestCase: Registration");
		registrationpage.TestButton();
		Thread.sleep(5000);
		Assert.assertEquals(registrationpage.getButtonStatus(), "GO");
//		registrationpage.go();
//		BasePage.menu.click();
//		Thread.sleep(2500);
////		BasePage.movies.click();
//		MenuPage.moviesbutton();
//		Thread.sleep(2500);
//		MoviesPage.firstmoviebutton();
////		BasePage.firstmovie.click();
//		Thread.sleep(5000);
//		BasePage.download.click();
//		WebDriverWait wait = new WebDriverWait(driver, 50000);
//        wait.until(ExpectedConditions.visibilityOf(BasePage.play));
//        BasePage.play.click();
//        Thread.sleep(30000);
//        Screenshot shot = new Screenshot();
//        shot.takeScreenshot("player");
	}
	
	@Test
	
	public static void Go() throws InterruptedException,NoSuchElementException
	{
		registrationpage.go();
	}

	@Test(enabled = false )
	public static void moviedownload() throws InterruptedException,NoSuchElementException
	{
		
			BasePage.menu.click();
			Thread.sleep(5000);
			MenuPage.moviesbutton();
			Thread.sleep(5000);
			MoviesPage.firstmoviebutton();
			Thread.sleep(2500);
			BasePage.download.click();
			WebDriverWait wait = new WebDriverWait(driver, 50000);
	        wait.until(ExpectedConditions.visibilityOf(BasePage.play));
	        BasePage.play.click();
	        Thread.sleep(30000);
	        Screenshot shot = new Screenshot();
	        shot.takeScreenshot("player");
		
		}
}



