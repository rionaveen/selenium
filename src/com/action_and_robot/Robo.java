package com.action_and_robot;

import java.awt.AWTException;
import java.awt.Robot;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robo {
	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PC\\Selenium\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");

		driver.manage().window().maximize();

		WebElement search = driver.findElement(By.name("q"));

		search.sendKeys("NAVEEN");

		Robot robo = new Robot();

		robo.keyPress(KeyEvent.VK_CONTROL);

		robo.keyPress(KeyEvent.VK_A);

		robo.keyRelease(KeyEvent.VK_A);
		
		
		

		// robo.keyRelease(KeyEvent.VK_CONTROL);

		// robo.keyPress(KeyEvent.VK_CONTROL);

		robo.keyPress(KeyEvent.VK_X);
		robo.keyRelease(KeyEvent.VK_X);
		robo.keyRelease(KeyEvent.VK_CONTROL);

		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);

		//
		// robo.keyPress(KeyEvent.VK_CONTROL);
		/*
		 * robo.keyPress(KeyEvent.VK_V); robo.keyRelease(KeyEvent.VK_V);
		 */

	}

}
