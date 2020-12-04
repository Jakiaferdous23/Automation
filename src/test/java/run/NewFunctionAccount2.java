package run;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.facebook.ForGotAccount;
import pages.facebook.home;

public class NewFunctionAccount2 extends Useability {
	//3rd test executed annotaion 
  @Test
  public void f() {
	  
	  home ob=new home(driver);
	  ob.emailofinput("jakiadipti@yahoo.com");
	  ob.passwordoffield("dipti123");
	  ob.signingin();
	  ob.emailofinput("jakiadipti@yahoo.com");
	  ob.passwordoffield("do");
	  ob.signingin();
	  
  
  
  }
  @Test
public void ForgotlinkForGotAccount() {
	  home it=new home(driver);
	  it.Forgotlink();
	  ForGotAccount pa=new ForGotAccount(driver);
	  SoftAssert gt=new SoftAssert();
	  String Forgoturtext=pa.ForGotYourAccountText().getText();
	  System.out.println(Forgoturtext);
	  gt.assertEquals(Forgoturtext, "Find Your Account");
	  Assert.assertEquals(Forgoturtext, "Find Your Account");
	  pa.searchfieldemail("jakiadipti@yahoo.com");
	  
	  pa.buttonlk(); 
	  gt.assertAll();
  }
  // first executed annotation,before class executed one times

	  
	  
  }
//five executed annotaion. this is also executed onetime
  


	
	
		
	


 
	
		  
  


