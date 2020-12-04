package run;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.facebook.Home;

public class Functions {
public WebDriver driver;

@Test
public void f() {
	  // open the facebook site and varify the log in function.
	  Home ob=new Home(driver);
	  ob.emailofinput("jakiadipti@yahoo.com");
	  ob.passwdoffield("dipti123");
	  ob.Signingin();
	  ob.emailofinput("jakiadipti@yahoo.com");
	  ob.passwdoffield("do");
	  ob.signingin();
	  ob.signingin();
}
	  @BeforeClass
		public void beforeClass() {
		Driver("Chrome", "https://www.facebok.com");


}
	private void Driver(String string, String string2) {
		// TODO Auto-generated method stub
		
	}	
}

}
