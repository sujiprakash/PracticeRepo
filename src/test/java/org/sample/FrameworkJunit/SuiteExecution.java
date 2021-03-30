package org.sample.FrameworkJunit;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//@RunWith(Suite.class)
//@SuiteClasses({AppTest.class,AppTest2.class})
public class SuiteExecution {

	@Test
	public void test123() {
		Result r=JUnitCore.runClasses(AppTest2.class,AppTest.class);
		System.out.println(r.getRunCount());
		System.out.println(r.getFailureCount());
		System.out.println(r.getRunTime());
		System.out.println(r.getIgnoreCount());
		
		
		List<Failure> f= r.getFailures();
		for (Failure failure : f) {
			System.out.println(failure);
		}
		
	}
}
