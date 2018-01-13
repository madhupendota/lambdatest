package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		SimpleDateFormat s = new SimpleDateFormat("MM:dd:YYYY_hh:mm:ss");
		String t = s.format(d);
		System.out.println(t);
	}

}
