package com.spicejet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJet {
	static WebDriver driver;
	public static void fromTO(String from,String to) throws InterruptedException {
		
		String xpath1="//div[text()='";
		String xpath2="']";
		String fromCity=from;
		String toCity=to;
		String date="19";
		String month="";
		String year="2022";
		
		driver.findElement(By.xpath("//div[text()='From']")).click();
		driver.findElement(By.xpath(xpath1+fromCity+xpath2)).click();
		driver.findElement(By.xpath(xpath1+toCity+xpath2)).click();
		
		driver.findElement(By.xpath("//div[text()='Departure Date']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div[3]/div[2]/div[6]/div"));
		
			
			
	
		
//		
//		
////		driver.findElement(By.className("css-76zvg2 r-jwli3a r-ubezar r-16dba41")).click();
//		List<WebElement> date = driver.findElements(By.xpath("//div[@data-testid='undefined-calendar-day-8']"));
//	for(int i=1;i<=date.size();i++)
//	{
//		String days = date.get(i).getText();
//		System.out.println(days);
//	
//	}
		
		
		

	}
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PC\\Selenium\\SeleniumPractice\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		fromTO("IXB", "MAA");
	driver.findElement(By.xpath("//div[text()='Passengers']")).click();
		
		driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
		
		
		
		
		

	}

}
