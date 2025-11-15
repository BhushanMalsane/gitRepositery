package com.testng;

import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataProviderClass  {
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {
	  WebDriver ob = new ChromeDriver();
	  ob.manage().window().maximize();
	  ob.get("https://practicetestautomation.com/practice-test-login/");
//	  Thread.sleep(3000);
	  ob.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  ob.findElement(By.id("username")).sendKeys(n);
	  ob.findElement(By.id("password")).sendKeys(s);
	  
	  List<WebElement> el=ob.findElements(By.tagName("a"));
	  System.out.println("The number of textBox : "+el.size());
	  
	  for(WebElement link : el)
	  {
		  System.out.println(link.getText());
	  }
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
    	
      new Object[] { "abcd", "pass" },
      new Object[] { "pqrs", "word" },
    };
  }
}
