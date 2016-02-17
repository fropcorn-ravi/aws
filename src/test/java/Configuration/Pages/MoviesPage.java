package Configuration.Pages;

import java.util.List;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MoviesPage extends BasePage {

	public MoviesPage(AndroidDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Popular']")
	public static MobileElement popular;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='New']")
	public static MobileElement New;
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@index='0' and @clickable= 'true']")
	public static MobileElement firstmovie;
	
	@AndroidFindBy(xpath = "//android.widget.GridView[contains(@resource-id,'com.fropcorn.www:id/gridview')]")
	public static MobileElement grid;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'com.fropcorn.www:id/picture')]")
	public static List<MobileElement> catalogimages;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'com.fropcorn.www:id/title')]")
	public static List<MobileElement> catalogtext;
	
	@AndroidFindBy(id = "com.fropcorn.www:id/catalogItemLinearLayout")
	public static MobileElement list;
	
//	public static List<MobileElement> cataloglist()
//	{
//		List<MobileElement> cataloglist = catalogimages;
//		return cataloglist;
//		
//	}
	
	
	
	
	public static void popularbutton()
	{
		popular.click();
	}
	
	public static void newbutton()
	{
		New.click();
	}
	
	public static void firstmoviebutton()
	{
		firstmovie.click();
	}
	
	
}


