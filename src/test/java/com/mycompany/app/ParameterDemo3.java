package com.mycompany.app;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo3 {

	@Test
	@Parameters({"val1", "val2"})
	public void a(int v1 , int v2)
	{
		int multiplication = v1*v2;
		System.out.println(multiplication);
	}
	
	@Test
	@Parameters("message")
	public void op(@Optional("optional parameter selected") String message)
	{
		System.out.println(message);
	}
}
