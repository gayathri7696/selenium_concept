package com.selenium.concepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Gayathri\\eclipse-workspace\\Selenium.concepts\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://leafground.com/pages/table.html");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	
	
	//find no of rows
int row=driver.findElements(By.xpath("//table/tbody/tr")).size();
System.out.println("no of rows: "+row);

//find no of columns
int col=driver.findElements(By.xpath("//table/tbody/tr/th")).size();
System.out.println("no of columns: "+col);


//specific rows and column data
String value=driver.findElement(By.xpath("//table/tbody/tr[3]/td[5]")).getText();
System.out.println("Specific value: "+value);

System.out.println("*******************************************************");
//retrieve all data from the table

 List<WebElement>c1 =driver.findElements(By.xpath("//table/tbody/tr/td"));
		
		for(WebElement x:c1)
		{
			String s=x.getText();
			System.out.println(s);
		}
		System.out.println("*******************************************************");
//find mentor name and remarks of learn x path
/*String mentor=driver.findElement(By.xpath("//table/tbody/tr[3]/td[5]")).getText();
String remarks=driver.findElement(By.xpath("//table/tbody/tr[5]/td[6]")).getText();

System.out.println(mentor);
System.out.println(remarks);
System.out.println("*******************************************************");
*/
//to print the heading value
List<WebElement>c2 =driver.findElements(By.xpath("//table/tbody/tr/th"));
int n=c1.size();
System.out.println(n);
for(WebElement x:c2)
{
	String s=x.getText();
	System.out.println(s);
}
//to print particular col
List<WebElement>c3 =driver.findElements(By.xpath("//table/tbody/tr/td[6]"));

for(WebElement x:c3)
{
	System.out.println(x.getText());
}
}
}

