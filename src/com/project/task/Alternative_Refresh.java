package com.project.task;


import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alternative_Refresh {
public static void main(String[] args) throws Throwable {
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\Gayathri\\eclipse-workspace\\Selenium.concepts\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");  
	Thread.sleep(2000);
	driver.get(driver.getCurrentUrl());//method 1
	Thread.sleep(2000);
	driver.navigate().to(driver.getCurrentUrl());  //method 2
	Thread.sleep(2000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.location.reload(true)");  //method 3
	Robot r=new Robot();//method 4
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_F5);
	r.keyRelease(KeyEvent.VK_F5);
	Thread.sleep(5000);
	driver.navigate().to("http://adactinhotelapp.com/");
	driver.findElement(By.id("username")).sendKeys(Keys.F5);//method 5
	driver.quit();
}
}
