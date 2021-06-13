package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class ProjectActivity2 {
    WebDriver driver;
    
    @BeforeMethod
	
    public void beforeMethod() {
	
             driver = new FirefoxDriver();
	
        driver.get("http://alchemy.hguy.co/crm");
	
    }
    @Test
    public void sourceprint(){
    List<WebElement>links=driver.findElements(By.tagName("img"));
    for(WebElement ele:links){
        System.out.println(ele.getAttribute("src"));
    }
}
 @AfterMethod
	
    public void afterMethod() {
        driver.quit();
 }
}
