package run;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.facebook.home;

public class Functions extends Useability {


@Test(priority =2,dependsOnMethods="g")
public void f() {
	  // open the facebook site and varify the log in function.
	  home ob=new home(driver);
	  ob.emailofinput("jakiadipti@yahoo.com");
	  ob.psswdfieldkeys("dipti123");
	  ((home) ob).signingin();
	  ob.emailofinput("jakiadipti@yahoo.com");
	  ob.psswdfieldkeys("do");
	  ob.signingin();
	  
	}
	@Test(priority=1)
	public void g() {
		System.out.print("g");
		driver.findElement(By.linkText("di"));
	}
	}	



