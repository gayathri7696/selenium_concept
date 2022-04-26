package com.selenium.concepts;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Cookies {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Gayathri\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	Set<Cookie>cookies=driver.manage().getCookies();
	for(Cookie cookie:cookies) {
		System.out.println(cookie);
	}
	
}
}

