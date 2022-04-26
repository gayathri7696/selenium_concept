package com.project.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alternative_Select {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Gayathri\\eclipse-workspace\\Selenium.concepts\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
	WebElement dp=driver.findElement(By.id("menu1"));
	dp.click();
	System.out.println("dropdown clicked");
	List<WebElement>l1=driver.findElements(By.xpath("//ul[@class=\"dropdown-menu\"]//li"));
	for(WebElement l2:l1)
	{
		if(l2.getText().equals("JavaScript"))
		{
			l2.click();
			break;
		}
	}
	driver.close();
}
}
