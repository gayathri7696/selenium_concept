package com.selenium_task.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Gayathri\\eclipse-workspace\\Selenium.concepts\\drivers\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("http://leafground.com/");
	WebElement frame=driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[10]"));
	frame.click();
	//single frame
	driver.switchTo().frame(0);//in inspect box the index of this frame is 1
	WebElement frame1=driver.findElement(By.id("Click"));
	frame1.click();
	System.out.println("frame 1 text is: "+frame1.getText());
	driver.switchTo().defaultContent();
	
	//for nested frame
	driver.switchTo().frame(1);//in inspect box the index of this frame is 2
	driver.switchTo().frame(0);//inside this frame1 we have only 1 sub frame,so we pass the index as 0
	WebElement frame2=driver.findElement(By.id("Click1"));
	frame2.click();
	System.out.println("frame2 text is: "+frame2.getText());
	driver.switchTo().defaultContent();
	List<WebElement>tno=driver.findElements(By.tagName("iframe"));
	int s=tno.size();
	System.out.println("total no of frames: "+s);
	
}
}
