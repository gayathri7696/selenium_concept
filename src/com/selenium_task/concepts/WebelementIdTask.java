package com.selenium_task.concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebelementIdTask {
	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Gayathri\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.navigate().to("http://adactinhotelapp.com/");
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		String url = driver.getCurrentUrl();
		System.out.println("URL: " + url);
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("7696");
		username.clear();
		Thread.sleep(5000);
		username.sendKeys("Gayathri7696");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("gayu");
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		driver.close();
		
		
	}
}
