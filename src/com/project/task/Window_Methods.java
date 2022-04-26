package com.project.task;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Methods {
	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gayathri\\eclipse-workspace\\Selenium.concepts\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().fullscreen();
	Thread.sleep(3000);
	driver.manage().window().minimize();
	Thread.sleep(3000);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	System.out.println(driver.manage().window().getPosition());
	System.out.println(driver.manage().window().getSize());
	driver.manage().window().setPosition(new Point(-5, -3));
	Thread.sleep(3000);
	Dimension dm=new Dimension(400, 500);
	driver.manage().window().setSize(dm);

	
	
	}

}
