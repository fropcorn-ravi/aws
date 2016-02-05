package Configuration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import java.io.File;

public class Screenshot extends TestListenerAdapter {

	
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		takeScreenshot(result.getName());
	}
	
	
	public boolean takeScreenshot(final String name) {
	       String screenshotDirectory = System.getProperty("appium.screenshots.dir", System.getProperty("java.io.tmpdir", ""));
	       File screenshot = ((TakesScreenshot) TestBase.driver).getScreenshotAs(OutputType.FILE);
	       return screenshot.renameTo(new File(screenshotDirectory, String.format("%s.png", name)));
	   }
}
