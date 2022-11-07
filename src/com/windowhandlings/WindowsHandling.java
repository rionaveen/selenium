package com.windowhandlings;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class WindowsHandling {

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PC\\Selenium\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		Actions act = new Actions(driver);

		Robot r = new Robot();

		WebElement book = driver.findElement(By.xpath("//a[text()='Books']"));

		act.contextClick(book).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement cusService = driver.findElement(By.xpath("//a[text()='Customer Service']"));

		act.contextClick(cusService).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement electronics = driver.findElement(By.xpath("//a[text()=' Electronics ']"));

		act.contextClick(electronics).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		WebElement Fashion = driver.findElement(By.xpath("//a[text()='Fashion']"));

		act.contextClick(Fashion).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement newReleases = driver.findElement(By.xpath("//a[text()='New Releases']"));

		act.contextClick(newReleases).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		 Set<String> allwindow = driver.getWindowHandles();
		 
		 for (String childParent : allwindow) {
	
			String fifth="Amazon.in Hot New Releases: The bestselling new and future releases on Amazon";
			
			String yo="Help - Amazon Customer Service";
			
			if(driver.switchTo().window(childParent).getTitle().equals(fifth))
			{
								
				WebElement btPage = driver.findElement(By.xpath("//a[text()='Twitter']"));
				
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].scrollIntoView();", btPage);
			 
				TakesScreenshot screenShot=(TakesScreenshot) driver;
				File src = screenShot.getScreenshotAs(OutputType.FILE);
				File des=new File("C:\\Users\\PC\\Selenium\\SeleniumPractice\\ScreenShots\\bottomimage.png");
				FileHandler.copy(src, des);
				
			}
			
			if(driver.switchTo().window(childParent).getTitle().equals(yo))
			{
				driver.findElement(By.xpath("//img[@alt='Your Orders']")).click();
				
				TakesScreenshot screenShot=(TakesScreenshot) driver;
				File src = screenShot.getScreenshotAs(OutputType.FILE);
				File des=new File("C:\\Users\\PC\\Selenium\\SeleniumPractice\\ScreenShots\\YourOrder.png");
				FileHandler.copy(src, des);
				
				System.out.println("Test Passed");
				
			}
		
			
		}
		

	}

}
