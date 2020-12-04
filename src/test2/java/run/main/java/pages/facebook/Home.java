package pages.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
public WebDriver driver;
	
		@FindBy(name = "jakiadipti@yahoo,com")
		WebElement emailfieldkeys;
		@FindBy(name = "pass")
		WebElement psswdfieldkeys;
		@FindBy(name= "login")
		WebElement sign;
		
		WebElement Forgot;
	public Home (WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
	}
		public Home(Webdriver driver) {
		// TODO Auto-generated constructor stub
	}
		public void emailofinput(String name){
			emailfieldkeys.clear();
			emailfieldkeys.sendKeys(name);
		}
		
			public void passwdoffield(String field) {
			psswdfieldkeys.sendKeys(field);
}
public void Signingin() {
	sign.click();

}
public void user() {
	// TODO Auto-generated method stub
	
}
public void Forgotlink() {
	Forgot.click();
	// TODO Auto-generated method stub
	
}
public void passwdofinput() {
	// TODO Auto-generated method stub
	
}
public void submit() {
	// TODO Auto-generated method stub
	
}
public void signingin() {
	// TODO Auto-generated method stub
	
}
}


