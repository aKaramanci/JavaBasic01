package com.karamanci.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public final static String url ="http://sis.neotechacademy.com:9000/Test/";
	public static void main(String[] args) throws InterruptedException {
	//System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
	    System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");

    WebDriver driver = new ChromeDriver();
    driver.get(url);
    
    driver.findElement(By.id("tUsername")).sendKeys("Admin");
    driver.findElement(By.id("tPassword")).sendKeys("Neotech$123");
    Thread.sleep(2000);
    driver.findElement(By.id("bLogin")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Surtdents")).click();
    
    
    

	}
}
