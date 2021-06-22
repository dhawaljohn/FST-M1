package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;


public class PorjectActivity3 {
    WebDriver driver;
    
    @BeforeMethod
	
    public void beforeMethod() {
	
             driver = new FirefoxDriver();
	
        driver.get("http://alchemy.hguy.co/crm");
	
    }
    @Test
    public void footerprint(){
    	String footer = driver.findElement(By.id("admin_options")).getText();
            System.out.println(footer);
    }

 @AfterMethod
	
    public void afterMethod() {
        driver.quit();
 }
}