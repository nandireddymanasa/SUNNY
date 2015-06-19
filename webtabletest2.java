package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class webtabletest2
{
FirefoxDriver driver;
@BeforeMethod
public void setup()
{
	driver = new FirefoxDriver();
	driver.get("http://www.timeanddate.com/worldclock/");
}
@Test
public void webtest()
{
	String p1 = "html/body/div[6]/section[2]/div[1]/table/tbody/tr[";
	String p2 = "]/td[";
	String p3 = "]";
	for (int i = 1; i <=37;i++)
	{
		for (int j = 1; j <=8; j++) 
		{
			String x = driver.findElement(By.xpath(p1 + i + p2 + j + p3)).getText();
			System.out.print(x);
		}
		System.out.println();
	}
	
}
}
