package com.karamanci.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public final static String url ="https://www.facebook.com/";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");

	    WebDriver driver = new ChromeDriver();
	    driver.get(url);
	    driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Neotech$123");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"facebook\"]/body")).click();
	    Thread.sleep(1000);

	    driver.quit();

	}

}
