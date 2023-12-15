package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class QspidersDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver",
				"./Softwares/geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/dropdown?sublist=0");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("7760480433");
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath("//Select[@id='select2']"));
		Select s=new Select(ele);
		s.selectByVisibleText("Female");
		WebElement ele1 = driver.findElement(By.xpath("//Select[@id='select3']"));
		Select s1=new Select(ele1);
		s1.selectByVisibleText("India");
		WebElement ele2 = driver.findElement(By.xpath("//Select[@id='select5']"));
		Select s2=new Select(ele2);
		s2.selectByValue("Karnataka");
		
    }

}
