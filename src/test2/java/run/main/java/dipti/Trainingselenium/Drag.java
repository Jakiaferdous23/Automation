package dipti.Trainingselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {
// drag and drop
	public static void main(String[] args) throws InterruptedException  {
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\jakia\\eclipse-workspace\\Trainingselenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Actions it=new Actions(driver);
		Thread.sleep(7000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.switchTo().frame(0);
		WebElement sr=driver.findElement(By.id("draggable"));
		WebElement dr=driver.findElement(By.id("droppable"));
		it.dragAndDrop(sr,dr).build().perform();*/
		
		//what is iframe?
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jakia\\eclipse-workspace\\Trainingselenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Actions it=new Actions(driver);
		Thread.sleep(7000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.switchTo().frame(0);
		WebElement sr=driver.findElement(By.id("draggable"));
		WebElement dr=driver.findElement(By.id("droppable"));
		it.dragAndDrop(sr,dr).build().perform();
		}

}
