package com.mycompany.app;

import org.testng.annotations.DataProvider;

public class NewTest {
	  @DataProvider
	  public Object[][] dp() {
	    return new  Object[][]{
	       new Object[] {1,2,3},
	       new Object[] {2,3,5},
	       new Object[] {4,4,8},
	       new Object[] {5,5,11}
	    };
	  }
}
