package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Logintofb {

	public static void main(String[] args) throws InterruptedException  
	{
		System.setProperty("webdriver.gecko.driver",
				"./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("Rachana DK");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("rachana@123");
		driver.findElement(By.cssSelector("button[name='login']")).click();
		
		

	}

}
