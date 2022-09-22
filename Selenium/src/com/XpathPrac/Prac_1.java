package com.XpathPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prac_1 {
	
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\course\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cnbctv18.com/");
		driver.manage().window().maximize();
				
		Thread.sleep(5000);
//		WebElement email = driver.findElement(By.xpath("//input[@name='username']"));
//		email.sendKeys("parithy123@gmail.com");
		
		WebElement nif = driver.findElement(By.xpath("//select[@name = 'company']"));
		Select sc = new Select( nif);
		sc.selectByVisibleText("MCX");
		WebElement menu = driver.findElement(By.xpath("//div[@class = 'hamburger']"));
		menu.click();
		
		Thread.sleep(5000);
		
//		WebElement world = driver.findElement(By.xpath("//a[@class='hamburger_nav_world']"));
//		world.click();
		
		WebElement cnbc = driver.findElement(By.xpath("(//label[@class='sublab'])[2]"));
		Select sc2 = new Select(cnbc);
		sc2.selectByVisibleText("Contact");
	}

}
