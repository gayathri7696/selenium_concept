package com.selenium.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownLetscode {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Gayathri\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		WebElement workspace = driver.findElement(By.xpath("//a[@class='button is-info']"));
		workspace.click();
		WebElement dropdown = driver.findElement(By.xpath("//a[@href='/dropdowns']"));
		dropdown.click();
		WebElement fruits = driver.findElement(By.id("fruits"));
		Select s1 = new Select(fruits);
		// getfirstselect option,if we didnt select any options the default option will
		// be printed
		WebElement firstselopt = s1.getFirstSelectedOption();
		System.out.println(firstselopt.getText());

		s1.selectByIndex(1);
		s1.selectByValue("3");
		// s1.selectByVisibleText("Pine Apple");
		WebElement firstselopt1 = s1.getFirstSelectedOption();
		System.out.println(firstselopt1.getText());
		// if we select 3 values,the value that we give @last will b selected for
		// firstselectedoption

		// getoptions
		WebElement superhero = driver.findElement(By.xpath("//select[@id='superheros']"));
		Select s2 = new Select(superhero);
		List<WebElement> options = s2.getOptions();
		for (WebElement option1 : options) {
			if (option1.getText().equals("Wolverine"))// give the visible text not the value
			{
				option1.click();
			}

		}
		WebElement lang = driver.findElement(By.id("lang"));

		Select s3 = new Select(lang);

		List<WebElement> langopt = s3.getOptions();
		for (WebElement langopt1 : langopt) {
			System.out.println(langopt1.getText());
			if (langopt1.getText().equals("C#")) {
				langopt1.click();
			}
		}
		WebElement country = driver.findElement(By.id("country"));
		Select s4 = new Select(country);
		s4.selectByValue("India");
		System.out.println(s4.getFirstSelectedOption().getText());
		// System.out.println(s4.selectByValue("India".gettext());//this is not
		// possible..i.ewe can print the
		// value of the selected option in the print statement..

		// to print tje value of the selected option we hve to use getfirstselected
		// option

		System.out.println("is superhero multiple? " + s2.isMultiple());
		s2.selectByIndex(0);
		s2.selectByIndex(5);
		s2.selectByIndex(10);
		s2.selectByIndex(12);
		s2.selectByIndex(11);
		s2.selectByIndex(20);
		s2.selectByIndex(25);
		s2.deselectByIndex(11);
		List<WebElement> allselect2 = s2.getAllSelectedOptions();
		for (WebElement allsel1 : allselect2) {
			System.out.println(allsel1.getText());

		}
		//s2.deselectAll();

	}

}
