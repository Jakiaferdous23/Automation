package dipti.Trainingselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practisemyself {

//how can i enter in to my facebook

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jakia\\eclipse-workspace\\Trainingselenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// go to facebook page
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		//click log in element /link
	/*	WebElement Element=driver.findElement(By.id("email"));
		//click on found element
		Element.click();
		//enter email address text field
		//find email address textbo
		Element=driver.findElement(By.id("email"));
		//enter tex jakiadipti@yahoo.com
		Element.sendKeys("jakiadipti@yahoo.com");
		//find passwd tashutobijakitan2311!
		driver.findElement(By.id("pass")).sendKeys("tashutobijakitan2311!");*/
		// log in facebook	
		
	
		// read the page
		/*WebElement  logout_button_text=driver.findElement(By.linkText("Log Out"));
		driver.findElement(By.)*/

	//CSS Selector identify
		//tag& ID
		//driver.findElement(By.cssSelector("#email")).sendKeys("jakiadipti@yahoo.com");OR
		//driver.findElement(By.cssSelector("input#email")).click();

	}

}
