package Configuration.Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class RegistrationPage extends BasePage {
	
	
		public RegistrationPage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

		@AndroidFindBy(id = "com.fropcorn.www:id/mobile")
		private MobileElement mobile;
		
		@AndroidFindBy(id = "com.fropcorn.www:id/email")
		private MobileElement email;
		
		@AndroidFindBy(id = "com.fropcorn.www:id/submit")
		private MobileElement submit;
		
		@AndroidFindBy(xpath = "//android.widget.Button")
		private static MobileElement status;
		
		public String getButtonStatus(){
	        return status.getText();
	    }
		
		public void TestGoButton() throws InterruptedException
		{
			Thread.sleep(5000);
			driver.hideKeyboard();
			mobile.sendKeys("9550205474");
			email.sendKeys("ravi@ravi.com");
			System.out.println("Sleeping test go");
			Thread.sleep(5000);
			System.out.println("wake test go");
			submit.click();
			}
		
		public static void go() throws InterruptedException
		{
			status.click();
			Thread.sleep(10000);
		}
		
		}

	

