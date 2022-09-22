package com.XpathAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Prac {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\course\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://theautomationzone.blogspot.com/2020/07/xpath-practice.html");
		driver.manage().window().maximize();
	
		/* xpath types
		1. //p[@id='a' and  @name ='a'] 
		2. //a[span[@id='link']] or //span[@id='link']/.. --> refers to parent Element. [child(span)(with unique ID) to parent(a)]
		3. //div[@id='divB']//input	 ----> [parent(div) to child (input)]
		
		*/
		
//		driver.findElement(By.xpath("//a[span[@id='link']]")).click();
//		WebElement google = driver.findElement(By.xpath("//span[@id='link']/.."));
//		google.click();
//		Thread.sleep(2000);
//			
//		driver.navigate().to("https://theautomationzone.blogspot.com/2020/07/xpath-practice.html");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='divB']//input")).sendKeys("Hello POPS");
		

		
	}

}
