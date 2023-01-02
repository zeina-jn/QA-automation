package com.selenium1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Admin2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/Apple 1/Documents/chromedriver_mac64/chromedriver");
        WebDriver driver =   new ChromeDriver();
        driver.navigate().to("https://admin-staging.alkhattaba.app/");
        System.out.println("title :"+driver.getTitle());

      
     // driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("zeina@et3arraf.com");
   //   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("@et3arraf");
   //   driver.findElement(By.xpath("//button[@class='clickable']")).click();
  
    driver.manage().window().maximize() ;
    WebDriverWait webdwait = new WebDriverWait(driver, Duration.ofSeconds(30));
    
    
    //successfull login

    webdwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Username']"))).sendKeys("zeina@et3arraf.com");
    webdwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']"))).sendKeys("@et3arraf");
    Thread.sleep(3000);

    webdwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='clickable']"))).click();
    Thread.sleep(3000);

    // go to users advanced
    webdwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='menu-item']"))).click();

  //  webdwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/users/advanced']"))).click();
    
    webdwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/approveReject']"))).click();

    //create a list
    List ls = new ArrayList<>();
    ls.add("10");
    ls.add("50");
    ls.add("100");
    ls.add("250");
		System.out.println("list 1 "+ls);

    
    //picker input-placeholder
    //select year
    WebElement wb = driver.findElement(By.xpath("//select[@class='picker input-placeholder']"));    

    Select sel = new Select(wb);
    List<WebElement> options = sel.getOptions();
 	List lst = new ArrayList<>();
       

	 for (WebElement wb1:options) {
     	String Actualvalue = wb1.getText();
 	//	System.out.println("list 2 "+Actualvalue);
        lst.add(wb1.getText());	
	 }
		System.out.println("list 2 "+lst);

//	 
//	 
     if (ls.equals(lst)) {
    	 System.out.println("list true");
     }else {
    	 System.out.println("list false");

     }
	}

}
