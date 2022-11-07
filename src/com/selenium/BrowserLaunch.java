package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\PC\\Selenium\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-training-in-chennai.html");
	}

}
