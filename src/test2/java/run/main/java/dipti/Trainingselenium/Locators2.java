package dipti.Trainingselenium;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	

	

	public static void main(String[] args) throws InterruptedException
 {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jakia\\eclipse-workspace\\Trainingselenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(6000);
		driver.get("https://www.Facebook.com");
		driver.manage().window().maximize();
		//click log in element /link
				WebElement Element=driver.findElement(By.id("email"));
				//click on found element
				Element.click();
				//enter email address text field
				//find email address textbo
				Element=driver.findElement(By.id("email"));
				//enter tex jakiadipti@yahoo.com
				Element.sendKeys("jakiadipti@yahoo.com");
				//find passwd tashutobijakitan2311!
				driver.findElement(By.id("pass")).sendKeys("tashutobijakitan2311!");
				// log in facebook	
				driver.findElement(By.id("u_0_b")).click();
				driver.findElement(By.xpath("//*[@id=\"u_0_h\"]/div[3]/a"));
				driver.findElement(By.id("mount_0_0")).click();
		
		
 }
}
 
