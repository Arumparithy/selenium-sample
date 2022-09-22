package com.WebDrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverPrac_1 {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "E:\\course\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			String title = driver.getTitle();
			System.out.println(title);
			//driver.navigate().to("https://www.youtube.com/");
			driver.navigate().refresh();
			driver.navigate().back();
			driver.close();
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
			
	}
	
	
}
