package com.windowhandle.concepts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Gayathri\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.demo.guru99.com/popup.php");
	WebElement click1=driver.findElement(By.xpath("//a[@href='../articles_popup.php']"));
	click1.click();
	String parent=driver.getWindowHandle();
	Thread.sleep(2000);
	System.out.println("parent: "+driver.getTitle());
	System.out.println("parent: "+parent);
	Set<String>handles=   driver.getWindowHandles();
	for(String handle:handles)
	{
		System.out.println("child: "+handle);
		driver.switchTo().window(handle);
	}
	
	WebElement email=driver.findElement(By.name("emailid"));
	email.sendKeys("gaurav.2n@gmail.com");
	WebElement submit=driver.findElement(By.name("btnLogin"));
	Thread.sleep(2000);
	submit.click();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.close();
	driver.switchTo().window(parent);
	
}
}
