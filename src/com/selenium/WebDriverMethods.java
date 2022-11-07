package com.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	WebDriver driver;
	public void browserLaunch() {
		String path="C:\\\\Users\\\\PC\\\\Selenium\\\\SeleniumPractice\\\\Drivers\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void webDriverMethods() {
		driver.get("https://www.flipkart.com/");
		String flipkartUrl = driver.getCurrentUrl();
		System.out.println(flipkartUrl);
		driver.navigate().to(
				"https://www.amazon.in/?ie=UTF8&tag=googinprimeexpt5-21&ascsubtag=_k_Cj0KCQjwjIKYBhC6ARIsAGEds-KWtRa1IFq75ZHP4i4Ryt1sH6AOodaoUZPUx90AdI1KxwrXeexIjyEaAoBfEALw_wcB_k_&gclid=Cj0KCQjwjIKYBhC6ARIsAGEds-KWtRa1IFq75ZHP4i4Ryt1sH6AOodaoUZPUx90AdI1KxwrXeexIjyEaAoBfEALw_wcB");
		String amzUrl = driver.getCurrentUrl();
		System.out.println(amzUrl);
		driver.navigate().back();
		String fliptitle = driver.getTitle();
		System.out.println(fliptitle);
		driver.navigate().forward();
		String amazontitle = driver.getTitle();
		System.out.println(amazontitle);
		driver.navigate().refresh();
	}
	public void browserClose() {
		driver.close();
		// driver.quit();
	}
	public static void main(String[] args) {
		WebDriverMethods web = new WebDriverMethods();
		web.browserLaunch();
		web.webDriverMethods();
		//web.browserClose();
	}

}
