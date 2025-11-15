package com.test;


import java.net.http.WebSocket;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naviget {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		dr.get("https://google.com");
		dr.manage().window().maximize();
		Thread.sleep(3000);
		
		dr.navigate();
		dr.get("https://youtube.com");
		Thread.sleep(3000);
		dr.navigate().back();
		System.out.println(dr.manage().window().getSize());
		Dimension d = new Dimension(500,850);
		dr.manage().window().setSize(d);
		
	}
}	
