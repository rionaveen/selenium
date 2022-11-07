package com.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	static WebDriver driver ;
	public static void screenShot(String name) throws IOException {
		
		TakesScreenshot screenShot=(TakesScreenshot) driver;
		File src = screenShot.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\PC\\Selenium\\SeleniumPractice\\ScreenShots\\"+name+".png");
		FileHandler.copy(src, des);
		
	}
	
	public static void main(String[] args) throws IOException, InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PC\\Selenium\\SeleniumPractice\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		screenShot("FBLogin");
		WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
		userName.sendKeys("automation12345");
		
		WebElement passWord = driver.findElement(By.xpath("//input[@id='pass']"));
		passWord.sendKeys("12345677890");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(5000);
		screenShot("FB failed");
		
			}

}
