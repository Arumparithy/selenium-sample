package com.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebEle_Prac2 {
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","E:\\course\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opstra.definedge.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.youtube.com/");
		driver.navigate().to("https://sso.definedge.com/auth/realms/definedge/protocol/openid-connect/auth?response_type=code&client_id=opstra&redirect_uri=https://opstra.definedge.com/ssologin&state=e2cf559f-356c-425a-87e3-032097f643d0&login=true&scope=openid");
	
		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("parithypops");
		
		
			
	}

}
