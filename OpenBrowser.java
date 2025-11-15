package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		WebDriver sr = new FirefoxDriver();
		
		dr.get("https://google.com");
		sr.get("https://gmail.com");
		
		dr.manage().window().maximize();
		sr.manage().window().minimize();
	
		System.out.println(dr.getTitle());
		
		Thread.sleep(3000);
		
		System.out.println(sr.getTitle());
		dr.close();
		sr.close();
		
		
		

	}

}
