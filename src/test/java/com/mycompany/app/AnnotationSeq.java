package com.mycompany.app;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class AnnotationSeq {
	@Test
	public void a()
	{
		System.out.println("Hello TestNG");
	}
	@Test
	public void b()
	{
		Assert.assertEquals(true, false);
	}
}
