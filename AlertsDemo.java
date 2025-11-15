package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver ob = new ChromeDriver();
		ob.manage().window().maximize();
		ob.get("https://demo.automationtesting.in/Alerts.html");
		
		ob.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		Alert al = ob.switchTo().alert();
		Thread.sleep(1500);
		System.out.println(al.getText());
		al.accept();
		
		ob.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		ob.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Alert al1 = ob.switchTo().alert();
		Thread.sleep(1500);
		System.out.println(al1.getText());
		al1.dismiss();
		System.out.println(ob.findElement(By.id("demo")).getText());
		
		
	}
}
