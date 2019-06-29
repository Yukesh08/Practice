package org.selenium.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	driver.switchTo().frame(0);
	driver.findElement(By.name("fldLoginUserId")).sendKeys("53868321");
	
}
}
