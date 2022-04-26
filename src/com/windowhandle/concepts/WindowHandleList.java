package com.windowhandle.concepts;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleList {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Gayathri\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		//driver.manage().window().maximize();
		String parent = driver.getWindowHandle();
		System.out.println("parent1 id: "+parent);
		WebElement newwin = driver.findElement(By.id("newWindowBtn"));
		newwin.click();
		Set<String> handles = driver.getWindowHandles();
		List<String>children=new ArrayList<String>(handles);
		
		for(String s1:children)
		{
			System.out.println("list1 id: "+s1);
		}
		driver.switchTo().window(children.get(1));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement name1 = driver.findElement(By.id("firstName"));
		name1.sendKeys("gayathri panneer selvam");
		Thread.sleep(3000);
		
		driver.switchTo().window(children.get(0));
		WebElement name2 = driver.findElement(By.id("name"));
		name2.sendKeys("gayathri");
		Thread.sleep(3000);
		
		driver.switchTo().window(children.get(1));
		WebElement lastname = driver.findElement(By.id("lastName"));
		lastname.sendKeys("gayu");
		Thread.sleep(2000);
		//driver.close();
		
		driver.switchTo().window(children.get(0));
		//open new tab
		
		WebElement newtab=driver.findElement(By.id("newTabBtn"));
		newtab.click();
		driver.manage().window().maximize();
		Set<String> handles1 = driver.getWindowHandles();
		children.clear();//clear the previous list
		children.addAll(handles1);
		for(String s2:children)
		{
			System.out.println("list2 id: "+s2);
		}
		
		driver.switchTo().window(children.get(2));
		
		WebElement alert=driver.findElement(By.xpath("//button[@id='alertBox']"));
		alert.click();
		
		Thread.sleep(4000);
		
		Alert a1=driver.switchTo().alert();
		a1.accept();
		Thread.sleep(4000);
		driver.close();
		
		driver.switchTo().window(parent);
		
		
	}

}
