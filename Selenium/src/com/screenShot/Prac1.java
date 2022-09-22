package com.screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Prac1 {

	public static void main (String[] args) throws InterruptedException, IOException

{
		System.setProperty("webdriver.chrome.driver", "E:\\course\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create.click();
		
		Thread.sleep(5000);
		
		WebElement user = driver.findElement(By.xpath("//input[@name='firstname']"));
		user.sendKeys("Parithy");
		
		WebElement last = driver.findElement(By.xpath("//input[@name='lastname']"));
		last.sendKeys("GL");
		
		WebElement email =driver.findElement(By.xpath("//input[@name='reg_email__']"));
		email.sendKeys("parithygl@gmail.com");
		
		WebElement cemail = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		cemail.sendKeys("parithygl@gmail.com");
		
		WebElement pass = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		pass.sendKeys("@pops1809");
		
		WebElement bday =driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select sc1 = new Select (bday);
		sc1.selectByValue("20");
		
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		Select sc2 = new Select(month);
		sc2.selectByVisibleText("Sep");
		
		WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
		Select sc3 = new Select (year);
		sc3.selectByValue("1987");
		
		WebElement gender = driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
		gender.click();
		
		WebElement signup = driver.findElement(By.xpath("(//button[text() ='Sign Up'])[1]"));
		signup.click();
		
		Thread.sleep(5000);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File des = new File ("E:\\course\\Selenium\\Selenium\\ScreenShots\\facebook.png");
		FileHandler.copy(source, des);
		
		
		
		
		
		}
}
