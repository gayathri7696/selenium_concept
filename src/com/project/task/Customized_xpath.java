package com.project.task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Customized_xpath {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Gayathri\\eclipse-workspace\\Selenium.concepts\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("http://automationpractice.com/index.php");
	WebElement contact=driver.findElement(By.xpath("//div[@id='contact-link']//child::a"));
	contact.click();
	WebElement sigin=driver.findElement(By.xpath("//a[@class='login']//parent::div"));
	sigin.click();
	WebElement email=driver.findElement(By.xpath("//div[@class='form_content clearfix']//descendant::input[@id='email']"));
	email.sendKeys("gayugayathri@yahoo.com");
	Thread.sleep(3000);
	WebElement search=driver.findElement(By.xpath("//input[@id='search_query_top']//ancestor::div[@id='search_block_top']"));
	search.click();
	System.out.println("search");
	WebElement signin=driver.findElement(By.xpath("//a[@class='login']//preceding::div[@class='row']"));
	signin.click();
	WebElement emailid=driver.findElement(By.xpath("//label[@for='email']//following-sibling::input"));
	emailid.sendKeys("gayugayathri@yahoo.com");
	
	
	
	
	
		





}
}
