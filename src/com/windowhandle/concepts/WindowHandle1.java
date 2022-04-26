package com.windowhandle.concepts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gayathri\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String s=driver.getWindowHandle();
		System.out.println(s);
		WebElement newwin=driver.findElement(By.id("newWindowBtn"));
		newwin.click();
		
		Set<String>handles= driver.getWindowHandles();
		for(String handle:handles) {
		driver.switchTo().window(handle);
		}
		WebElement name1=driver.findElement(By.id("firstName"));
		name1.sendKeys("gayathri panneer selvam");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
		
	driver.switchTo().window(s);
	WebElement name2=driver.findElement(By.id("name"));
	name2.sendKeys("gayathri");
	
	
}
}