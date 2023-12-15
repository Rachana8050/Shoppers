package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locatorspgm2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver",
				"./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/rachana/Desktop/Locatorspgm2.html");
		Thread.sleep(2000);
		//driver.findElement(By.tagName("input")).sendKeys("Hii");
		//driver.findElement(By.id("a1")).sendKeys("Hello");
		//driver.findElement(By.name("n1")).sendKeys("Bye");
		//driver.findElement(By.className("c1")).sendKeys("Hi");
		driver.findElement(By.linkText("facebook")).click();

	}

}
