package com.DailyTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookCreateNewAccount {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PC\\Selenium\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(7000);

		WebElement userName = driver.findElement(By.xpath("//input[@name='firstname']"));
		userName.sendKeys("naveen");

		WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastName.sendKeys("babu");

		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		email.sendKeys("naveenbelieve19@gmail.com");
		
		
		WebElement reEmail = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		reEmail.sendKeys("naveenbelieve19@gmail.com");
		
		WebElement newPassWord = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		newPassWord.sendKeys("MSCssc@@1996");

		WebElement day = driver.findElement(By.xpath("//Select[@id='day']"));
		Select bDay = new Select(day);
		bDay.selectByVisibleText("19");

		WebElement month = driver.findElement(By.xpath("//Select[@id='month']"));
		Select bMonth = new Select(month);
		bMonth.selectByValue("11");

		WebElement year = driver.findElement(By.xpath("//Select[@id='year']"));
		Select bYear = new Select(year);
		bYear.selectByVisibleText("1996");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		

	}

}
