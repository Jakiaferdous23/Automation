package pages.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class home {
public WebDriver driver;
	@FindBy(name = "email")
	WebElement emailfieldkeys;
	@FindBy(name = "pass")
	WebElement psswdfieldkeys;
	@FindBy(name= "login")
	WebElement sign;
	@FindBy (linkText ="Forgot account?")
	WebElement Forgot;
	public home (WebDriver driver){
	this.driver=driver;
PageFactory.initElements(driver, this);
	}
	public void emailofinput(String name) {
		WebDriverWait it=new WebDriverWait(driver,10);
		it.until(ExpectedConditions.presenceOfElementLocated(By.name("email")));
		emailfieldkeys.clear();
	emailfieldkeys.sendKeys("name");	
		
	}
		




public void psswrdoffield(String field) {
	WebDriverWait it=new WebDriverWait(driver,10);
	it.until(ExpectedConditions.presenceOfElementLocated(By.name("pass")));
	psswdfieldkeys.sendKeys(field);
	
}
public void signingin() {
	sign.click();
	
}
public void Forgotlink() {
	Forgot.click();
	
}
public void passwordoffield(String string) {
	// TODO Auto-generated method stub
	
}
public void signingin1() {
	// TODO Auto-generated method stub
	
}
public void signingin11() {
	// TODO Auto-generated method stub
	
}
public void psswdfieldkeys(String string) {
	// TODO Auto-generated method stub

	
}
}
