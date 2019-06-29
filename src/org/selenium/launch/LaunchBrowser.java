
package org.selenium.launch;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchBrowser {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
}
}