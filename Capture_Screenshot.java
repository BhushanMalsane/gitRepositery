package com.test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Capture_Screenshot {
	public static void main(String[] args) throws IOException {
		WebDriver ob = new ChromeDriver();
		ob.manage().window().maximize();
		ob.get("https://www.google.com");
		
		File screenshot = ((TakesScreenshot)ob).getScreenshotAs(OutputType.FILE);
		Files.copy(screenshot,new File("C:\\Users\\CDAC\\Desktop\\SDM\\screenshot\\scr1.png"));
	}
}
