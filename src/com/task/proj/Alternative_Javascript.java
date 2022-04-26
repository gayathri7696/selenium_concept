package com.task.proj;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alternative_Javascript {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Gayathri\\eclipse-workspace\\Selenium.concepts\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://adactinhotelapp.com/");
	WebElement username=driver.findElement(By.id("username"));
	WebElement password=driver.findElement(By.id("password"));
	WebElement login=driver.findElement(By.id("login"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].value='Gayathri7696';",username);
	js.executeScript("arguments[0].value='SD95CF';", password);
	js.executeScript("arguments[0].click();", login);
}
}
