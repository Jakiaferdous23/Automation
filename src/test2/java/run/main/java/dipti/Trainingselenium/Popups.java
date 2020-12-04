package dipti.Trainingselenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Popups 



{

	


	

	public static void main(String[] args) throws InterruptedException, IOException {
		//TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jakia\\eclipse-workspace\\Trainingselenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qatarairways.com/en-us/homepage.html");
		driver.manage().window().maximize();
		/*WebElement sb=driver.findElement(By.name("submit"));
		sb.click();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();*/
		//driver.switchTo().alert().dismiss();
		
	//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		Thread.sleep(6000);
		driver.findElement(By.id("cookie-close")).click();
		WebElement dts1=driver.findElement(By.id("T7-departure_1"));
		dts1.click();
		driver.findElement(By.xpath("/html/body/div[9]/div[3]/div[2]/table/tbody/tr[5]/td[4]")).click();
		
		//take a screen shot
	File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileHandler.copy( shots, new File("C:\\Users\\jakia\\eclipse-workspace\\Trainingselenium\\drivers\\pictures\\Airlines.png"));
	

	}
}
	
		
	


