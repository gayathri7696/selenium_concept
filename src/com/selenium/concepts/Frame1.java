package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Gayathri\\eclipse-workspace\\Selenium.concepts\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	/*driver.get("https://demoqa.com/frames");
	driver.switchTo().frame(1);
	//WebElement t1=driver.findElement(By.xpath("//h1[contains(text(),'This is a sample page')]"));
	WebElement text=driver.findElement(By.id("sampleHeading"));
	System.out.println(text.getText());
	*/
	driver.get("https://demoqa.com/nestedframes");
	driver.switchTo().frame("frame1");//parent frame
	//frame by webelement
	WebElement childframe=driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
	driver.switchTo().frame(childframe);
	//frame by index
	//driver.switchTo().frame(0);
	WebElement t1=driver.findElement(By.xpath("//p[contains(text(),'Child Iframe')]"));
	System.out.println("text1: "+t1.getText());
	driver.switchTo().parentFrame();
	WebElement t2=driver.findElement(By.tagName("body"));
	System.out.println("text2: "+t2.getText());
}
}
