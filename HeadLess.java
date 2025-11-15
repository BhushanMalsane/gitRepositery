package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLess {
	public static void main(String[] args) {
		ChromeOptions cc = new ChromeOptions();
		cc.addArguments("incognito");
		WebDriver dr = new ChromeDriver(cc);
		dr.get("https://www.google.com");
		System.out.println(dr.getTitle());
		
		FirefoxOptions ff = new FirefoxOptions();
		ff.addArguments("--headless");
		WebDriver dr1 = new FirefoxDriver(ff);
		dr1.get("https://www.gmail.com");
		System.out.println(dr1.getTitle());
	}
}

