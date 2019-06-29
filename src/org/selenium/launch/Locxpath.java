package org.selenium.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locxpath {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
	WebElement btn = driver.findElement(By.xpath("//a[@href='contact.php']"));
	btn.click();
	driver.findElement(By.id("InputName")).sendKeys("Yukaish");
	driver.findElement(By.xpath("//input[@type='email'][1]")).sendKeys("yukesh08@gmail.com");
	driver.findElement(By.id("InputSubject")).sendKeys("9884953010");
	driver.findElement(By.name("courses")).sendKeys("Java");
}
}
