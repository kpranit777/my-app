package com.mycompany.app;

import org.testng.annotations.Test;

public class Parallel_Test_Thread2 {
  @Test
  public void f2()
  {
	  System.out.println(Thread.currentThread().getId());
  }
}
