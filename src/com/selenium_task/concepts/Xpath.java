package com.selenium_task.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gayathri\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.navigate().to("http://adactinhotelapp.com/");
	//driver.manage().window().maximize();
	WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
	System.out.println(username.getAttribute("id"));
	username.sendKeys("gayathri");
	
	System.out.println(driver.findElement(By.id("username")).getAttribute("value"));
	username.clear();
	username.sendKeys("Gayathri7696");
	System.out.println(driver.findElement(By.xpath("//input[@id='username']")).getAttribute("value"));
	WebElement forgetpass= driver.findElement(By.linkText("Forgot Password?"));
	forgetpass.click();
	driver.navigate().back();
	WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
	password.sendKeys("gayu");
	System.out.println("password: "+driver.findElement(By.xpath("//input[@id='password']")).getAttribute("value"));
	WebElement login=driver.findElement(By.id("login"));
	System.out.println("is login displayed: "+login.isDisplayed());
	System.out.println("is login enabled: "+login.isEnabled());
	System.out.println("is login selected: "+login.isSelected());
	login.click();
	System.out.println(driver.findElement(By.xpath("//td[@class='welcome_menu']")).getText());
	System.out.println(driver.findElement(By.xpath("//a[@href='SearchHotel.php']")).getText());
	//System.out.println(driver.findElement(By.xpath("//input[@type='text']")).getText());
	//System.out.println(driver.findElement(By.id("username_show")).getText());
	//System.out.println(driver.findElement(By.xpath("//input[@value='Hello Gayathri7696!']")).getText());
	System.out.println(driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/input")).getText());
	System.out.println(driver.findElement(By.xpath("//span[@class='login_title_comm']")).getText());
//System.out.println(driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[2]/td/form/table/tbody/tr[1]/td/span")).getText());
}
}