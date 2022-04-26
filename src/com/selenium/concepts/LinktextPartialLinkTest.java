package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinktextPartialLinkTest {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gayathri\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.navigate().to("http://adactinhotelapp.com/");
	WebElement text=driver.findElement(By.linkText("Forgot Password?"));
	text.click();
	//WebElement partial_link_text=driver.findElement(By.partialLinkText("Password"));
	//partial_link_text.click();
}
}
