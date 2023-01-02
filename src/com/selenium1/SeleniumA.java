package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumA {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/Apple 1/Documents/chromedriver_mac64/chromedriver");
         WebDriver driver =   new ChromeDriver();
        // driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
         driver.navigate().to("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
        // driver.navigate().back();
        // driver.navigate().forward();
       System.out.println("title :"+driver.getTitle());
       driver.findElement(By.xpath("//button[@type='submit']")).click();
       System.out.println("link :"+driver.getCurrentUrl());
       System.out.println("html source :"+driver.getPageSource());
      // driver.close();
       driver.quit();


         
	}

}
