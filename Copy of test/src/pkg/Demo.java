package pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo extends base {
	
//	@BeforeTest
//	public void bTest(){
//		System.out.println(":: Before Test ::");
//	}
	
	@Parameters({"username","password","password1"})
	@Test
	public void atTest(String uname,String pwd,String ss){
		System.out.println(uname+" "+pwd+" "+ss);
		System.out.println("++ At Test 1++");
		base b = new base();
		String s = b.extendClass();
		System.out.println(s);
//		testOnlyOnClass tes = New
	}
	@Parameters({"username","password","password1"})
	@Test
	public void atTest2(String uname,String pwd,String ss){
		System.out.println(uname+" "+pwd+" "+ss);
		System.out.println("++ At Test 2++");
	}
	public void dummyMethodWithoutTest(){
		System.out.println("++dummyMethodWithoutTest++");
	}
//	
//	@AfterTest
//	public void aTest(){
//		System.out.println(":: After Test ::");
//	}
//	
//	@BeforeClass
//	public void bClass(){
//		System.out.println(":: Before Class ::");
//	}
//	
//	@AfterTest
//	public void aClass(){
//		System.out.println(":: After Class ::");
//	}
//	
//	@BeforeMethod
//	public void bMethod(){
//		System.out.println(":: Before Method ::");
//	}
//	@AfterMethod
//	public void aMethod(){
//		System.out.println(":: After Method ::");
//	}

}
