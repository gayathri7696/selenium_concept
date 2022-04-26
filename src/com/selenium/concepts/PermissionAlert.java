package com.selenium.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PermissionAlert {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gayathri\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//driver.get("https://the-internet.herokuapp.com/basic_auth");
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	//driver.get("https://username:password@URL);
}
}
