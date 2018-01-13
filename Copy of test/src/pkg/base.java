package pkg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class base {
	
	@BeforeTest
	public void bTest(){
		System.out.println(":: Before Test ::");
		System.out.println(":: Before Test Modify::");
		System.out.println(":: ++++:");
	}
	

	@AfterTest
	public void aTest(){
		System.out.println(":: After Test ::");
	}
	
	@BeforeClass
	public void bClass(){
		System.out.println(":: Before Class ::");
	}
	
	public String extendClass(){
		return "simpleString";
	}
	
	@AfterClass
	public void aClass(){
		System.out.println(":: After Class ::");
	}
	@BeforeMethod
	public void a1Class(){
		System.out.println(":: Before Method ::");
	}
	@AfterMethod
	public void a2Class(){
		System.out.println(":: After Method ::");
	}

}
