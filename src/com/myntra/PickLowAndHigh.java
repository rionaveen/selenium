package com.myntra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PickLowAndHigh {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PC\\Selenium\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.myntra.com/men-tshirts");

		driver.manage().window().maximize();

		List<WebElement> price = driver
				.findElements(By.xpath("//span[@class='product-strike']/preceding-sibling::span"));
//String n = null;
		for (WebElement nn : price) {

			String[] split = nn.getText().split(" ");
			
			String n=split[1];
			int r=Integer.parseInt(n);
			for(int i=0;i<split.length;i++) {
				int a[]=new int[n.length()];
				
				//System.out.println(a[i]=r);
				List<int[]> asList = Arrays.asList(a);
				asList.add(a);
				//ArrayList<Integer> list =new  ArrayList<Integer>(); 
				
				Arrays.sort(a);
				for (int[] webElement : asList) {
					System.out.println(webElement);
				}
				
				
				
			}
			


		}
		
	}
}
