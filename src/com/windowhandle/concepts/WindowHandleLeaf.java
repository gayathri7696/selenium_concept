package com.windowhandle.concepts;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleLeaf {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Gayathri\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://leafground.com/pages/Window.html");
	String parent=driver.getWindowHandle();
	System.out.println("parent id: "+parent);
	
	
	
	WebElement mulwin=driver.findElement(By.xpath("//button[@onclick='openWindows()']"));
	mulwin.click();
	
	Set<String>handles=driver.getWindowHandles();
	for(String s1:handles)
	{
		System.out.println("list1 id; "+s1);
		
	}
	List<String>children=new ArrayList<String>(handles);
	
	
	driver.switchTo().window(children.get(2));
	
	WebElement home=driver.findElement(By.id("home"));
	home.click();
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.close();
	
	driver.switchTo().window(children.get(1));
	
	WebElement broken=driver.findElement(By.xpath("//a[@href='error.html']"));
	broken.click();
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.close();
	
	driver.switchTo().window(children.get(0));
	
}
}
