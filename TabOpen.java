package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabOpen {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver ob = new ChromeDriver();
		ob.manage().window().maximize();
		String pw = ob.getWindowHandle();
		ob.get("https://google.com");
		Thread.sleep(1000);
		
		ob.switchTo().newWindow(WindowType.TAB);
		String pc = ob.getWindowHandle();
		ob.get("https://gmail.com");
		Thread.sleep(1000);
		ob.switchTo().newWindow(WindowType.TAB);
		String pc1 = ob.getWindowHandle();
		ob.get("https://hp.com");
		Thread.sleep(1000);
		ob.switchTo().window(pc);
		Thread.sleep(1000);
		ob.switchTo().window(pw);
		Thread.sleep(1000);
		ob.switchTo().window(pc1);
		Thread.sleep(1000);
		ob.close();
		ob.switchTo().window(pw);
	}

}
