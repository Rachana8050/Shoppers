package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class swap {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver",
				"./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/SeleniumSourceCode/swap.html");
		WebElement ele = driver.findElement(By.xpath("//input[@value='selenium']"));
		ele.sendKeys(Keys.CONTROL+"ax");
		//ele.sendKeys(Keys.CONTROL+"c");
		//ele.sendKeys(Keys.DELETE);
		WebElement ele1 = driver.findElement(By.xpath("//input[@type='text3']"));
        ele1.sendKeys(Keys.CONTROL+"v");
        Thread.sleep(2000);
        WebElement ele2 = driver.findElement(By.xpath("//input[@type='text2']"));
        ele2.sendKeys(Keys.CONTROL+"ax");
        //ele2.sendKeys(Keys.CONTROL+"c");
        //ele2.sendKeys(Keys.DELETE);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='selenium']"));
        //ele3.sendKeys(Keys.CONTROL+"v");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='text3']"));
        ele2.sendKeys(Keys.CONTROL+"ax");
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//input[@type='text2']"));
        //ele2.sendKeys(Keys.CONTROL+"a");
        //ele2.sendKeys(Keys.CONTROL+"c");
        //ele2.sendKeys(Keys.DELETE);
        driver.findElement(By.xpath("//input[@type='text2']"));
        ele.sendKeys(Keys.CONTROL+"v");
	}

}
