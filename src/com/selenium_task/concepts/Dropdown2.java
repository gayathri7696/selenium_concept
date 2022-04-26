package com.selenium_task.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gayathri\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://adactinhotelapp.com/index.php");
	WebElement username=driver.findElement(By.id("username"));
	username.sendKeys("Gayathri7696");
	WebElement password=driver.findElement(By.id("password"));
	password.sendKeys("gayu");
	WebElement login=driver.findElement(By.xpath("//input[@id='login']"));
	login.click();
	//gettext and get attribute
	WebElement text=driver.findElement(By.xpath("//td[@class='welcome_menu']"));
	System.out.println(text.getText());
	System.out.println(text.getAttribute("value"));
	System.out.println(text.getAttribute("class"));
	
	
	//dropdown
	WebElement location=driver.findElement(By.xpath("//select[@id='location']"));
	Select dp1=new Select(location);
	dp1.selectByIndex(6);
	WebElement hotel=driver.findElement(By.xpath("//select[@id='hotels']"));
	Select dp2=new Select(hotel);
	dp2.selectByValue("Hotel Creek");
	WebElement roomtype=driver.findElement(By.xpath("//select[@id='room_type']"));
	Select dp3=new Select(roomtype);
	dp3.selectByVisibleText("Deluxe");
	
}
}
