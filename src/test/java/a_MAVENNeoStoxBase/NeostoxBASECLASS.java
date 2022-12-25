package a_MAVENNeoStoxBase;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NeostoxBASECLASS {
 protected WebDriver driver;
	public void launchbrowser1() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chrome driver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://neostox.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}

}
