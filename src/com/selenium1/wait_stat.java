package com.selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wait_stat {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
            String error = "Invalid Credentials";
			System.setProperty("webdriver.chrome.driver","/Users/Apple 1/Documents/chromedriver_mac64/chromedriver");
	         WebDriver driver =   new ChromeDriver();
	         driver.navigate().to("https://admin-staging.alkhattaba.app/");
	       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	       
	       driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("zei@et3arraf.com");
	       driver.findElement(By.xpath("//input[@type='password']")).sendKeys("@et3arraf");
	      Thread.sleep(4000);
	       driver.findElement(By.xpath("//button[@class='clickable']")).click();

	    
	       
	       Boolean b =  driver.findElement(By.xpath("//div[@style='color: rgb(217, 83, 79); text-align: center; padding: 12px; font-weight: bold;']")).isDisplayed();
	  	   String invalid_credential2 =  driver.findElement(By.xpath("//div[@style='color: rgb(217, 83, 79); text-align: center; padding: 12px; font-weight: bold;']")).getText();


	     
	       if (invalid_credential2.equals(error)) {
	    	   
              System.out.println("failed login :"+invalid_credential2);
	    	   
	       }else {
	              System.out.println(" login");

	    	   
	       }
	       
	       
	       Thread.sleep(4000);
	       driver.quit();
	       

	}

}
