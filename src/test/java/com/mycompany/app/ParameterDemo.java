package com.mycompany.app;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo {
	@Test
	@Parameters({"val1","val2"})
	public void add(int v1,int v2)
	{
		int finalsum = v1+v2;
		System.out.println(finalsum);
	}
}
