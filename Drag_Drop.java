package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
	public static void main(String[] args) {
		WebDriver ob = new ChromeDriver();
		ob.manage().window().maximize();
//		ob.get("https://demo.automationtesting.in/Static.html");
//		
//		WebElement we = ob.findElement(By.id("angular"));
//		WebElement we1 = ob.findElement(By.id("droparea"));
//		WebElement we2 = ob.findElement(By.id("mongo"));
//		WebElement we3 = ob.findElement(By.id("droparea"));
//		
		Actions a = new Actions(ob);
//		a.dragAndDrop(we, we1).build().perform();
//		a.dragAndDrop(we2, we3).build().perform();
		
		ob.get("https://demo.guru99.com/test/drag_drop.html");
		
//		WebElement we = ob.findElement(By.xpath("//li[@class='block13 ui-draggable'][2]"));
		WebElement we = ob.findElement(By.id("fourth"));
		WebElement we1 = ob.findElement(By.id("amt7"));
		
		a.dragAndDrop(we, we1);
	}
}
