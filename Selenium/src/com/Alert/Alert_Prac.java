package com.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.Base_Implementing;

public class Alert_Prac {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\course\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		WebElement btn = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		btn.click();
		
		Thread.sleep(3000);
		
		Alert al = driver.switchTo().alert();
		al.accept();
		
		WebElement btn2 = driver.findElement(By.xpath("(//a[@class='analystic'] )[2]"));
		btn2.click();
		
		WebElement btn3 = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		btn3.click();
		
		Thread.sleep(3000);
		
		Alert al2 = driver.switchTo().alert();
		al2.dismiss();
		
		
		
		
		
	}

}
