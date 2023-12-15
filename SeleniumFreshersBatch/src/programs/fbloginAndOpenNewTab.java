package programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fbloginAndOpenNewTab {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver",
				"./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Rachana DK");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("rachana@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
