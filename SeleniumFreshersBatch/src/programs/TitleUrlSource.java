package programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TitleUrlSource 

{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver",
				"./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.hp.com/");
		Thread.sleep(2000);
		//String title=driver.getTitle();
		//System.out.println(title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//String srs=driver.getPageSource();
		//System.out.println(srs);
	}

}
