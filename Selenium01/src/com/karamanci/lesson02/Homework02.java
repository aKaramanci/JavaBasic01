package com.karamanci.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Homework02 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
			
		
			
			driver.get("https://www.google.com/");
			
			String actualURL = driver.getCurrentUrl();
			String expectedURL = "https://www.google.com/";
			
			
			if(actualURL.equalsIgnoreCase(expectedURL))
			{
				System.out.println("Title = " + driver.getTitle());
			}
			else{
				System.out.println("The URL is wrong!");
			}
			
			
			Thread.sleep(5000);
			
			driver.close();
	}

}
