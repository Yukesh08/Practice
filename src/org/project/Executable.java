package org.project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

public class Executable extends BaseClass{
	public static void main(String[] args) {
		launchBrowser("https://www.adactin.com/HotelApp/");
		Pom p = new Pom();
		type(p.getUsername(), "sivagreens");
		type(p.getPassword(), "1I9AK2");
		click(p.getBtnLogin());
		WebElement Loc = driver.findElement(By.id("location"));
		Select S =new Select (Loc);
		S.selectByVisibleText("Sydney");
		WebElement Hot = driver.findElement(By.id("hotels"));
		Select H =new Select (Hot);
		H.selectByVisibleText("Hotel Creek");
		WebElement Room = driver.findElement(By.id("room_type"));
		Select R =new Select (Room);
		R.selectByVisibleText("Standard");
		WebElement RoNo = driver.findElement(By.id("room_nos"));
		Select N =new Select (RoNo);
		N.selectByVisibleText("1 - One");
		WebElement Adult = driver.findElement(By.id("adult_room"));
		Select A =new Select (Adult);
		A.selectByVisibleText("2 - Two");
		WebElement Child = driver.findElement(By.id("child_room"));
		Select C =new Select (Child);
		C.selectByVisibleText("1 - One");
		click(p.getBtnSubmit());
		click(p.getRadiobut());
		click(p.getBtncont());
		type(p.getFirstname(), "Yukaish");
		type(p.getLastname(), "Raj");
		type(p.getAddress(), "Chennai");
		type(p.getCredit(), "1111444477778888");
		WebElement card = driver.findElement(By.id("cc_type"));
		Select cc = new Select (card);
		cc.selectByVisibleText("VISA");
		WebElement month = driver.findElement(By.id("cc_exp_month"));
		Select M = new Select (month);
		M.selectByVisibleText("May");
		WebElement year = driver.findElement(By.id("cc_exp_year"));
		Select Y = new Select (year);
		Y.selectByVisibleText("2022");
		type(p.getCvv(), "662");
		click(p.getBtnbook());
		
		
		
	}

}
