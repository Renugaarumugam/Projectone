package org.project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskOne {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement buttonClose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		buttonClose.click();
		
		WebElement search = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		search.sendKeys("mac laptop");
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		
		WebElement move = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		move.click();
		
		List<WebElement> products = driver.findElements(By.xpath("//div[contains(text(),'APPLE')]"));
		
		for(int i=0;i<24;i++)
		{
			WebElement product  = products.get(i);
			String text = product.getText();
			System.out.println(text);
		}
		List<WebElement> prices = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		
		for(int i=0;i<24;i++)
		{
			WebElement price  = prices.get(i);
			String text1 = price.getText();
			System.out.println(text1);
		}
		//true
		
	}
}
