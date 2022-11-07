package com.instagram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PC\\Selenium\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		//driver.navigate().refresh();
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("automation12345");
		
		WebElement passWord = driver.findElement(By.name("password"));
		passWord.sendKeys("12345677890");
		
        driver.findElement(By.xpath("Log In")).click();
		
		
	}

}
