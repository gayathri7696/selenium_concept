package com.selenium_task.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunchNavigate2 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Gayathri\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.tnebnet.org/awp/login");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.close();
		

	}
}
