package programs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopUp 
{
    public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver",
				"./Softwares/geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(1000);
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		//a.dismiss();
	}
}
