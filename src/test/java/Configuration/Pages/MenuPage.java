package Configuration.Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MenuPage extends BasePage {

	public MenuPage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub

		}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Home']")
	private MobileElement home;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Movies']")
	private static MobileElement movies;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='My Downloads']")
	private MobileElement mydownloads;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Call Support']")
	private MobileElement callsupport;
	
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
