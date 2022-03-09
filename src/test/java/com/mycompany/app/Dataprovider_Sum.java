package com.mycompany.app;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class Dataprovider_Sum {
  @Test(dataProvider = "dp")
  public void f(int a, int b, int c)
  {
	  int sum = a+b;
	  Assert.assertEquals(c, sum);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, 2, 3 },
      new Object[] { 2, 4, 9 },
      new Object[] { 2, 8, 9 },
      new Object[] { 3, 4, 7 },
    };
  }
}
