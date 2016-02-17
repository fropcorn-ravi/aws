package Configuration.Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MenuPage extends BasePage {

	public MenuPage(AndroidDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub

		}
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@index='0'and @clickable='true']")
	public MobileElement home;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@index='1' and @clickable='true']")
	public static MobileElement movies;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@index='2' and @clickable= 'true']")
	public MobileElement mydownloads;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Call Support']")
	public MobileElement callsupport;
	
	public void homebutton()
	{
		home.click();
	}
	
	public static void moviesbutton()
	{
		movies.click();
	}
	
	public void mydownloadsbutton()
	{
		mydownloads.click();
	}
	
	public void callsupportbutton()
	{
		callsupport.click();
	}
}
