package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProjectActivity7 {
	
    WebDriver driver;
		
    @BeforeClass
	
    public void beforeClass() {
	
        driver = new FirefoxDriver();
	        driver.get("https://alchemy.hguy.co/crm");
	
    }
		
    @Test
	
    public void Activityconfirm() throws InterruptedException {
	
        WebElement username = driver.findElement(By.id("user_name"));	
        WebElement password = driver.findElement(By.id("username_password"));
		
        username.sendKeys("admin");
	    password.sendKeys("pa$$w0rd");
	
        driver.findElement(By.id("bigbutton")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.id("grouptab_0")).click();
        Thread.sleep(2000);
                
        driver.findElement(By.id("moduleTab_9_Leads")).click();
        Thread.sleep(2000);
               
        driver.findElement(By.id("adspan_20b3f9c1-6c63-8d08-7bfb-5f5a33457752")).click();
        Thread.sleep(2000);
        
        String number = driver.findElement(By.xpath("(//span[@class='phone'])[1]")).getText();
        System.out.println(number);
        Thread.sleep(2000);
    }   
    @AfterClass
    	
        public void afterClass() {
            driver.close();
}
}