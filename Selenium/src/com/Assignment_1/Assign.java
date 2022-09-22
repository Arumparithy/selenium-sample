package com.Assignment_1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Assign {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "E:\\course\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();

		WebElement close = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		close.click();
		Thread.sleep(2000);

		WebElement topOffers = driver
				.findElement(By.xpath("//*[@id=\'container\']/div/div[2]/div/div/div[1]/a/div[1]/div/img"));

		Actions act = new Actions(driver);
		act.contextClick(topOffers).build().perform();

		Thread.sleep(2000);
		Robot rt = new Robot();
		rt.keyPress(KeyEvent.VK_PAGE_DOWN);
		rt.keyRelease(KeyEvent.VK_PAGE_DOWN);
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);

		WebElement grocery = driver
				.findElement(By.xpath("//*[@id=\'container\']/div/div[2]/div/div/div[2]/a/div[1]/div/img"));
		act.contextClick(grocery).build().perform();
		Thread.sleep(1000);
		rt.keyPress(KeyEvent.VK_PAGE_DOWN);
		rt.keyRelease(KeyEvent.VK_PAGE_DOWN);
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);

		WebElement mobile = driver
				.findElement(By.xpath("//*[@id=\'container\']/div/div[2]/div/div/div[3]/a/div[1]/div/img"));
		act.contextClick(mobile).build().perform();
		Thread.sleep(1000);
		rt.keyPress(KeyEvent.VK_PAGE_DOWN);
		rt.keyRelease(KeyEvent.VK_PAGE_DOWN);
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);

		WebElement app = driver
				.findElement(By.xpath("//*[@id=\'container\']/div/div[2]/div/div/div[7]/a/div[1]/div/img"));
		act.contextClick(app).build().perform();
		Thread.sleep(1000);
		rt.keyPress(KeyEvent.VK_PAGE_DOWN);
		rt.keyRelease(KeyEvent.VK_PAGE_DOWN);
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);

		System.out.println("----------------------------------------------------------");
		String pw = driver.getWindowHandle();
		System.out.println("parent window ID -- " + pw);

		Set<String> cpw = driver.getWindowHandles();

		for (String window : cpw) {

			String title = driver.switchTo().window(window).getTitle();
			System.out.println("Windows Title are --- " + title);

		}
		for (String string : cpw) {
			String title1 = driver.switchTo().window(string).getTitle();

			Thread.sleep(2000);
			if (title1.equals("Mobile Phones Online at Best Prices in India")) {
				break;
			}
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement moto = driver
				.findElement(By.xpath("//*[@id=\'container\']/div/div[3]/div[2]/div[2]/div[16]/div/div/a/div/img[2]"));
		js.executeScript("arguments[0].scrollIntoView()", moto);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("E:\\course\\Selenium\\Selenium\\ScreenShots\\face.png");
		Thread.sleep(2000);
		FileHandler.copy(source, des);

	}
}






