package run;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Useability {
	public WebDriver driver ;
	@parameters({"browser","URI"})
	@beforeClass 
	public void beforeClass(String browser,String site, String director) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			 director=System.getProperty("user.dir");
			 System.out.println();

			 System.setProperty("webdriver.chrome.driver", director +"\\drivers\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.get(site);

		} 
				else if(browser.equalsIgnoreCase("Firefox")) {
					String director1=System.getProperty("user.dir");
					System.out.println(director1);
					System.setProperty("webdriver.gecko.driver", director1+"\\drivers\\geckodriver.exe");
					driver = new FirefoxDriver();	
					driver.get(site);
					//driver.manage().window().maximize(); 
					
				}
			  }

@AfterClass
public void afterClass() {
	driver.quit();
	}
	
	 
		  }

		 
