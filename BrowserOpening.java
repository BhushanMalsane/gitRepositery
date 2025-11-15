package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class BrowserOpening {
	WebDriver dr = new ChromeDriver();
  @Test
  public void f() throws InterruptedException {
	  Thread.sleep(1000);
	  WebElement we=dr.findElement(By.name("username"));
	  we.sendKeys("Admin");
	  WebElement we1=dr.findElement(By.name("password"));
	  we1.sendKeys("admin123");
	  WebElement we2=dr.findElement(By.xpath("//button[@type='submit']"));
	  we2.click();
  }
  @BeforeTest
  public void beforeTest() {
	  
	  dr.manage().window().maximize();
	  dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(6000);
	  dr.close();
  }

}
