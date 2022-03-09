package com.mycompany.app;

import org.testng.annotations.Test;
import org.testng.Assert;

public class Dataprovider_Abstraction {
//  @Test(dataProvider = "dp" , dataProviderClass = NewTest.class , retryAnalyzer = RetryAnalyzer.class)
  @Test(dataProvider = "dp" , dataProviderClass = NewTest.class)
  public void f(Integer a, Integer b, Integer c)
  {
	  Integer sum = a+b;
	  Assert.assertEquals(c, sum);
  }

}
