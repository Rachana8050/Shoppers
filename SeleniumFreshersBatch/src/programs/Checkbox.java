package programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver",
				"./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/rachana/Desktop/checkbox.html");
		Thread.sleep(2000);
		List<WebElement> check = driver.findElements(By.xpath("//input"));
		int count=check.size();
		System.out.println(count);
		/*for(int i=0;i<count;i++)
		{
			WebElement we=check.get(i);
			we.click();
            Thread.sleep(1000);
			
		}*/
		for(int i=count-1;i>=0;i--)
		{
			WebElement we=check.get(i);
			we.click();
            Thread.sleep(1000);
		}

	}

}
