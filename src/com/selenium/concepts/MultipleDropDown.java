package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDown {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Gayathri\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://ironspider.ca/forms/dropdowns.htm");
	WebElement options=driver.findElement(By.name("coffee"));
	options.click();
	Select s=new Select(options);
	WebElement getfirstsel=s.getFirstSelectedOption();
	System.out.println(getfirstsel.getText());
	
}
}