package com.actitime.testscript;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import com.actitime.generic.BaseClass;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass{
  @Test
  public void createCustomer(){
	  Reporter.log("Create Customer", true);
	  Assert.fail();
	  }
  @Test
  public void modifyCustomer(){
	  Reporter.log("Modify Customer", true);
	  Assert.fail();
	  }
  @Test
  public void deleteCustomer(){
	  Reporter.log("Delete Customer", true);
	  Assert.fail();
	  }
}
