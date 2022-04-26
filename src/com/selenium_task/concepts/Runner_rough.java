package com.selenium_task.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runner_rough extends Base_rough {
	//public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gayathri\\eclipse-workspace\\Selenium.concepts\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/");
		
		WebElement alert=driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[9]"));
		alert.click();
		//WebElement alertbox=driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		//alertbox.click();
		//alert("accept");
		WebElement conformbox=driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
		conformbox.click();
		alert("decline");
		
		
		
	}

}
