package com.WebElements;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements_Prac {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\course\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com");
		driver.manage().window().maximize();
		WebElement markets = driver.findElement(By.xpath("//*[@id=\"mc_mainWrapper\"]/header/div[1]/div[3]/nav/div/ul/li[2]/a"));
		markets.click();

		/*
		 * driver.get("https://www.youtube.com/"); driver.manage().window().maximize();
		 * Dimension d = new Dimension(500, 500); driver.manage().window().setSize(d);
		 * 
		 * WebElement but = driver.findElement(By.id("video-title")); but.click();
		 * WebElement but1 = driver.findElement(By.id("img")); but1.click();
		 */
		// WebElement email = driver.findElement(By.id("identifierId"));
		// email.sendKeys("parithypops@gmail.com");
		// driver.navigate().back();
		// driver.navigate().refresh();

	}
}
