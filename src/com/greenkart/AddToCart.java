package com.greenkart;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AddToCart {
	static String[] veg = { "Corn", "Cucumber", "Beetroot" };
	static WebDriver driver;

	public static void addCart() throws InterruptedException {

		List<WebElement> allCart = driver.findElements(By.xpath("//h4[@class='product-name']"));

		int j = 0;
		for (int i = 0; i < allCart.size(); i++) {
			List<String> li = Arrays.asList(veg);
			String name = allCart.get(i).getText();
			System.out.println(name);

			String[] nameFormat = name.split("-");
			String getName = nameFormat[0].trim();

			if (li.contains(getName)) {
				driver.findElements(By.xpath("//h4[@class='product-name']//following::button")).get(i).click();
				// break;
				j++;
			}
			if (j == 3) {
				break;
			}

		}
		// Thread.sleep(5000);

		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();

		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[text()='Place Order']")).click();

		WebElement country = driver.findElement(By.xpath("//label[text()='Choose Country']//following::select"));
		Select drpCountry = new Select(country);
		drpCountry.selectByValue("India");

		driver.findElement(By.className("chkAgree")).click();

		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		

	}

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PC\\Selenium\\SeleniumPractice\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		addCart();

	}

}
