package com.karamanci.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {

	public final static String url = "https://www.facebook.com/";
	
	public static void main(String[] args) throws InterruptedException {
	/*
		 * HW2: Facebook sign up: Open chrome browser 
		 * Go to "https://www.facebook.com/"
		 * Click on Sign Up link 
		 * Enter first name 
		 * Enter last name 
		 * Enter email address
		 * Re-enter email address 
		 * Click on Sign Up button
		 */
		
		
		//System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	    System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");

		WebDriver driver = new ChromeDriver();
		
		//go to this url
		driver.get(url);
		
		driver.findElement(By.linkText("Create new account")).click();
										
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("John");
		driver.findElement(By.name("lastname")).sendKeys("Smith");
		driver.findElement(By.name("reg_email__")).sendKeys("john123@gmail.com");
		//when we fill out the email, then another input box shows to confirm email
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("john123@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("john123");
		
		driver.findElement(By.name("websubmit")).click();
		
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
