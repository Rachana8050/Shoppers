package programs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Practice {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException
	{
		System.setProperty("webdriver.gecko.driver",
				"./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qspiders.com/courses");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
        for(int i=0;i<1;i++)
        {
        	js.executeScript("window.scrollBy(0,500)");
        	Thread.sleep(1000);
        }
        WebElement ele = driver.findElement(By.xpath("(//span[text()='Details'])[6]"));
        Actions act=new Actions(driver);
	    act.contextClick(ele).perform();
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Set<String> allwh = driver.getWindowHandles();
		for (String wh : allwh) 
		{
			driver.switchTo().window(wh);
		}
		for(int i=0;i<3;i++)
        {
        	js.executeScript("window.scrollBy(0,500)");
        	Thread.sleep(1000);
        }
		driver.findElement(By.xpath("(//p[@class='card-header-title has-text-persian'])[3]")).click();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst=new File("C:\\Users\\rachana\\Pictures\\ScreenShot\\rachu.jpg");
		FileHandler.copy(src, dst);
		List<WebElement> s1 = driver.findElements(By.xpath("//div[@class='content']"));
		for (WebElement we : s1) 
		{
			System.out.println(we.getText());
		}
		driver.close();
	}

}
