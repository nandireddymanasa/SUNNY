package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webtabletest 
{
	public static void main(String[]args )
	{
 FirefoxDriver driver = new FirefoxDriver();
	driver.get("http://www.timeanddate.com/worldclock/");
	String part1 = "html/body/div[6]/section[2]/div[1]/table/tbody/tr[";
	String part2 ="]/td[1]";
	for (int i = 1; i <= 37; i++) 
	{
		String x = driver.findElement(By.xpath(part1 + i + part2)).getText();
		System.out.println(x);
		
	}
	

}
}
