package com.selenium_task.concepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTask1   {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gayathri\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://leafground.com/");
	
	WebElement alert=driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[9]"));
	alert.click();
	WebElement alertbox=driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
	alertbox.click();
	//Alert a1=driver.switchTo().alert();
	Thread.sleep(5000);
	//a1.accept();
	
	WebElement conformbox=driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
	conformbox.click();
	Alert a2=driver.switchTo().alert();
	Thread.sleep(5000);
	a2.dismiss();
	
	WebElement prompt=driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
	prompt.click();
	Alert a3=driver.switchTo().alert();
	a3.sendKeys("greens tech");
	Thread.sleep(5000);
	a3.accept();
	
	WebElement sweetalert=driver.findElement(By.xpath("//button[@onclick='sweetalert()']"));
	sweetalert.click();
	WebElement sw=driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']"));
	Thread.sleep(5000);
	sw.click();
	driver.quit();
	
}
}
