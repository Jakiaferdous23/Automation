package dipti.Trainingselenium;



import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Wind {

	



	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\jakia\\eclipse-workspace\\Trainingselenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Amazon.com");
		driver.manage().window().maximize();
		
		Actions its=new Actions(driver);
		its.moveToElement(driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-belt']/div[1]/div[2]/span[1]/a[1]"))).build().perform();
		its.moveToElement(driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-flyout-anchor']/div[8]/div[2]/a[1]/span[1]"))).click().build().perform();
		//window handle=when ever the browser is opening there is unique id associated with that browser session that id in selenium is knownas
		//window handle
	String parentWindowhandles=driver.getWindowHandle();
		//system.out.println(parentWindowHandles);
		its.keyDown(driver.findElement(By.id("createAccountSubmit")),Keys.LEFT_SHIFT).click().build().perform();
		its.keyUp(Keys.LEFT_SHIFT).build().perform();
		Set<String> MultpleWindows = driver.getWindowHandles();
		for(String window : MultpleWindows) {
			
	if
	( window.equalsIgnoreCase(parentWindowhandles)) {
		System.out.println("This to switch");
		
	}else {
		driver.switchTo().window(window);
		System.out.println("this is not switch");
	}
		}
	}
}



