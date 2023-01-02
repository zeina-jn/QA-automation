package com.selenium1;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","/Users/Apple 1/Documents/chromedriver_mac64/chromedriver");
        WebDriver driver =   new ChromeDriver();
       // driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
        driver.navigate().to("https://online.actitime.com/abcd2/login.do");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

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
      //Thread.sleep(4000);
      driver.findElement(By.id("loginButton")).click();
     // Thread.sleep(4000); 

      
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
      wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[text()='Tasks']"))));
      
    String ele =   driver.findElement(By.xpath("//div[text()='Tasks']")).getText();
   System.out.println("ele:"+ele);
      
      driver.findElement(By.xpath("//div[text()='Tasks']")).click();
      
      Wait <WebDriver> wait1 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
      
      WebElement elemment = wait.until(new Function<WebDriver, WebElement>() {
    	  WebElement wb;
    	  public WebElement apply(WebDriver t) {
    		  
    		  wb = driver.findElement(By.xpath("//div[@class='collapseButtonPlaceholder']/following-sibling::div[@class='titlle']"));
    	  return wb;
    	  }});
      
      String text = elemment.getText();
      System.out.println("text : "+text );

      //driver.close();
    //  driver.quit();
	}

}
