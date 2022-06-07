package org.sample;

import java.util.Date;
import org.baseclass.BaseClass;
import org.pompages.PHPFlight;
import org.pompages.PHPtravelDemo;
import org.testng.annotations.*;

public class PhpTravel extends BaseClass{
	
	@BeforeClass
	private void beforeClass() {
		System.out.println("BeforeClass");	
	}
	@AfterClass
	private void afterClass() {
		System.out.println("AfterClass");
	}
	@BeforeMethod
	private void beforeMethod() {
		Date d=new Date();
		System.out.println("Start Time "+d);
	}
	@AfterMethod
	private void afterMethod() {
		Date d=new Date();
		System.out.println("Start Time "+d);
	}
	@Test
	private void test1() throws InterruptedException {

		browserLaunch("chrome");
		urlLaunch("https://phptravels.com/demo/");
		PHPtravelDemo p=new PHPtravelDemo();
		p.Demosite();
	}
	@Test
	private void test2() {
		PHPFlight pf=new PHPFlight();
		pf.Flight();
	}
}
