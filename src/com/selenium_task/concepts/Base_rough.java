package com.selenium_task.concepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_rough {
	
	public static WebDriver driver;
	public static WebDriver browser_configuration(String type)
	{
		if(type.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}
	public static void alert(String type)
	{
		
		Alert a=driver.switchTo().alert();
		if(type.equalsIgnoreCase("accept"))
		{
			a.accept();
		}
		else if(type.equalsIgnoreCase("decline"))
		{
			a.dismiss();
		}
		else
		{
			a.sendKeys("alert");
			a.accept();
		}
	}
}
