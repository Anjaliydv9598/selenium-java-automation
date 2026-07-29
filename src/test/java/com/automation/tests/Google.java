package com.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	
	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver=new ChromeDriver();
		
		//Navigate to Google
		driver.get("https://www.google.com/");
		
		//Locate the search box by name
		driver.findElement(By.name("q"));
		
		//Use enter data in search field 
		WebElement element=driver.findElement(By.name("q"));
		element.sendKeys("hp laptop");
		
		Thread.sleep(3000);
		
		//erase it
		element.clear();
		
		//Re-enter another query and submit
		element.sendKeys("mackbook");
		element.submit();
		
		Thread.sleep(6000);
		driver.quit();
		
		
	}

}
