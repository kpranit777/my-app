package com.mycompany.app;

import org.testng.annotations.Test;

public class Parallel_Test_Thread1 {
  @Test
  public void f1()
  {
	  System.out.println(Thread.currentThread().getId());
  }
}
