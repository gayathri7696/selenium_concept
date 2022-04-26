package com.project.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_alternative {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Gayathri\\eclipse-workspace\\Selenium.concepts\\drivers\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.navigate().to("https://www.facebook.com/");
	
	//alternative for get()-->navigate.to()
	
	
	
	}

}
