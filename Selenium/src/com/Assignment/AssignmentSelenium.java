package com.Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class AssignmentSelenium {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "E:\\course\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		WebElement bs = driver.findElement(By.xpath("(//a[contains(text(),'Best Sellers')])[1]"));

		Actions act = new Actions(driver);// used to perform mouse actions in driver.
		act.contextClick(bs).build().perform();

		Thread.sleep(1000);
		Robot robo = new Robot();// used to perform keyboard actions - .awt file - abstractWindowToolkit
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);
		WebElement td = driver.findElement(By.xpath("//a[contains(text(),'Today')]"));

		act.contextClick(td).build().perform();

		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robo.keyPress(KeyEvent.VK_ENTER);

		Thread.sleep(3000);
		WebElement mob = driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]"));

		act.contextClick(mob).build().perform();

		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);
		WebElement cust = driver.findElement(By.xpath("(//a[contains(text(),'Customer Service')])[1]"));

		act.contextClick(cust).build().perform();

		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);
		System.out.println("------------------------------------------------------");
		Set<String> title = driver.getWindowHandles();

		for (String cp : title) {

			String title1 = driver.switchTo().window(cp).getTitle();
			System.out.println("child tab tittle -- " + title1);
		}
		for (String cp : title) {

			String title2 = driver.switchTo().window(cp).getTitle();

			if (title2.equals("Amazon.in - Today's Deals")) {
				break;
			}

		}
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement aust = driver.findElement(By.xpath("//a[contains(text(),'Australia')]"));
		Thread.sleep(1500);
		js.executeScript("arguments[0].scrollIntoView()", aust);

		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("E:\\course\\Selenium\\Selenium\\ScreenShots\\assign.png");
		FileHandler.copy(source, des);

	}

}
