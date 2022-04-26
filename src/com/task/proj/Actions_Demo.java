package com.task.proj;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Demo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gayathri\\eclipse-workspace\\Selenium.concepts\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username=driver.findElement(By.id("email"));
		username.clear();
		username.sendKeys("gayathri");
		Actions actions=new Actions(driver);
		 actions.keyDown(Keys.CONTROL);
	        actions.sendKeys("a");
	        actions.keyUp(Keys.CONTROL);
	        actions.build().perform();
	        actions.keyDown(Keys.CONTROL);
	        actions.sendKeys("c");
	        actions.keyUp(Keys.CONTROL);
	        actions.build().perform();
	        actions.sendKeys(Keys.TAB);
	        actions.build().perform();
	        actions.keyDown(Keys.CONTROL);
	        actions.sendKeys("v");
	        actions.keyUp(Keys.CONTROL);
	        actions.build().perform();
	        WebElement password=driver.findElement(By.id("pass"));
	        System.out.println("password: "+password.getAttribute("value"));
	        
			
	}

}
