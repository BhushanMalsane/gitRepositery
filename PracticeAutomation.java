package com.test;

import java.net.http.WebSocket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeAutomation {
	public static void main(String[] args) throws InterruptedException {
		WebDriver ob = new ChromeDriver();
		
		ob.manage().window().maximize();
		ob.get("https://practicetestautomation.com/practice-test-login/");
//		ob.findElement(By.id("username")).click();
//		Thread.sleep(2000);
//		ob.findElement(By.id("username")).sendKeys("Welcome");
//		Thread.sleep(2000);
//		ob.findElement(By.name("username")).clear();
//		Thread.sleep(2000);
//		ob.findElement(By.id("username")).sendKeys("student");
//		Thread.sleep(2000);
//		ob.findElement(By.name("password")).sendKeys("Password123");
//		Thread.sleep(2000);
//		ob.findElement(By.id("submit")).click();
		
		WebElement we = ob.findElement(By.id("username"));
		we.click();
		Thread.sleep(1500);
		we.sendKeys("Welcome to");
//		Thread.sleep(1500);
//		we.clear();
//		Thread.sleep(1500);
//		we.sendKeys("Automation");
//		String s =we.getAttribute("value");
//		System.out.println(s);
//		System.out.println(we.isDisplayed());
//		System.out.println(we.isEnabled());
//		System.out.println(we.isSelected());
//		System.out.println(we.getLocation());
//		System.out.println(we.getSize());
//		System.out.println(we.getTagName());

		
		ob.findElement(By.id("submit")).click();
		WebElement msg = ob.findElement(By.id("error"));
		Thread.sleep(1000);
		System.out.println(msg.getText());
		we.sendKeys("student");
		WebElement we1 = ob.findElement(By.name("password"));
		we1.click();
		we1.sendKeys("Pass");
		ob.findElement(By.id("submit")).click();
		Thread.sleep(1000);
		System.out.println(msg.getText());
	}
}
