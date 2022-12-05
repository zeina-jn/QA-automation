package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","/Users/Apple 1/Documents/chromedriver_mac64/chromedriver");
        WebDriver driver =   new ChromeDriver();
       // driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
        driver.navigate().to("https://online.actitime.com/abcd2/login.do");
       // driver.navigate().back();
       // driver.navigate().forward();
        driver.manage().window().maximize();
      System.out.println("title :"+driver.getTitle());
/**
      driver.findElement(By.xpath("//input[@name='username']")).sendKeys("zeinab.jnaydi.12@gmail.com");
      driver.findElement(By.xpath("//input[@type='password']")).sendKeys("YUNM9hh@");
      //driver.findElement(By.xpath("//a[@id='loginButton']")).click(); 
      driver.findElement(By.xpath("//a[@href='javascript:void(0)']")).click();
      
      */
      
      driver.findElement(By.name("username")).sendKeys("zeinab.jnaydi.12@gmail.com");
      driver.findElement(By.name("pwd")).sendKeys("YUNM9hh@");
      driver.findElement(By.id("loginButton")).click();
       
      
      
     //Thread.sleep(9000); 
     // driver.close();
     // driver.quit();
	}

}
