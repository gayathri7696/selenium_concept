package com.selenium.concepts;

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

public class Screenshot {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Gayathri\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://ironspider.ca/forms/dropdowns.htm");
	WebElement w=driver.findElement(By.name("coffee"));
	Select s=new Select(w);
	s.selectByVisibleText("With cream & sugar");

	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File tgt=new File("C:\\Users\\Gayathri\\eclipse-workspace\\Selenium.concepts\\ScreenShot.img.png");
	FileHandler.copy(src, tgt);
	driver.quit();
}
}
