package com.project.task;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_Methods {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gayathri\\eclipse-workspace\\Selenium.concepts\\drivers\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	//get cookie
	Set<Cookie>cookies= driver.manage().getCookies();
	System.out.println(cookies.size());
	for(Cookie cookie:cookies)
	{
		System.out.println(cookie.getValue());
	}
	//add cookie
	Cookie cookie1=new Cookie("gayathri","12345");
	Cookie cookie2=new Cookie("gayu","123");
	driver.manage().addCookie(cookie1);
	driver.manage().addCookie(cookie2);
	
	cookies=driver.manage().getCookies();
	System.out.println("after adding cookie"+cookies.size());
	
	//delete cookie
	driver.manage().deleteCookie(cookie1);
	cookies=driver.manage().getCookies();
	System.out.println("after deleting cookie by object: "+cookies.size());
	//delete cookie by name
	driver.manage().deleteCookieNamed("gayu");
	cookies=driver.manage().getCookies();
	System.out.println("after deleting cookie by name: "+cookies.size());
	//delete all cookies
	driver.manage().deleteAllCookies();
	cookies=driver.manage().getCookies();
	System.out.println("after deleting all cookies: "+cookies.size());
	
	
	
	
	
	
	
	
	
	}

}
