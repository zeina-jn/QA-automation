package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Users/Apple 1/Documents/chromedriver_mac64/chromedriver");
        WebDriver driver =   new ChromeDriver();
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
        driver.manage().window().maximize();
        WebElement wb = driver.findElement(By.id("Email"));
        wb.clear();
       Thread.sleep(3000);
       wb.sendKeys("admin@yourstore.com");
        String value = driver.findElement(By.xpath("//div[@class='title']/Strong")).getText();
	}

}
