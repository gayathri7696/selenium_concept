package com.windowhandle.concepts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window2 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gayathri\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		String parent=driver.getWindowHandle();
		WebElement mulwin=driver.findElement(By.id("newWindowsBtn"));
		mulwin.click();
		Set<String>child1=	driver.getWindowHandles();
		for(String c1:child1)
		{
			if(!(c1.equals(parent)))
			{
			driver.switchTo().window(c1);
			String title=driver.getTitle();
			if(title.contains("XPath Practice"))
			{
				WebElement regname=driver.findElement(By.xpath("(//input[@name='name'])[1]"));
				regname.sendKeys("gayathri panneerselvam");
				driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.close();
			}
			else if(title.contains("Basic Controls"))
			{
		WebElement name2=driver.findElement(By.id("firstName"));
		name2.sendKeys("bhavani");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
		}
			}
			}
		driver.switchTo().window(parent);
		WebElement name3=driver.findElement(By.id("name"));
		name3.sendKeys("gayathri");
		}
}
