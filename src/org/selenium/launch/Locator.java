package org.selenium.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.name("email")).sendKeys("Yukesh08@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("Yadesh");
	WebElement btn = driver.findElement(By.xpath("//input[@value='Log In']"));	
	btn.click();
}
}
