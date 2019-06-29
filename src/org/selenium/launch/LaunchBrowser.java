
package org.selenium.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchBrowser {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
	WebElement txt = driver.findElement(By.xpath("//hd[text()='Greens Technologys Overall Reviews']"));
	String act = txt.getText();
	System.out.println(act);
}
}