package com.mycompany.app;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderDemo {
  @Test(dataProvider = "dp")
  public void mytest(String s)
  {
	  System.out.println("passed parameter is "+s);
  }

  @DataProvider
  public Object[][] dp() {
    return new  Object[][]{
       new Object[] {"a"},
       new Object[] {"b"},
       new Object[] {"c"},
       new Object[] {"d"}
    };
  }
}
