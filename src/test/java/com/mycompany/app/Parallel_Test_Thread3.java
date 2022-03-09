package com.mycompany.app;

import org.testng.annotations.Test;

public class Parallel_Test_Thread3 {
  @Test
  public void f3()
  {
	  System.out.println(Thread.currentThread().getId());
  }
}
