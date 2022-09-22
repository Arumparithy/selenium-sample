package com.Table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_prac {
	
	public static void main (String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\course\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://theautomationzone.blogspot.com/2020/07/sample-webtable-3.html"); //http://www.leafground.com/pages/table.html
//		driver.manage().window().maximize();
//		WebElement jack = driver.findElement(By.xpath("(//table[@id = 'table1']//input)[1]"));
//		jack.click();

		driver.get("http://www.leafground.com/pages/table.html");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		

	}

}
