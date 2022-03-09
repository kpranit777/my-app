package com.mycompany.app;

import org.testng.annotations.Test;

public class PriorityDemo {
	@Test
	public void a()
	{
		System.out.println("a");
	}
	
	@Test(groups = "b")
	public void b()
	{
		System.out.println("b");
	}
	
	@Test(enabled = false, groups = "c")
	public void c()
	{
		System.out.println("c");
	}
	
	@Test
	public void d()
	{
		System.out.println("d");
	}
}
