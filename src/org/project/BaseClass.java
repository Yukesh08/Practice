package org.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
static WebDriver driver;
public static void launchBrowser(String url) {
	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(url);

}
public static void closeBrowser() {
	driver.quit();

}
public static void type(WebElement e, String s) {
	e.sendKeys(s);

}
public static void click(WebElement e) {
	e.click();

}
}
