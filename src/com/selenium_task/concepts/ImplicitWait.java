package com.selenium_task.concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gayathri\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		WebElement textbox1=driver.findElement(By.id("btn1"));
		textbox1.click();
		WebElement text1=driver.findElement(By.id("txt1"));
		text1.sendKeys("gayu");
		WebElement textbox2=driver.findElement(By.id("btn2"));
		textbox2.click();
		WebElement text2=driver.findElement(By.id("txt2"));
		text2.sendKeys("gayathri");
		
	}

}
