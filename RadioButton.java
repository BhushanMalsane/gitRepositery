package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioButton {
	public static void main(String[] args) throws InterruptedException {
		WebDriver ob = new ChromeDriver();
		
		ob.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		ob.manage().window().maximize();
		
		WebElement w = ob.findElement(By.id("name"));
		w.sendKeys("Bhushan");
		
		WebElement we = ob.findElement(By.name("email"));
		we.sendKeys("malsanebhushan@gmail.com");
		
		WebElement rb = ob.findElement(By.id("gender"));
		rb.click();
//		Thread.sleep(1500);
//		ob.findElement(By.xpath("//input[@id='name']//following::input[3]")).click();
		
		ob.findElement(By.xpath("//input[@id='name']//following::input[8]")).click();
		ob.findElement(By.xpath("//input[@id='name']//following::input[9]")).click();
		
		WebElement we1 = ob.findElement(By.id("mobile"));
		we1.sendKeys("7038826870");
		
		WebElement we2 = ob.findElement(By.id("dob"));
		we2.sendKeys("12-11-2025");
		
		WebElement we3 = ob.findElement(By.name("subjects"));
		we3.sendKeys("SDM");
		
		WebElement add = ob.findElement(By.xpath("//textarea[@placeholder='Currend Address']"));
		add.sendKeys("WhiteHouse");
		
		WebElement state = ob.findElement(By.xpath("//select[@id='state']"));
		Select sr = new Select(state);
		sr.selectByIndex(2);
		Thread.sleep(2000);
		sr.selectByVisibleText("Haryana");
		System.out.println(state.getText());
		
		WebElement city = ob.findElement(By.xpath("//select[@id='city']"));
		Select ci = new Select(city);
		ci.selectByIndex(1);
		
		ob.findElement(By.name("picture")).sendKeys("C:\\Users\\CDAC\\Pictures\\wallp\\2.jpg");
		
		ob.findElement(By.xpath("//a[@href='login.php']")).click();
	}
}
