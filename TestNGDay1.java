package org.sample;

import java.util.Date;

import org.testng.annotations.*;

public class TestNGDay1 {
	
	@BeforeClass
	private void beforeClass() {
		System.out.println("Before Class");
	}
	@AfterClass
	private void afterClass() {
		System.out.println("After Class");
	}
	@BeforeMethod
	private void beforeMethod() {
		Date d=new Date();
		System.out.println("Start Time" + d);
	}
	@AfterMethod
	private void afterMethod() {
		Date d=new Date();
		System.out.println("End Time" + d);
	}
	@Test(priority=-5,enabled=false)
	private void test1() {
		System.out.println("test1");
	}
	@Test(priority=3,invocationCount=5)
	private void test2() {
		System.out.println("test2");
	}
	@Test(priority=-2)
	private void test3() {
		System.out.println("test3");
	}

}
