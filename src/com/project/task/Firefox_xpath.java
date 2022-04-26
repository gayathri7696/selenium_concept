package com.project.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_xpath {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Gayathri\\eclipse-workspace\\Selenium.concepts\\drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://adactinhotelapp.com/");
	WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
	username.sendKeys("Gayathri7696");
	Thread.sleep(3000);
	driver.close();
}
}
