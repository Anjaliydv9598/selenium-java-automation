package com.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoShop {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		//Locate a link using By.linkText("About")
		WebElement element=	driver.findElement(By.linkText("https://demowebshop.tricentis.com/"));
		
		//Click the link
		element.click();
		
		//Verify the new page title 
		String actualTitle = driver.getTitle();
		String expectedTitle="https://demowebshop.tricentis.com/";
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Title is correct");
		}else {
			System.out.println("Title is inorrect");
		}
		
		
		Thread.sleep(15000);
		
	}
}
