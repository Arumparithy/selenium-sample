package com.DragAndDrop_Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Prac_1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\course\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement frame = driver.findElement(By.xpath("//*[@id='post-2669']/div[2]/div/div/div[1]/p/iframe"));
		driver.switchTo().frame(frame);
		
		WebElement from = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement to = driver.findElement(By.xpath("//*[@id='trash']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(from, to);
		
		
		
		
	}

}