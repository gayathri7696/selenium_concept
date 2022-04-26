package com.selenium_task.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollJavaScript {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Gayathri\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://leafground.com/home.html");
	driver.manage().window().maximize();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	//scroll down
	js.executeScript("window.scroll(0,500)");
	Thread.sleep(5000);
	//scrollup
	js.executeScript("window.scroll(0,-500)");
	Thread.sleep(5000);
	//scroll to bottom of the page
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	Thread.sleep(5000);
	//scroll to top 
	js.executeScript("window.scroll(0,0)");
	Thread.sleep(5000);
	//scroll to specific element
	WebElement element=driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[19]"));
	js.executeScript("arguments[0].scrollIntoView(true)",element);
	Thread.sleep(5000);
	element.click();
	//scroll by horizontally
	Thread.sleep(5000);
	js.executeScript("window.scrollBy(300,0)");
	
	
	
}
}
