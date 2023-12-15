package programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazonpgm {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver",
				"./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		List<WebElement> hf = driver.findElements(By.xpath("//a"));//("//a")
		for(WebElement a:hf)
		{
		   System.out.println(a.getAttribute("href"));
			 //System.out.println(a.getAttribute("src"));
		    
		}

	}

}
