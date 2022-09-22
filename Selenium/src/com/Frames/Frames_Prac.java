package com.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Prac {
	
	public static void main (String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\course\\Selenium\\Selenium\\Drivers\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		
		WebElement frame1 = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(frame1);
		WebElement clickme = driver.findElement(By.id("Click"));
		clickme.click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		WebElement outerFrame = driver.findElement(By.xpath("//*[@id=\'wrapframe\']/iframe"));// need to find the xpath
		driver.switchTo().frame(outerFrame);
		Thread.sleep(2000);
		WebElement innerFrame = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(innerFrame);
		WebElement click2 = driver.findElement(By.id("Click1"));
		click2.click();
		
	}
}
