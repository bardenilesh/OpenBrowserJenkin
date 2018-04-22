import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Open {
	static WebDriver driver;
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		try {	
			//Configuring the path of firefox Driver
			System.setProperty("webdriver.gecko.driver", "C:/Nilesh/ETLHive/Executables/geckodriver64.exe");
			
			//Creating an object of firefox driver
			driver= new FirefoxDriver();
			
			
			//driver= getChromeDriver();
			
			//Opening the URL in browser
			driver.get("https://www.phptravels.net");
			
			//Configure browser to wait for 30 seconds
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/ul/li[1]/a/i")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".open > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)")).click();
			
			//Explicit wait for 5 seconds
			Thread.sleep(5000);
			
			driver.quit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//			driver.quit();
		}
	}
	
	public static WebDriver getIEDriver(){
		//Configuring the path of IE Driver
		System.setProperty("webdriver.ie.driver", "C:/Nilesh/ETLHive/Executables/IEDriverServer64.exe");
//		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
//		caps.setCapability("ignoreZoomSetting", true);
		
		//Launching Internet Explorer Browser
		WebDriver drv= new InternetExplorerDriver();
		
		return drv;
		
	}
	
	public static WebDriver getChromeDriver(){
		//Configuring the path of IE Driver
		System.setProperty("webdriver.chrome.driver", "C:/Nilesh/ETLHive/Executables/chromedriver.exe");
//		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
//		caps.setCapability("ignoreZoomSetting", true);
		
		//Launching Internet Explorer Browser
		WebDriver drv= new ChromeDriver();
		
		return drv;
		
	}

}
