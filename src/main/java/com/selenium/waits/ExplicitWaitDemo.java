package com.selenium.waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitDemo {
	
	
static WebDriver driver = null;

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
         
         WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(4));
 		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		WebElement usernameElement = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))); //use
		usernameElement.sendKeys("Admin");

		WebElement passwordElement = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		passwordElement.sendKeys("admin123");
		
		WebElement loginButtonElement = myWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=' Login ']")));
		loginButtonElement.click();
		
		driver.quit();

		
}
}
//in explicit wait identification of webelement is inclusive. it returns webelement directly
		//driver.findElement(By.name("username")).sendKeys("Admin");   // no need to use findelement method