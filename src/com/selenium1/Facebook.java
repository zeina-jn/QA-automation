package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		String default_value="Email address or phone number";
		String wrong_email = "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
		System.setProperty("webdriver.chrome.driver","/Users/Apple 1/Documents/chromedriver_mac64/chromedriver");
        WebDriver driver =   new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
        System.out.println("title :"+driver.getTitle());
       
        /**
        String value = driver.findElement(By.id("email")).getAttribute("aria-label");
        
        if(default_value.equals(value)) {
        	System.out.println("pass :"+value);
        }else {
        	System.out.println("fail");

        }*/
        
        
   // driver.findElement(By.id("email")).sendKeys("zeina@gmail.com");

       driver.findElement(By.name("login")).click();
       Thread.sleep(3000);
   //   driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _9kpt _4jy5 _4jy1 selected _51sy']")).click();
   //   Thread.sleep(3000);
     // driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _9kpt _4jy5 _4jy1 selected _51sy']")).click();
   //   Thread.sleep(3000);

   	String error_value = driver.findElement(By.xpath("//div[@class='_9ay7']")).getText();
   	
   	boolean b = wrong_email.equals(error_value);
if (b){
	System.out.println("wrong email address");
	System.out.println(b);

}else {
	System.out.println( "correct email");
}

driver.quit();
       

	}

}
