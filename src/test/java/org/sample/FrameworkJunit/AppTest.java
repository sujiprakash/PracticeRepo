package org.sample.FrameworkJunit;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;

public class AppTest{
	
	@BeforeClass
	public static void ClassStart() {
		System.out.println("Launching browser");
		System.out.println("class started");
		System.out.println("class started");
		System.out.println("class started");

	}
	
	@AfterClass
	public static void ClassEnd() {
		System.out.println("Closing browser");
		System.out.println("class ended");
	}
	
	@Before
	public void startTime() {
		Date d =new Date();
		System.out.println("Start time:"+d);
	}
	
	
	@Test
	public void tc1() {
		System.out.println("Test case 1");
		int age=20;
		int a=20;
		
		Assert.assertTrue("Verify age",true);
		Assert.assertEquals("Verify age", age, a);
		System.out.println("age verified");
		
	}
		
	@Ignore
	@Test
	public void tc2() {
		System.out.println("Test case 2");
	}
	
	@Test
	public void tc3() {
		System.out.println("Test case 3");
	}
	@After
	public void endTime() {
		Date d =new Date();
		System.out.println("End time:"+d);
	}
}