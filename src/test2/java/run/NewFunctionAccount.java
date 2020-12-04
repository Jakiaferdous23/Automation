package run;

import pages.facebook.Home;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class NewFunctionAccount {
	
	public static WebDriver driver;
	//3rd test executed annotaion 
  @Test
  public void f() {
	  // open the facebook site and varify the log in function.
	  Home ob=new Home(driver);
	  ob.emailofinput("jakiadipti@yahoo.com");
	  ob.passwdoffield("dipti123");
	  ob.Signingin();
	  ob.emailofinput("jakiadipti@yahoo.com");
	  ob.passwdoffield("do");
	  ob.signingin();
  }
  @Test
  public void Forgotlinkforgotpassword() {
	  // go to facebook and verify forgot password
	  Home it=new Home(driver);
	  it.Forgotlink();
	  Forgot_password ds=new Forgot_password(driver);
	  ds.searchfieldemail("jakiadipti@yahoo.com");
	  ds.buttonlk();
  }
  // first executed annotation,before class executed one times
  @BeforeClass
  			public void beforeClass() {
	  		Driver("Chrome", "https://www.facebok.com");
	  
	  
  }
//five executed annotaion. this is also executed onetime
  @AfterClass
  public void afterClass() {
	// driver.close();
	 
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
@Test
public void f6() {
	System.out.println("Annotation is test");
	 
	 }
}
		
	
	
		
	


 
	
		  
  


