package programs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Clear
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver",
				"./Softwares/geckodriver.exe");
		WebDriver driver=new  FirefoxDriver();
		driver.get("file:///C:/Users/rachana/Desktop/one.html");
		
		driver.findElement(By.id("a1")).clear();


		

	}

}
