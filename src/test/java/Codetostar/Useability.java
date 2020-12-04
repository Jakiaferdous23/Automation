package Codetostar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class Useability {
	
	public static WebDriver driver;
	@parameters({"browser","URI"})
  
  @BeforeClass
  
 public static void Driver(String browser,String uri)  {
		if(browser.equalsIgnoreCase("chrome")) {
			String director=System.getProperty("user.dir");
			System.out.println(director);

			System.setProperty("webdriver.chrome.driver", director +"\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(uri);
			
		} 
		else if(browser.equalsIgnoreCase("Firefox")) {
			String director=System.getProperty("user.dir");
			System.out.println(director);
			System.setProperty("webdriver.gecko.driver", director+"\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();	
			driver.get(uri);
			//driver.manage().window().maximize(); 
			
		}
}
}