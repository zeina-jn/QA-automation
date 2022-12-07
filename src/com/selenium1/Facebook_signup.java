package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_signup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/Apple 1/Documents/chromedriver_mac64/chromedriver");
        WebDriver driver =   new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.facebook.com/");
        
        //sign up button
        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
         Thread.sleep(3000);
      boolean signup = driver.findElement(By.xpath("//div[@class='_n3']")).isDisplayed();

     

      if (signup) {
    	  
    	  //firstname
          driver.findElement(By.name("firstname")).sendKeys("zeina");
          
          //lastname

          driver.findElement(By.name("lastname")).sendKeys("jnaydi");
          
          
          //email
          
          driver.findElement(By.name("reg_email__")).sendKeys("zeina@gmail.com");
          
          //reg_email_confirmation__
          driver.findElement(By.name("reg_email_confirmation__")).sendKeys("zeina@gmail.com");


           //pwd
          
          driver.findElement(By.name("reg_passwd__")).sendKeys("Zeina@12356");
          
          //date of birth
          Select  birthdaday = new Select (driver.findElement(By.name("birthday_day")));
          birthdaday.selectByVisibleText("5");
          
          //birthday_month
          Select  birthdmonth = new Select (driver.findElement(By.name("birthday_month")));
          birthdmonth.selectByVisibleText("May");
//          
          //birthday_year
          Select  birthdyear = new Select (driver.findElement(By.name("birthday_year")));
          birthdyear.selectByVisibleText("1988");
          
          //gender          

          driver.findElement(By.cssSelector("input[type='radio'][value='1']")).click();

          
          //websubmit
          
          driver.findElement(By.name("websubmit")).click();

          

      }
     // Thread.sleep(3000);

      //  driver.quit();
	}

}
