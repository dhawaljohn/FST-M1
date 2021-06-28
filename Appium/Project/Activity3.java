package AppiumProject;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity3 
{
	WebDriverWait wait;
	AppiumDriver<MobileElement> driver = null;

	@BeforeTest
	public void setup() throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Pixel4");
		caps.setCapability("platformName", "Android");
		caps.setCapability("appPackage", "com.google.android.keep");
		caps.setCapability("appActivity", ".activities.BrowseActivity");
		caps.setCapability("noReset", true);

		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		wait = new WebDriverWait(driver, 10);
	}

	@Test
	public void GoogleKeep() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement task = driver.findElementById("com.google.android.keep:id/new_note_button");
		task.click();
		
		MobileElement title = driver.findElementById("com.google.android.keep:id/editable_title");
		title.sendKeys("Appium Activity3");
		
		MobileElement notes = driver.findElementById("com.google.android.keep:id/edit_note_text");
		notes.sendKeys("Welcome to Goa Singham");
		
		driver.findElementById("com.google.android.keep:id/menu_reminder").click();
		driver.findElementById("com.google.android.keep:id/menu_text").click();
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]").click();
		MobileElement notesverify =driver.findElementByXPath("//androidx.cardview.widget.CardView[@content-desc=\"Appium Activity3. Welcome to Goa Singham. \"]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView[2]");
		String n1=notesverify.getText();
		Assert.assertEquals(n1,"Welcome to Goa Singham");
		
	}
	
	@AfterTest
    public void afterClass() {
        driver.quit();
    }

}