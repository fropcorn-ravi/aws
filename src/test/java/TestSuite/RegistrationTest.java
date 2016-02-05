package TestSuite;
import Configuration.Pages.*;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Configuration.Screenshot;
import Configuration.TestBase;
@Listeners(Screenshot.class)
public class RegistrationTest extends TestBase {

	private static RegistrationPage registrationTest;
	
	@BeforeTest
	@Override
	public void setUpPage() {
		registrationTest = new RegistrationPage(driver);
    }
	
	@Test(priority = 1)
	public static void Registration() throws InterruptedException
	{
		System.out.println("TestCase: Registration");
		registrationTest.TestGoButton();
		Thread.sleep(10000);
		System.out.println("wake go");
		Assert.assertEquals(registrationTest.getButtonStatus(), "GO");
		System.out.println("Registration Sucessfull");
		
}
	
	@Test(priority = 2)
	public static void Go() throws InterruptedException
	{
		RegistrationPage.go();
	}
	
}	
	


	
	

