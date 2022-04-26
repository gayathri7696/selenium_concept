package com.selenium_task.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Gayathri\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.tnebnet.org/qwp/qpay");
driver.manage().window().maximize();
driver.close();





}
}
