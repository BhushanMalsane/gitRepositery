package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ScrollAutomation {
	WebDriver ob =new ChromeDriver();
  @Test
  public void f() throws InterruptedException {
	 
	  ob.manage().window().maximize();
	  ob.get("https://practicetestautomation.com/practice-test-login/");
	  JavascriptExecutor js = (JavascriptExecutor)ob;
	  js.executeScript("window.scrollBy(0,500)");
	  Thread.sleep(3000);
	  js.executeScript("window.scrollBy(0,-400)");
	  
	  Thread.sleep(2000);
	  WebElement li = ob.findElement(By.xpath("//a[@href='https://practicetestautomation.com/privacy-policy/']"));
	  js.executeScript("arguments[0].scrollIntoView(true);",li);
	  Thread.sleep(2000);
	  li.click();
	  
  }


}
