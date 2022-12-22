package com.karamanci.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public final static String url ="https://www.facebook.com/";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");

	    WebDriver driver = new ChromeDriver();
	    driver.get(url);
	    
	    driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
	    driver.findElement(By.id("Password")).sendKeys("Neotech$123");
	    Thread.sleep(2000);
	    driver.findElement(By.id("Login")).click();
	    Thread.sleep(2000);
	    
	    
	    

	}

}
