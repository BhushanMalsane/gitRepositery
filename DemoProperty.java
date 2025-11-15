package com.testng;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoProperty {
  @Test
  public void f() throws IOException {
	  WebDriver ob = new ChromeDriver();
	  ob.manage().window().maximize();
	  Properties p = new Properties();
	  FileReader fr = new FileReader("C:\\Users\\CDAC\\Desktop\\SDM\\TestNG\\TestNGProj\\src\\input.properties");
	  p.load(fr);
	  ob.get(p.getProperty("url"));
	  ob.findElement(By.id("username")).sendKeys(p.getProperty("Username"));
	  ob.findElement(By.id("password")).sendKeys(p.getProperty("Password"));
	  ob.findElement(By.id("submit")).click();
	  
	  
  }
}
