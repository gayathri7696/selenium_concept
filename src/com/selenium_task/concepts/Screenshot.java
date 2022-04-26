package com.selenium_task.concepts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Gayathri\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://letcode.in/letxpath");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File srs=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\Gayathri\\eclipse-workspace\\Selenium\\Screenshots\\img1.png");
	FileHandler.copy(srs, dest);
	
	WebElement pic=driver.findElement(By.xpath("//img[@alt='letChrome']"));
	File sec1=pic.getScreenshotAs(OutputType.FILE);
	File dest1=new File("C:\\Users\\Gayathri\\eclipse-workspace\\Selenium\\Screenshots\\img2.png");
	FileHandler.copy(sec1, dest1);
	
	WebElement sec=driver.findElement(By.xpath("//article[@class='tile is-child notification is-primary']"));
	
	File src2=sec.getScreenshotAs(OutputType.FILE);
	File dest2=new File("C:\\Users\\Gayathri\\eclipse-workspace\\Selenium\\Screenshots\\img3.png");
	FileHandler.copy(src2, dest2);
	driver.quit();
	
	
}
}

