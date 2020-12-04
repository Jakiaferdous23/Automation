import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

	public class forgotpassword {
	public WebDriver driver;
      @FindBy(id="identify_email")
	  WebElement search;


@FindBy(name="did_submit")
WebElement searchbutton;
@FindBy(xpath="//*[text()='Find your Account'])[2]")
WebElement FindYourAccounting;
	public  forgotpassword(WebDriver driver) {
		this.driver=driver;
		pageFactory.initElements(driver,this);
	}

	public void searchfielddemail(String name) {
		search.sendKeys(name);
		
}	
	public void buttonlk() {
		searchbutton.click();
	}
	public WebElement ForgotYouraccountText() {
		return FindYourAccounting;
		
	}
	
}	

