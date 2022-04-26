package com.selenium_task.concepts;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowandle {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gayathri\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		String parent=driver.getWindowHandle();
		WebElement mulwin=driver.findElement(By.xpath("//button[@onclick='openWindows()']"));
		mulwin.click();
		Set<String>handles=driver.getWindowHandles();
		List<String>list1=new ArrayList<String>(handles);
		for(String children:handles)
		{
			if(!(children.equals(parent)))
			{
				driver.switchTo().window(children);
				String title=driver.getTitle();
				if(title.contains("Interact with Buttons"))
				{
					WebElement home=driver.findElement(By.id("home"));
					home.click();
					driver.manage().window().maximize();
					Thread.sleep(5000);
					driver.close();
				}
				else if(title.contains("Interact with HyperLinks"))
				{
					WebElement broken=driver.findElement(By.xpath("//a[@href='error.html']"));
					broken.click();
					driver.manage().window().maximize();
					Thread.sleep(5000);
					driver.close();
				}
			}
		}
		driver.switchTo().window(parent);
		//Interact with Buttons
		//Interact with HyperLinks
	}

}
