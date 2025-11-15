package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		WebDriver dr1 = new FirefoxDriver();
		
		dr.get("https://google.com");
		dr1.get("https://gmail.com");
		
		
		
		dr.manage().window().maximize();
		dr1.manage().window().minimize();
		
		System.out.println(dr.getTitle());
		System.out.println(dr1.getCurrentUrl());
		
		System.out.println(dr.getTitle().equalsIgnoreCase(dr1.getTitle()));
		Thread.sleep(2000);
//		dr.close();
		dr1.close();
		
	}

}
