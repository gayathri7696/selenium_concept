package com.task.proj;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Functions {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gayathri\\eclipse-workspace\\Selenium.concepts\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement search=driver.findElement(By.name("q"));
		Actions a=new Actions(driver);
		a.sendKeys(search, "selenium").perform();
		a.sendKeys(Keys.ENTER).perform();
		WebElement selenium=driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']//parent::a[@href='https://www.selenium.dev/']"));
		a.moveToElement(selenium).perform();
		a.click().perform();
		WebElement read=driver.findElement(By.xpath("//a[@href='/documentation/webdriver/']"));
		a.moveToElement(read).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).perform();
		driver.quit();
		
	}

}
