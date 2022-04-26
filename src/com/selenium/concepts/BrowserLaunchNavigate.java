
package com.selenium.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunchNavigate {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Gayathri\\eclipse-workspace\\Selenium.concepts\\drivers\\chromedriver.exe" );
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.navigate().to("https://www.tnebnet.org/qwp/qpay");
	Thread.sleep(5000);
	driver.navigate().back();
	Thread.sleep(5000);
	driver.navigate().forward();
	Thread.sleep(5000);
	driver.navigate().refresh();
	driver.quit();

	
	
	
	
}
}
