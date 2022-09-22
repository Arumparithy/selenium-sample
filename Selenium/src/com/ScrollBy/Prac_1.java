package com.ScrollBy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prac_1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\course\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		
		je.executeScript("window.scrollBy (0,2000)");
		Thread.sleep(5000);
		
		WebElement btn = driver.findElement(By.xpath("//a[text()='Australia']"));
		
		je.executeScript("arguments[0].scrollIntoView()", btn);
	
		Thread.sleep(2000);
	
		WebElement logo = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		je.executeScript("arguments[0].scrollIntoView()", logo);
		
		
	}

}
