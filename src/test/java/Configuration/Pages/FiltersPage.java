package Configuration.Pages;

import java.util.List;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class FiltersPage extends BasePage {


	public FiltersPage(AppiumDriver driver) {
	super(driver);
	// TODO Auto-generated constructor stub

	}
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Filters']")
	private static MobileElement filters;
	
	@AndroidFindBy(id = "com.fropcorn.www:id/genre_list")
	private static MobileElement genres;
	
	@AndroidFindBy(id = "com.fropcorn.www:id/language_list")
	private static MobileElement language;

	
	
	public static void filters()
	{
		filters.click();
	}
	
	public static List genrelist()
	{
		List<MobileElement> genreList = genres.findElementsByClassName("android.widget.TextView");
		return genreList;
		
	}
	
	public static List languagelist()
	{
		List<MobileElement> languageList = language.findElementsByClassName("android.widget.TextView");
		return languageList; 
	}
	
	}

