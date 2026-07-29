package com.automation.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args)throws InterruptedException {
		
		//Open the browser
		WebDriver driver = new ChromeDriver();
		//Navigate to a site
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		//Navigate to a site
		driver.navigate().to("https://www.amazon.com/");
		//Print the window size
		System.out.println(driver.manage().window().getSize());
		//Quit the browser 
		Thread.sleep(15000);
		driver.quit();
		
		
	}
}
