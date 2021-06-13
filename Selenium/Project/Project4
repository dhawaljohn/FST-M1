package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProjectActivity4 {
	
    WebDriver driver;
		
    @BeforeClass
	
    public void beforeClass() {
	
        driver = new FirefoxDriver();
	        driver.get("https://alchemy.hguy.co/crm");
	
    }
		
    @Test
	
    public void loginconfirm() {
	
        WebElement username = driver.findElement(By.id("user_name"));	
        WebElement password = driver.findElement(By.id("username_password"));
		
        username.sendKeys("admin");
	    password.sendKeys("pa$$w0rd");
	
        driver.findElement(By.id("bigbutton")).click();
        
        String confirm = driver.findElement(By.id("tab0")).getText();
    	Assert.assertEquals("SUITECRM DASHBOARD", confirm);
	    }
	
 
    @AfterClass
	
    public void afterClass() {
        driver.close();
	
    }
	 }

