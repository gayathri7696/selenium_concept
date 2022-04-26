package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownFacebook {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gayathri\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	//WebElement act=driver.findElement(By.xpath("//a[@id='u_0_2_94']"));
	WebElement act=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
	act.click();	
	Thread.sleep(5000);
	
	WebElement username=driver.findElement(By.xpath("//input[@name='firstname']"));
	Thread.sleep(5000);
	username.sendKeys("gayathri");
	WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
	Thread.sleep(5000);
	lastname.sendKeys("gayu");
	Thread.sleep(5000);
	
	
}
}
