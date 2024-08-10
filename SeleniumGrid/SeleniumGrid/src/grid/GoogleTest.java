package grid;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {

	
	
	@Test
	public void HomePageCheck() throws MalformedURLException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("chrome");
		WebDriverManager.chromedriver().setup();
//		String driverExecutablePath = "C:\\DRIVERS\\chromedriver.exe";
//	   	System.setProperty("webdriver.chrome.driver", driverExecutablePath);
		//caps.setPlatform(Platform.);
//		caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//		caps.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		
		
		WebDriver driver = new RemoteWebDriver(new URL("http://10.0.0.83:4444"), caps);
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("rahul shetty");
		driver.close();
		
	
		
	}
}
