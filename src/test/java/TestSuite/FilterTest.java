package TestSuite;

import io.appium.java_client.MobileElement;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.Reporter;
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
	
	static Dimension size;
	
	@BeforeTest
	@Override
	public void setUpPage()
	{
		new FiltersPage(driver);
		new MenuPage(driver);
		new MoviesPage(driver);
    }

	
	public static void swipeVertical() throws InterruptedException {

		//Get the size of screen.
		size = driver.manage().window().getSize();
		System.out.println(size);
		
		//Find swipe start and end point screen width and height
		
		// Find start y point which is bottom side of screen
		int starty = (int) (size.height * 0.63);
		
		//Find end y point which is at top side of screen
		int endy = (int) (size.height * 0.18);
		
		//Find horizontal point where you wants to swipe. It is in middle of screen width.
		int startx = size.width / 2;
		System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);
		
		//Swipe from Bottom to Top.
		driver.swipe(startx, starty, startx, endy, 3000);
		Thread.sleep(2000);
		
		//Swipe from Top to Bottom.
		driver.swipe(startx, endy, startx, starty, 3000);
		Thread.sleep(2000);
		
		}
	static Set<MobileElement> imagesSet = new HashSet<MobileElement>();
	static Set<String> textSet = new HashSet<String>();
	static int filterCount;
	static int arr[] = {15,15,2,2,4,4,10,10,1,1,1,1,1,1};
	static int count =0;
	
	private static int scrollAndCount() throws InterruptedException {
		List<MobileElement> catalogImages = MoviesPage.catalogimages;
		List<MobileElement> catalogText = MoviesPage.catalogtext;
		int imagesdisplayed = MoviesPage.catalogimages.size();
		int textdisplayed = MoviesPage.catalogtext.size();
		for (MobileElement mobileElement : catalogImages) {
			System.out.println(mobileElement);
			//imagesSet.add(mobileElement);
		}
		for (MobileElement mobileElement : catalogText) {
			textSet.add(mobileElement.getText());
			System.out.println(mobileElement.getText());
		}
		//Assert.assertFalse(contentDisplayed.size()==0);
		System.out.println("images: " + imagesdisplayed + "and " + "text: " + textdisplayed );
		System.out.println("total movies: and text: " + textSet.size() );
		String previousText =catalogText.get(0).getText();
		System.out.println(previousText);
		swipeVertical();
		Thread.sleep(2500);
		if(previousText.equals(MoviesPage.catalogtext.get(0).getText())){
			
			for (MobileElement mobileElement : MoviesPage.catalogtext) {
				textSet.add(mobileElement.getText());
				System.out.println(mobileElement.getText());
			}
			System.out.println("Stopped At : "+ MoviesPage.catalogtext.get(0).getText());
			filterCount = textSet.size();
			System.out.println("total number of movies in this filter are "+ filterCount);
		}
		else {
			scrollAndCount();
		}
		return filterCount;
	}
	
	@Test(priority = 0)
	public static void filtercheck() throws InterruptedException,NoSuchElementException
	{
		Thread.sleep(5000);
		BasePage.menu.click();
		Thread.sleep(2500);
		MenuPage.moviesbutton();
		Thread.sleep(2500);
		FiltersPage.filters();
		Thread.sleep(2500);
		FiltersPage.genrelist();
		Thread.sleep(2500);
		FiltersPage.languagelist();
		Thread.sleep(2500);
		for(int i=0;i<FiltersPage.genrelist().size();i++)
		{
			{
				for(int j=0;j<FiltersPage.languagelist().size();j++){
					
					((WebElement) FiltersPage.genrelist().get(i)).click();
					((WebElement) FiltersPage.languagelist().get(j)).click();
					Thread.sleep(2500);
					MoviesPage.popularbutton();
					//List<MobileElement> elements = driver.findElements(By.xpath("//UIAWindow[1]/*");
					//System.out.println(MoviesPage.grid.)
					textSet.clear();
					Assert.assertEquals(scrollAndCount(),arr[count]);
					Thread.sleep(2500);
					FiltersPage.filters();
					((WebElement) FiltersPage.genrelist().get(i)).click();
					((WebElement) FiltersPage.languagelist().get(j)).click();
					count++;
				}
		}
}
}
}


