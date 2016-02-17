package Configuration.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public abstract class BasePage {

	  public final AndroidDriver<MobileElement> driver;
	  
	  public BasePage(AndroidDriver<MobileElement> driver){
	        this.driver = driver;
	        PageFactory.initElements(new AppiumFieldDecorator(driver, 30, TimeUnit.SECONDS), this);
	    }
	  
	  
	@AndroidFindBy(className = "android.widget.ImageButton")
	public static MobileElement menu;
	  
	@AndroidFindBy(id = "android:id/search_button")
	public static MobileElement searchbutton;
	
	@AndroidFindBy(id = "android:id/search_src_text")
	public static MobileElement searchtext;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text = 'Download' and @clickable='true']")
	public static MobileElement download;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text = 'Play' and @clickable='true']")
	public static MobileElement play;
	
	@AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
	public static MobileElement Allow;
	
	@AndroidFindBy(id = "com.android.packageinstaller:id/permission_deny_button")
	public static MobileElement Deny;
	
//	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@index='1' and @clickable='true']")
//	public static MobileElement movies;
//	
//	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@index='0' and @clickable= 'true']")
//	public static MobileElement firstmovie;
}


