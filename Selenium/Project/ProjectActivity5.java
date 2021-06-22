package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProjectActivity5 {
	
    WebDriver driver;
		
    @BeforeClass
	
    public void beforeClass() {
	
        driver = new FirefoxDriver();
	        driver.get("https://alchemy.hguy.co/crm");
	
    }
		
    @Test
	
    	public void login() {
	
        WebElement username = driver.findElement(By.id("user_name"));	
        WebElement password = driver.findElement(By.id("username_password"));
		
        username.sendKeys("admin");
	    password.sendKeys("pa$$w0rd");
	    
	    driver.findElement(By.id("bigbutton")).click();
    }
@Test
	
    public void colorfind() {
	String screencolor = driver.findElement(By.className("container-fluid")).getCssValue("color");
    System.out.println(screencolor);
}
    
	  @AfterClass
		
	    public void afterClass() {
	        driver.close();
		
}
}