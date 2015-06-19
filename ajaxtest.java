package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ajaxtest
{
FirefoxDriver driver;
@BeforeMethod
public void setup()
{
	driver = new FirefoxDriver();
	driver.get("http://google.com");
}
@Test
public void ajaxtesting()
{
	driver.findElement(By.name("q")).sendKeys("selenium");
	WebElement block=driver.findElement(By.xpath("//*[@id='sbtc']/div[2]/div[2]/div[1]"));
	List<WebElement>ajax=block.findElements(By.tagName("li"));
	System.out.println(ajax.size());
	for(int i=0;i<ajax.size();i++)
	{
		System.out.println(ajax.get(i).getText());
	}
  }
}
