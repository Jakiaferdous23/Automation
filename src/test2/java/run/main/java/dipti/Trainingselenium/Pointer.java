package dipti.Trainingselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Pointer {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jakia\\eclipse-workspace\\Trainingselenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		Actions its=new Actions(driver);
		its.moveToElement(driver.findElement(By.xpath("//*[@id=\"a-page\"]/img[1]"))).build().perform();
		its.moveToElement(driver.findElement(By.xpath("//*[@id=\"a-page\"]/img[2]"))).click().build().perform();
		
		
		
		
		

	}
	}