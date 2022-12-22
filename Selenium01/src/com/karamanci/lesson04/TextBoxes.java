package com.karamanci.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxes {
     public static String url ="https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407";
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.drive","drivers/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		//1st way
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-1\"]")).sendKeys("Hasan");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-1\"]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-2\"]")).sendKeys("Frend");

		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-1\"]")).clear();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-3\"]")).sendKeys("05624692423");

		driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-4\"]")).sendKeys("Neo");

		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
