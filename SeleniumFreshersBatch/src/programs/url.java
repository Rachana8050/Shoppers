package programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class url {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver",
				"./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        String title=driver.getTitle();
        System.out.println(title);
        
	}

}
