package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollJSE {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver",
				"./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        /*for(int i=0;i<3;i++)
        {
        	js.executeScript("window.scrollBy(0,500)");
        	Thread.sleep(1000);
        }
        for(int j=0;j<3;j++)
        {
        	js.executeScript("window.scrollBy(0,-500)");
        	Thread.sleep(1000);
        }*/
		WebElement brazil = driver.findElement(By.xpath("//a[text()='Brazil']"));
		Point loc= brazil.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		System.out.println(x+" "+y);
		js.executeScript("window.scrollBy('+x+' , '+y+')");
		Thread.sleep(2000);
		brazil.click();
	}
}
