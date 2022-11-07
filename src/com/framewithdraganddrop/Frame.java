package com.framewithdraganddrop;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frame {
	static WebDriver driver;

	public static void drag() throws InterruptedException {

		Actions act = new Actions(driver);

		WebElement outerFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));

		driver.switchTo().frame(outerFrame);

		WebElement image1 = driver.findElement(By.xpath("//h5[text()='High Tatras']"));

		WebElement destination = driver.findElement(By.id("trash"));

		act.dragAndDrop(image1, destination).build().perform();

		WebElement image2 = driver.findElement(By.xpath("//h5[text()='High Tatras 2']"));

		act.dragAndDrop(image2, destination).build().perform();

		WebElement image3 = driver.findElement(By.xpath("//h5[text()='High Tatras 3']"));

		act.dragAndDrop(image3, destination).build().perform();

		WebElement image4 = driver.findElement(By.xpath("//h5[text()='High Tatras 4']"));

		act.dragAndDrop(image4, destination).build().perform();
		Thread.sleep(3000);

	}

	public static void dragAndDrop() throws InterruptedException {

		Actions act = new Actions(driver);
		driver.navigate().refresh();
		WebElement outerFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));

		driver.switchTo().frame(outerFrame);

		List<WebElement> image = driver.findElements(By.xpath(" //h5[contains(text(),'High Tatras')]"));

		int size = image.size();

		System.out.println(size);

		for (WebElement i : image) {
			
		

			//String im = image.get(i).getText();

			//System.out.println(im);

//			WebElement multipleImges = driver.findElements(By.xpath(" //h5[contains(text(),'High Tatras')]")).get(size);

			WebElement destination = driver.findElement(By.id("trash"));

			act.dragAndDrop(i , destination).build().perform();
			
			

		}

	}

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PC\\Selenium\\SeleniumPractice\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		driver.manage().window().maximize();

		// Thread.sleep(5000);

		//drag();
		dragAndDrop();

	}

}
