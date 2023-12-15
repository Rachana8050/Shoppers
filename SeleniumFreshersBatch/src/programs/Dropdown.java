package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver",
				"./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/rachana/Desktop/Dropdown.html");
		Thread.sleep(2000);
		WebElement drop = driver.findElement(By.xpath("//select[@id='city-dropdown']"));
		Select se=new Select(drop);
		se.selectByIndex(2);
		Thread.sleep(2000);
		se.selectByValue("B");
		Thread.sleep(2000);
		se.selectByVisibleText("Hassan");
		Thread.sleep(2000);
		//se.deselectByIndex(3);
		//Thread.sleep(2000);
		se.deselectAll();
		if(se.isMultiple())
		{
			System.out.println("Multi select");
		}
		else
		{
			System.out.println("Single select");
		}
    }

}
