package com.automation.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	
	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		//Navigate to Flipkart
		driver.get("https://www.flipkart.com/");
		
		//Call getPageSource()
		driver.getPageSource();
		
		//Print the first 200 characters of the source
		String  source = driver.getPageSource();
		System.out.println(source.substring(0,200));
		
		
		Thread.sleep(3000);
		//Quit the browser
		driver.quit();
	}

}
