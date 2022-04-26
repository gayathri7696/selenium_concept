package com.windowhandle.concepts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handles2 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Gayathri\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		WebElement newwin = driver.findElement(By.id("newWindowBtn"));
		newwin.click();

		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {

			if (!(parent.equals(handle))) {
				driver.switchTo().window(handle);
				driver.manage().window().maximize();
				Thread.sleep(3000);
				WebElement name1 = driver.findElement(By.id("firstName"));
				name1.sendKeys("gayathri panneer selvam");
				Thread.sleep(3000);
				

			} else {
				driver.switchTo().window(parent);
				WebElement name2 = driver.findElement(By.id("name"));
				name2.sendKeys("gayathri");
				Thread.sleep(3000);
			}

			if (!(parent.equals(handle))) {
				driver.switchTo().window(handle);
				WebElement lastname = driver.findElement(By.id("lastName"));
				lastname.sendKeys("gayu");
				Thread.sleep(2000);
			}
			driver.switchTo().window(parent);
		}
	}

}
