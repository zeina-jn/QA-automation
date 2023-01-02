package com.selenium1;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.util.Set;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multipletab {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/Apple 1/Documents/chromedriver_mac64/chromedriver");
        WebDriver driver =   new ChromeDriver();
        driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().to("https://www.naukrigulf.com/career-tips/category/expert-speak/");
        Actions act= new Actions(driver);
        //act.moveToElement(driver.findElement(By.xpath("//a[@href='/browse-jobs-in-gulf']"))).build().perform();
        act.moveToElement(driver.findElement(By.xpath("//li[@class='tab_services']/a\n"))).build().perform();
         Thread.sleep(1000);
        driver.findElement(By.linkText("Text Resume Writing")).click();
        
        //span[contains(text(),'....')]/preceding-sibling
        Set<String> windowid = driver.getWindowHandles();
        Iterator<String> itr = windowid.iterator();
        String parentid = itr.next();
        String childtid = itr.next();
        driver.switchTo().window(childtid);
        driver.findElement(By.xpath("//span[contains(text(),'(Exp: 0 to 3 Yrs)')]")).click();
        driver.close();
        driver.switchTo().window(parentid);
        driver.findElement(By.xpath("//a[@href='https://www.naukrigulf.com/career-tips/living-in-the-present-be-in-the-moment-is-something-i-abide-by-no-matter-what-i-do-dr-amit-singh-head-corporate-hr-aster-dm-healthcare/']")).click();

        


        
        
        
        
        
        


	}

}
