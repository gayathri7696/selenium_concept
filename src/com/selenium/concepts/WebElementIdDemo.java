package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementIdDemo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gayathri\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.navigate().to("http://adactinhotelapp.com/");
	String title=driver.getTitle();
	System.out.println("title: "+title);
	String url=driver.getCurrentUrl();
	System.out.println("URL: "+url);
	WebElement x=driver.findElement(By.id("username"));
	x.sendKeys("Gayathri7696");
	WebElement y=driver.findElement(By.id("password"));
	y.sendKeys("poojagayathri1");
	WebElement z=driver.findElement(By.id("login"));
	z.click();
}
}
