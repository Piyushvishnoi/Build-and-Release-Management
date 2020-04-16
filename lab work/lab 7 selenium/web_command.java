package demo_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class web_command {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/piyushvishnoi/Desktop/chromedriver/chromedriver");
		WebDriver driver=new ChromeDriver();
		String url=("https://www.google.co.in/");
		driver.get(url); // to get url name `
		String title=driver.getTitle();
		int titlelength=driver.getTitle().length();  //to get title length
		System.out.println("title of page is: " +title);
		System.out.println("title length is: " +titlelength);
String actualurl=driver.getCurrentUrl(); //to get url name upon which we are working upon
if(actualurl.equals("https://www.google.co.in/"))  //comparing our url and loaded url
{
	System.out.println("Correct url got opened");
}
else {
	System.out.println("Correct url not opened");
}
String pagesource=driver.getPageSource();  //to get pagesource upon which we are working upon
int pagesourcelength=pagesource.length();  //to get length of the pagesource
System.out.println("page source content conatins "+pagesourcelength+" no of words");
driver.close();
	}

}
