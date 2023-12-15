package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Qspiderslog {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver",
				"./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
        //driver.findElement(By.cssSelector("section[class='poppins']")).click();
        //driver.findElement(By.cssSelector("input[id='name']")).sendKeys("rachana");
        //Thread.sleep(2000);
        //driver.findElement(By.cssSelector("input[id='email']")).sendKeys("rachana@123gmail.com");
        //Thread.sleep(2000);
       // driver.findElement(By.cssSelector("input[id='password']")).sendKeys("rachana@123");
        //Thread.sleep(2000);
        //driver.findElement(By.cssSelector("button[type='submit']")).click();
        //Thread.sleep(2000);
        //driver.findElement(By.cssSelector("a[href='/button']")).click();
        //driver.findElement(By.cssSelector("button[id='btn1']")).click();
        //driver.findElement(By.cssSelector("button[id='btn3']")).click();
        //Thread.sleep(2000);
        //driver.findElement(By.cssSelector("button[id='btn5']")).click();
		//driver.findElement(By.cssSelector("a[href='/link']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.cssSelector("a[href='/link/policy']")).click();
		  driver.findElement(By.cssSelector("a[href='/radio']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.cssSelector("input[id='attended8']")).click();
        
        }

}
