package com.selenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class Admin {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/Apple 1/Documents/chromedriver_mac64/chromedriver");
         WebDriver driver =   new ChromeDriver();
         driver.navigate().to("https://admin-staging.alkhattaba.app/");
       System.out.println("title :"+driver.getTitle());

       
      // driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("zeina@et3arraf.com");
    //   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("@et3arraf");

    //  driver.findElement(By.xpath("//button[@class='clickable']")).click();
          // driver.close();
    
     WebDriverWait webdwait = new WebDriverWait(driver, Duration.ofSeconds(10));

     webdwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Username']"))).sendKeys("zeina@et3arraf.com");

     webdwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']"))).sendKeys("@et3arraf");

     webdwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='clickable']"))).click();
     
    // driver.quit();
     
     





         
	}

}
