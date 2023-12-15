package programs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumRightClick {

	public static void main(String[] args) throws AWTException 
	{
		System.setProperty("webdriver.gecko.driver",
				"./Softwares/geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev");
		//Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='Downloads']"));
		Actions act=new Actions(driver);
	    act.contextClick(ele).perform();
	    //Thread.sleep(2000);
	    Robot r=new Robot();
	    r.keyPress(KeyEvent.VK_T);
	    r.keyRelease(KeyEvent.VK_T);
	    
		WebElement ele1 = driver.findElement(By.xpath("//span[text()='Documentation']"));
		Actions act1=new Actions(driver);
	    act1.contextClick(ele1).perform();
	    //Thread.sleep(2000);
	    Robot r1=new Robot();
	    r1.keyPress(KeyEvent.VK_T);
	    r1.keyRelease(KeyEvent.VK_T);
	
	    
		WebElement ele2 = driver.findElement(By.xpath("//span[text()='Projects']"));
		Actions act2=new Actions(driver);
	    act2.contextClick(ele2).perform();
	    //Thread.sleep(2000);
	    Robot r2=new Robot();
	    r2.keyPress(KeyEvent.VK_T);
	    r2.keyRelease(KeyEvent.VK_T);
	    
		WebElement ele3 = driver.findElement(By.xpath("//span[text()='Support']"));
		Actions act3=new Actions(driver);
	    act3.contextClick(ele3).perform();
	    //Thread.sleep(2000);
	    Robot r3=new Robot(); 
	    r3.keyPress(KeyEvent.VK_T);
	    r3.keyRelease(KeyEvent.VK_T);
	    
	    Set<String> allwh = driver.getWindowHandles();
	    ArrayList<String> l=new ArrayList<String>(allwh);
	    String wh = l.get(2);
	    driver.switchTo().window(wh);
	}

}
