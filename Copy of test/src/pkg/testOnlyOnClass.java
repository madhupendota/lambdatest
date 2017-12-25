package pkg;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testOnlyOnClass extends base{
	Map<String, String> pmap = new HashMap<String, String>();
	Iterator<Map.Entry<String, String>> it;
	@DataProvider(name="dp")
	public Iterator<Entry<String, String>> ss(){
//	Map<String, String> pmap = new HashMap<String, String>();
	pmap.put("browser","firefox");
	pmap.put("Scenario", "testOnlyOnClass");
	Iterator<Map.Entry<String, String>> it = pmap.entrySet().iterator();
	return it;
	
	}
//	@Test(dataProvider="dp")
//	public void test1(){
//		System.out.println("This is testOnlyOnClass-->1");
//		while(it.hasNext()){
//			Map.Entry<String, String> pair = it.next();
//			System.out.println(pair.getKey());
//		}
//		
//	}
	
	@Test
	public void test3(){
		System.out.println("This is testOnlyOnClass-->3");
	}
	@Test
	public void test2(){
		System.out.println("This is testOnlyOnClass-->2");
	}
	
}
