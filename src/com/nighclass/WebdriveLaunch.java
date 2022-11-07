package com.nighclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriveLaunch {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Selenium\\SeleniumPractice\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
//ChromeDriver launch=new ChromeDriver();

String path="https://www.flipkart.com/mens-footwear/sports-shoes/pr?sid=osp,cil,1cu&otracker=nmenu_sub_Men_0_Sports%20Shoes";
//method
driver.get(path);
//driver.navigate().to(path);
//String title = driver.getTitle();
//System.out.println(title);
//driver.navigate().to("http://www.greenstechnologys.com/selenium-training-in-chennai.html");
//String title1 = driver.getTitle();
//System.out.println(title1);
//Thread.sleep(2000);
//driver.navigate().back();
//Thread.sleep(2000);
//driver.navigate().refresh();
//Thread.sleep(2000);
//driver.navigate().forward();






driver.manage().window().maximize();

//WebElement userName = driver.findElement(By.id("username"));
//userName.sendKeys("naveenbabu");
//
//WebElement passWord = driver.findElement(By.id("password"));
//passWord.sendKeys("1234567");
//
//driver.findElement(By.id("login")).click();

List<WebElement> findElements = driver.findElements(By.xpath("//a[@href=\"/\"]"));

for (WebElement r : findElements) {
	
	r.getText();
	
	
	
}





//Thread.sleep(3000);
//driver.close();

		
		
	}

}
