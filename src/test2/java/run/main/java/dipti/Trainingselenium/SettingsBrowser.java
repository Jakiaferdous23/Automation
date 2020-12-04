package dipti.Trainingselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SettingsBrowser {

public static WebDriver driver;
	public static void main(String[] args)   {
		driver("chrome","https://www.facebook.com");
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\jakia\\eclipse-workspace\\Trainingselenium\\drivers\\geckodriver.exe");
		// FirefoxDriver driver = new FirefoxDriver();	
		// driver.manage().window().maximize(); 
		// driver.get("https://www.facebook.com");
	}
		
	public static void driver(String browser,String uri)  {
	if(browser.equalsIgnoreCase("chrome")) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jakia\\eclipse-workspace\\Trainingselenium\\drivers\\chromedriver.exe");
		//System.setProperty("Webdriver.chrome.driver", "director +\\\\driver\\\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(uri);
	 
	 driver.manage().window().maximize();
	} else if(browser.equalsIgnoreCase("Firefox")) {

	System.setProperty("webdriver.gecko.driver", "C:\\Users\\jakia\\eclipse-workspace\\Trainingselenium\\drivers\\geckodriver.exe");
	 FirefoxDriver driver = new FirefoxDriver();	
	 driver.manage().window().maximize(); 
	 driver.get(uri);
}else {
	System.out.println("wrong browser name");
	 
	 }
}
		
	}
	
		
	


