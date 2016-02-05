package Configuration.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public abstract class BasePage {

	  protected final AppiumDriver driver;
	  
	  protected BasePage(AppiumDriver driver){
	        this.driver = driver;
	        PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), this);
	    }
	  
	  
	@AndroidFindBy(className = "android.widget.ImageButton")
	public static MobileElement menu;
	  
	@AndroidFindBy(id = "android:id/search_button")
	public static MobileElement searchbutton;
	
	@AndroidFindBy(id = "android:id/search_src_text")
	public static MobileElement searchtext;
	
	public static void menubutton()
	{
		menu.click();
	}
}


