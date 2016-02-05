package Configuration;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import java.io.File;
import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public abstract class TestBase 
{
public AppiumDriverLocalService server;
public static AppiumDriver driver;


	@BeforeTest
	public abstract void setUpPage();

	 @BeforeSuite
	    public void setUpAppium() throws MalformedURLException, InterruptedException{
		 	server = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().usingDriverExecutable(new File("C://Program Files//nodejs//node.exe")).withAppiumJS(new File("C://Program Files//Appium//node_modules//appium//bin//appium.js")).withIPAddress("127.0.0.1").usingAnyFreePort());
		 	server.start();
		 	Thread.sleep(2000);
		 	File appDir = new File("C:\\Users\\FC\\workspace\\fropcorn\\src\\test\\java");
			File app = new File(appDir, "fropcorn.apk");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.1");
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "03829155439cb1e8");
			capabilities.setCapability(MobileCapabilityType.APP_PACKAGE, "com.fropcorn.www");
			capabilities.setCapability(MobileCapabilityType.APP_WAIT_PACKAGE, "com.fropcorn.www");
			//capabilities.setCapability(MobileCapabilityType.APP_ACTIVITY, "md5cc615c6ee98ab00d5e84ed40aedb6796.SplashScreen");
			//capabilities.setCapability(MobileCapabilityType.APP_WAIT_ACTIVITY, "md512edb7b4c20f0852a0829c1270f9f40a.RegistrationActivity");
			capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
			
			driver = new AndroidDriver<WebElement>(server, capabilities);
//		 final String URL_STRING = "http://127.0.0.1:4723/wd/hub";
//
//	        URL url = new URL(URL_STRING);
//
//	        //Use a empty DesiredCapabilities object
//	        driver = new AndroidDriver<MobileElement>(url, new DesiredCapabilities());
//
//	        //Use a higher value if your mobile elements take time to show up
//	        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    }
	
	 @AfterSuite
	    public void tearDownAppium(){
		driver.quit();
	    }

	
	 
	
}
