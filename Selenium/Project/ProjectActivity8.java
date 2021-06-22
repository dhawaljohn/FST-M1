package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProjectActivity8 {
	
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
	    Thread.sleep(1000);
	
        driver.findElement(By.id("bigbutton")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.id("grouptab_0")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.id("moduleTab_9_Accounts")).click();
        Thread.sleep(2000);
        
        List<WebElement>  names= driver.findElements(By.xpath("//*[@id=\"MassUpdate\"]/div[3]/table/tbody/tr/td[3]"));
        System.out.println(names.size());
        
        int count =0;              // counter to fetch only 5 names as per requirement
         for(int i=0;i<names.size()-2;i+=2) {                       //check to avoid error for upperbound less than counter i
             if(count<5) {
                 System.out.println(i+ " element value :"+ names.get(i).getText());
             count++;}}
         
    @AfterClass
	
    public void afterClass() {
        driver.close();
}
}

