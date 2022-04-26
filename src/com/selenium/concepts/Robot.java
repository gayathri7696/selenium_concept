package com.selenium.concepts;





import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gayathri\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,1000)","");
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,-1000)");
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,0)");
		WebElement element=driver.findElement(By.xpath("(//div[@class='row justify-content-left p-5 td-box--100'])[2]"));
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		
		
		
		
		
	}
}
