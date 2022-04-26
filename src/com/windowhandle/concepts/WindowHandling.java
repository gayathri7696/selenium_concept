package com.windowhandle.concepts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gayathri\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		String parent=driver.getWindowHandle();
		WebElement homepg=driver.findElement(By.id("home"));
		homepg.click();
		Set<String>handles=driver.getWindowHandles();
		for(String s:handles)
		{
			driver.switchTo().window(s);
		}
		
		WebElement edit=driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[1]"));
		edit.click();
		driver.close();
		
		driver.switchTo().window(parent);
		
		WebElement mulwin=driver.findElement(By.xpath("//button[@onclick='openWindows()']"));
		mulwin.click();
		
		int n=driver.getWindowHandles().size();
		System.out.println("total no of windows: "+n);
	}
}
