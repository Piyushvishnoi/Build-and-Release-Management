package demo_selenium;
//webdriver is class implemented by chromedriver
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FIrst_Test_Class {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","/Users/piyushvishnoi/Desktop/chromedriver/chromedriver"); //setting property
WebDriver driver=new ChromeDriver();
driver.navigate().to("https://www.google.co.in");  //how to navigate to a site
driver.findElement(By.name("q")).sendKeys("Devops");   //to type devops at search area on google
driver.findElement(By.name("btnK")).click();  //to click search button on google
	}

}
