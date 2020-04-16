package demo_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newone {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/piyushvishnoi/Desktop/chromedriver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/piyushvishnoi/Desktop/jsexercisefiles/radio.html");
		driver.findElement(By.xpath("//input[@value='orange']")).click();

	}

}
