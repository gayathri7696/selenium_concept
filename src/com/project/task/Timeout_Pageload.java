package com.project.task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Timeout_Pageload {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gayathri\\eclipse-workspace\\Selenium.concepts\\drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		/*driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);//default value 300 sec
		driver.get("https://www.selenium.dev/downloads/");
		System.out.println(driver.getTitle());
		driver.quit();
		*/
		driver.get("http://adactinhotelapp.com/");
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("gayu");
		System.out.println("attribute: "+username.getAttribute("id"));
		WebElement text=driver.findElement(By.xpath("//a[@href='Register.php']"));
		System.out.println("text: "+text.getText());
		System.out.println(username.getTagName());
	}

}
