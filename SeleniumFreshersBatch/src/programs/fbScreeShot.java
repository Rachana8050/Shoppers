package programs;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class fbScreeShot {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.gecko.driver",
				"./Softwares/geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
        TakesScreenshot ts=(TakesScreenshot) driver;
        File src=ts.getScreenshotAs(OutputType.FILE);
        File dst=new File("C:\\Users\\rachana\\Pictures\\ScreenShot\\act.jpg");
        FileHandler.copy(src, dst);
	}

}
