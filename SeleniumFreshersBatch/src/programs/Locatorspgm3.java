package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locatorspgm3 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver",
				"./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("Rachana DK");
		//Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("rachana@123");
		//Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		//String title=driver.getTitle();
		//System.out.println(title);
		}
}
