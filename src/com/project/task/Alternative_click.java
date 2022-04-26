package com.project.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Alternative_click {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gayathri\\eclipse-workspace\\Selenium.concepts\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://adactinhotelapp.com/");
		WebElement register=driver.findElement(By.xpath("//a[@href='Register.php']"));
		Actions a=new Actions(driver);
		a.click(register).build().perform();
		
		//alternative way for click()--->by using actions
		
	}

}
