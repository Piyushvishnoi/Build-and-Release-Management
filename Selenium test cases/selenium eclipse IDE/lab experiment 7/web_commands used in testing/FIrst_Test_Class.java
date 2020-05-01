package demo_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 

public class FIrst_Test_Class {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","/Users/piyushvishnoi/Desktop/chromedriver/chromedriver");
WebDriver driver=new ChromeDriver();
driver.navigate().to("https://www.google.co.in");
driver.findElement(By.name("q")).sendKeys("Devops");
driver.findElement(By.name("btnK")).click();
	} 

}
