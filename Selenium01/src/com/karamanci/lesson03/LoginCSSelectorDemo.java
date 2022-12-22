package com.karamanci.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginCSSelectorDemo {
    public final static String url ="http://sis.neotechacademy.com:9000/Test/";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
	    WebDriver driver = new ChromeDriver();
	    driver.get(url);
	    driver.findElement(By.cssSelector("input#tUsername")).sendKeys("Admin");
	    driver.findElement(By.cssSelector("#tPassword")).sendKeys("3252");
	    
	    //click on login
	    //using 
	    driver.findElement(By.cssSelector("input.buttonBig")).click();
	    driver.findElement(By.cssSelector("a[hraf$='Personal.aspx']")).click();
        Thread.sleep(3000);
        driver.quit();	    

	}

}
