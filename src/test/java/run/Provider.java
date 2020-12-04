package run;

import org.testng.annotations.Test;

import pages.facebook.home;

import org.testng.annotations.DataProvider;

public class Provider extends Useability {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  home ob=new home(driver);
	  ob.emailofinput("jakiadipti@yahoo.com");
	  ob.psswrdoffield("dipti123");
	  ob.signingin();
	  ob.emailofinput("jakiadipti@yahoo.com");
	  ob.passwordoffield("do");
	  ob.signingin(); 
	  ob.emailofinput("jakiadipti@yahoo.com");
	  ob.psswrdoffield("do");
	  ob.signingin(); 
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "jakiadipti@yahoo.com", "Dipti1233" },
      new Object[] { "jakiaferdous@gmail.com", "bot" },
      new Object[] { "jakiaferdous@gmail.com", "hit" },
    };
  }
}
/*
*enter valid user name and invalid passward
*Enter invalid username and valid password
*Enter invalid username and invalid password
*/