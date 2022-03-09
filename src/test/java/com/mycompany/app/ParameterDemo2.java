package com.mycompany.app;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo2 {
@Test
@Parameters({"val1","val2"})
public void subtract(int v1, int v2)
	{
		int subtraction = v1-v2;
		System.out.println(subtraction);
	}
}
