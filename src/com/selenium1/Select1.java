package com.selenium1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Select1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/Apple 1/Documents/chromedriver_mac64/chromedriver");
        WebDriver driver =   new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Create New Account")));
        driver.findElement(By.linkText("Create New Account")).click();
        WebElement wb = driver.findElement(By.name("birthday_year"));    
        
        //create a list
        List ls = new ArrayList<>();
        ls.add("2022");
        ls.add("2021");
        ls.add("2020");
        		
        
        //select year
        Select sel = new Select(wb);
        List<WebElement> options = sel.getOptions();
        String Expectedvalue = "2000";
        for (WebElement wb1:options) {
        	String Actualvalue = wb1.getText();
        	
//        	
        	if (Actualvalue.equals(Expectedvalue)) {
        		sel.selectByVisibleText(Actualvalue);
        	}
        }
	}

}
