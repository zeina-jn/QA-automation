package com.selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;







public class Facebook_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/Apple 1/Documents/chromedriver_mac64/chromedriver");
        WebDriver driver =   new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Create New Account")));
        driver.findElement(By.linkText("Create New Account")).click();
        //select day
        Select sel = new Select(driver.findElement(By.id("day")));
        sel.selectByIndex(6);
        //select month
        Select sel1 = new Select(driver.findElement(By.id("month")));
        sel1.selectByValue("3");
        //select year
        Select sel2 = new Select(driver.findElement(By.id("year")));
        sel2.selectByVisibleText("2000");
        
        

        
      
	}

}
