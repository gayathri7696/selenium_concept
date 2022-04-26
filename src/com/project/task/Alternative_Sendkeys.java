package com.project.task;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Alternative_Sendkeys {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Gayathri\\eclipse-workspace\\Selenium.concepts\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://adactinhotelapp.com/");
	WebElement username=driver.findElement(By.id("username"));
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("document.getElementById('username').value='Gayathri7696'");
	WebElement password=driver.findElement(By.id("password"));
	js.executeScript("document.getElementById('password').value='SD95CF'");
	
	//alternative way for sendkeys using javascript executor
	
			
		
			
}
}
