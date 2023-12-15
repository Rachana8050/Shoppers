package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actions {

	public static void main(String[] args) throws InterruptedException   
	{
		System.setProperty("webdriver.gecko.driver",
				"./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("file:///C:/Users/rachana/Desktop/Actions.html");
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//input[@type='text']"));
		ele.sendKeys("rachana",Keys.TAB+"rachana123",Keys.ENTER);
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Dimension d=new Dimension(300,400);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		Point p=new Point(300,400);
		driver.manage().window().setPosition(p); 
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		WebElement ele1=driver.findElement(By.xpath("//input[@value='Bangalore']"));
		boolean b=ele1.isDisplayed();
		if(b)
		{
			System.out.println("element displayed");
		}
		else
		{
			System.out.println("element not displayed");
		}
	}

}
