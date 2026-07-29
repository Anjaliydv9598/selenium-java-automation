package launchingBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");	
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Anjali");
		driver.findElement(By.id("LastName")).sendKeys("Yadav");
		driver.findElement(By.id("Email")).sendKeys("asd@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("1234567");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("1234567");
		driver.findElement(By.id("register-button")).click();
		
//		validate
		WebElement msg = driver.findElement(By.className("result"));
		if(msg.getText().contains("Your registration completed")) {
		    System.out.println("Registration was Successful !");
		} else {
		    System.out.println("Registration Failed");
		}
		
		
//		WebElement email=driver.findElement(By.id("Email"));
//		if(msg.getText().con)
				
				
		driver.quit();
		
	}

}
