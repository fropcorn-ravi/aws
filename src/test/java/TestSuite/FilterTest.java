package TestSuite;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Configuration.Screenshot;
import Configuration.TestBase;
import Configuration.Pages.BasePage;
import Configuration.Pages.FiltersPage;
import Configuration.Pages.MenuPage;
import Configuration.Pages.MoviesPage;
@Listeners(Screenshot.class)
public class FilterTest extends TestBase {
	
	private FiltersPage filterTest;

	@BeforeTest
	@Override
	public void setUpPage()
	{
		filterTest = new FiltersPage(driver);
    }

	@Test(dependsOnMethods = "Go")
	public static void filtercheck() throws InterruptedException
	{
		Thread.sleep(5000);
		BasePage.menubutton();
		MenuPage.moviesbutton();
		FiltersPage.filters();
		FiltersPage.genrelist();
		FiltersPage.languagelist();
		for(int i=0;i<FiltersPage.genrelist().size();i++)
		{
			{
				for(int j=0;j<FiltersPage.languagelist().size();j++){
					((WebElement) FiltersPage.genrelist().get(i)).click();
					((WebElement) FiltersPage.languagelist().get(j)).click();
					Thread.sleep(2500);
					MoviesPage.popularbutton();
					Thread.sleep(2500);
					FiltersPage.filters();
					((WebElement) FiltersPage.genrelist().get(i)).click();
					((WebElement) FiltersPage.languagelist().get(j)).click();
				}
		}
}
}
}

