package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoDragAndDrop {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver",
				"./Softwares/geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/dragDrop/dragToCorrect?sublist=1");
		Thread.sleep(1000);
		WebElement src1 = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		Thread.sleep(1000);
		//WebElement src2 = driver.findElement(By.xpath("//div[@class='draggable']"));
	    WebElement des1 = driver.findElement(By.xpath("//div[@class='drop-column  min-h-[200px] bg-slate-100']"));
	    Thread.sleep(1000);
	    //WebElement src3 = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		//WebElement src4 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
	   // WebElement des2 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
	    Actions act=new Actions(driver);
		act.dragAndDrop(src1, des1).perform();
		Thread.sleep(1000);
		//act.dragAndDrop(src2,des1).perform();
		//act.dragAndDrop(src3,des2).perform();
		//act.dragAndDrop(src4,des2).perform();
        
	}

}
