package pages.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForGotAccount {
	public WebDriver driver;
@FindBy(id="identify_email")
WebElement search;

@FindBy(name="did_submit")
WebElement searchbutton;
@FindBy(xpath="//*[@id=\"identify_yourself_flow\"]/div/div[1]/div/div[2]/h2")
WebElement FindYourAccounting;
public ForGotAccount (WebDriver driver){
	this.driver=driver;
PageFactory.initElements(driver, this);
}
public void searchfieldemail(String name) {
	search.sendKeys(name);
}
public void buttonlk() {
	searchbutton.click();
}
public WebElement ForGotYourAccountText() {
	return FindYourAccounting;
}
}
