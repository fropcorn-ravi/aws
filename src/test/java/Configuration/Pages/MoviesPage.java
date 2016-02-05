package Configuration.Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MoviesPage {

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Popular']")
	private static MobileElement popular;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='New']")
	private static MobileElement New;
	
	public static void popularbutton()
	{
		popular.click();
	}
	
	public static void newbutton()
	{
		New.click();
	}
}
