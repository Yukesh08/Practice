package org.selenium.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Paragraph {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.google.com/");
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("greens velmurugan");
	driver.findElement(By.xpath("//input[@class='gNO89b'][1]")).click();
	driver.findElement(By.xpath("//h3[@class='LC20lb'][1]")).click();
}
}
