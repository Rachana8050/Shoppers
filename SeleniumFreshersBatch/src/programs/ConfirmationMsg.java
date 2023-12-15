package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConfirmationMsg {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver",
				"./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/button");
		Thread.sleep(2000);
		driver.findElement(By.id("btn")).click();
		Thread.sleep(2000);
		WebElement confirm_msg=driver.findElement(By.xpath("//span[contains(text(),'selected')]"));
        String text = confirm_msg.getText();
        System.out.println(text);
        Thread.sleep(2000);
        driver.quit();
	}

}
