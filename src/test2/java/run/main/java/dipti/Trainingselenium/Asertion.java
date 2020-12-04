package dipti.Trainingselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Asertion {
	
	static WebDriver driver;
	
	public static <Create> void main(String[] args) {
		Driver("chrome","https://www.facebook.com");
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\jakia\\eclipse-workspace\\Trainingselenium\\drivers\\chromedriver.exe");
		//System.setProperty("Webdriver.chrome.driver", "director +\\\\driver\\\\chromedriver.exe");
		//driver=new ChromeDriver();
		//driver.get("https://www.facebook.com");
		//driver.manage().window().maximize();
	
		WebElement CreateNewAccount=driver.findElement(By.linkText("Create New Account"));		
		boolean button=CreateNewAccount.isDisplayed();
		System.out.println(button);
		// get the text
		WebElement ds=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/h2"));
		String testheader=ds.getText();
		System.out.println(testheader);
	}
	
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

	
	
	

