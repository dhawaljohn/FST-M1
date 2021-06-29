package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4b {
	    public static void main(String[] args) {
	        WebDriver driver = new FirefoxDriver();
	        driver.get("https://www.training-support.net/selenium/simple-form");
	        String pageTitle = driver.getTitle();
	        System.out.println(pageTitle);
	        WebElement firstName = driver.findElement(By.xpath("//input[@id = 'firstName']"));
	        WebElement lastName = driver.findElement(By.xpath("//input[@id = 'lastName']"));
	        firstName.sendKeys("James");
	        lastName.sendKeys("Bond");
	        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("James.Bond.com");
	        driver.findElement(By.xpath("//input[@id = 'number']")).sendKeys("999999999");
	        driver.findElement(By.xpath("//textarea")).sendKeys("Hello James ");
	        driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
	        driver.close();
	    }
	}
