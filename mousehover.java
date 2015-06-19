package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class mousehover
{
	public static void main(String[]args )
	{
 FirefoxDriver driver = new FirefoxDriver();
	driver.get("http://hdfcbank.com/");

WebElement event  =	driver.findElement(By.linkText("Making payments"));
Actions action = new Actions(driver);
action.moveToElement(event).build().perform();
}
}


	
