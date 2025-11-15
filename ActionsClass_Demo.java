package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass_Demo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver ob = new ChromeDriver();
		ob.get("https://accounts.saucelabs.com/am/XUI/#login/");
		ob.manage().window().maximize();
		
		WebElement we = ob.findElement(By.id("idToken1"));
		Actions a = new Actions(ob);
		a.moveToElement(we).contextClick().build().perform();
		Thread.sleep(1000);
		we.sendKeys("Welcome");
		a.doubleClick(we).build().perform();
		
	}
}
