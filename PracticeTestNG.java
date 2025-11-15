package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class PracticeTestNG {
	WebDriver ob = new ChromeDriver();
	
  @Test
  @Parameters({"user","pass"})
  public void f(String user,String pass) throws InterruptedException {
	  JavascriptExecutor js = (JavascriptExecutor)ob;
	  js.executeScript("window.scrollBy(0,500)");
	  WebElement we = ob.findElement(By.id("username"));
	  we.sendKeys(user);
	  WebElement we1 = ob.findElement(By.id("password"));
	  we1.sendKeys(pass);
	  Thread.sleep(1000);
	  WebElement we2 = ob.findElement(By.id("submit-login"));
	  we2.click();
  }
  @BeforeTest
  public void beforeTest() {
	  ob.manage().window().maximize();
	  ob.get("https://practice.expandtesting.com/login");
  }

  @AfterTest
  public void afterTest() {
  }

}
