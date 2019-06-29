package org.selenium.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tools {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.toolsqa.com/automation-practice-form/");
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Yukaish");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Raj");
	driver.findElement(By.xpath("//input[@id='sex-0']")).click();
	driver.findElement(By.xpath("//input[@id='exp-5']")).click();
	driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("1st July 2019");
	driver.findElement(By.xpath("//input[@id='profession-1']")).click();
	driver.close();
}
}
