package Configuration.Pages;

import org.openqa.selenium.NoSuchElementException;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class RegistrationPage extends BasePage {
	
	
		public RegistrationPage(AndroidDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

		@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'com.fropcorn.www:id/mobile')]")
		public MobileElement mobile;
		
		@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'com.fropcorn.www:id/email')]")
		public MobileElement email;
		
		@AndroidFindBy(xpath = "//android.widget.Button[@text = 'Get Started']")
		public MobileElement submit;
		
		@AndroidFindBy(className = "android.widget.Button")
		public static MobileElement status;
		
		public String getButtonStatus(){
	        return status.getText();
	    }
		
		public void TestButton() throws InterruptedException,NoSuchElementException
		{
			Thread.sleep(10000);
			driver.hideKeyboard();
			Thread.sleep(6000);
			mobile.sendKeys("9550205474");
			Thread.sleep(8000);
			email.sendKeys("ravi@ravi.com");
			Thread.sleep(8000);
			try
			{
			if
			(submit.isDisplayed())
			{
			submit.click();
			}
			}
			catch (Exception e)
			{
			driver.hideKeyboard();
			Thread.sleep(3000);
			submit.click();
			}
			Thread.sleep(5000);
			}
		
		
		public void go() throws InterruptedException,NoSuchElementException
		{
			Thread.sleep(5000);
			try
			{
			if (BasePage.Allow.isDisplayed())
			{
				BasePage.Allow.click();
				Thread.sleep(2500);
				status.click();
			}
			}
			catch (Exception e)
			{
			status.click();
			Thread.sleep(5000);
			}
		}
}

		

	

