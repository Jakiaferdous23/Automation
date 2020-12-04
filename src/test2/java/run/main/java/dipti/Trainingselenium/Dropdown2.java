package dipti.Trainingselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {
//how can create a New account
	
	static RemoteWebDriver driver;
	

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jakia\\eclipse-workspace\\Trainingselenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement CreateAnAccount=driver.findElement(By.linkText("Create New Account"));
		CreateAnAccount.click();
		Thread.sleep(6000);
		WebElement Firstname=driver.findElement(By.name("firstname"));
		Firstname.sendKeys("Rithva");
		WebElement Lastname=driver.findElement(By.id("u_1_d"));
		Lastname.sendKeys("islam");
		WebElement Email=driver.findElement(By.id("u_1_g"));
		Email.sendKeys("jakiaferdous23@gmail.com");
		WebElement Reenteremail=driver.findElement(By.name("reg_email_confirmation__"));
		Reenteremail.sendKeys("jakiaferdous23@gmail.com");
		WebElement Password=driver.findElement(By.id("password_step_input"));
		Password.sendKeys("dipti123");
		
		WebElement birth=driver.findElement(By.name("birthday_month"));
		Select ob=new Select(birth);
		ob.selectByValue("9");
		//......
		WebElement day=driver.findElement(By.name("birthday_day"));
		Select di=new Select(day);
		di.selectByVisibleText("15");
		WebElement Year=driver.findElement(By.id("year"));
		Year.sendKeys("2004");
	WebElement Female=driver.findElement(By.name("sex"));
	Female.click();
	WebElement SignUp=driver.findElement(By.name("websubmit"));
	SignUp.click();
	
		

	
		
	}


	private static void click() {
		// TODO Auto-generated method stub
		
	}

}
