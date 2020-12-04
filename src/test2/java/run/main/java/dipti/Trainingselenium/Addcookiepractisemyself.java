package dipti.Trainingselenium;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addcookiepractisemyself {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jakia\\eclipse-workspace\\Trainingselenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.sephora.com");
		driver.manage().window().maximize();
		driver.manage().addCookie(new Cookie("Key", "value"));
		

	}

}
