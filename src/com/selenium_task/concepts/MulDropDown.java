package com.selenium_task.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MulDropDown {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Gayathri\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement act = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		act.click();
		Thread.sleep(5000);
		WebElement firstname = driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']"));
		firstname.sendKeys("gayathri");
		WebElement surname = driver.findElement(By.xpath("//input[@name='lastname']"));
		surname.sendKeys("panneer selvam");
		WebElement phoneno = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		phoneno.sendKeys("9384685587");
		WebElement newpass = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		newpass.sendKeys("gayu");

		WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
		Select s1 = new Select(date);
		s1.selectByValue("7");
		s1.selectByIndex(3);
		s1.selectByVisibleText("15");
		/*
		 * WebElement firstsel=s1.getFirstSelectedOption(); String s=firstsel.getText();
		 * System.out.println("1st selected: "+s);
		 */
		System.out.println("1st selected option is: " + s1.getFirstSelectedOption().getText());

		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s2 = new Select(month);
		List<WebElement> options = s2.getOptions();
		for (WebElement opt : options) {
			System.out.println(opt.getText());
			if (opt.getText().equals("Jun")) {
				opt.click();
			}
		}

		WebElement yr = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s3 = new Select(yr);
		List<WebElement> options1 = s3.getAllSelectedOptions();
		for (WebElement opt1 : options1) {
			System.out.println(opt1.getText());
			System.out.println(opt1.getAttribute("value"));

		}
		s3.selectByVisibleText("1996");
		WebElement female = driver.findElement(By.xpath("//label[@class='_58mt']"));
		female.click();

	}
}
