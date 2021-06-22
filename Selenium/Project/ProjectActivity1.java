package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProjectActivity1 {
    WebDriver driver;
    
    @BeforeMethod
	
    public void beforeMethod() {
	
             driver = new FirefoxDriver();
	
        driver.get("http://alchemy.hguy.co/crm");
	
    }
    @Test
	
    public void titleprint() {
	        String title = driver.getTitle();
		
        System.out.println("Page title is: " + title);
	
        Assert.assertEquals("SuiteCRM", title);
	       
    }
	
 	
    @AfterMethod
	
    public void afterMethod() {
        driver.quit();
	
    }

}
