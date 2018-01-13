package scenarios;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;

public class superMain {
	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		String cname = "sc_001";
		Class<?> c = null;
		try{
			c= Class.forName("scenarios."+cname);
			
		}catch(Exception e){
			e.printStackTrace();
		}
//		cname s = null;
//		sc_002 s = null;
			 c.newInstance();
			System.out.println("sc_002");
			
	}

}
