package scenarios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;

import utils.Reporter;
import utils.summaryReport;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String sc = "Demo_001";
		String folder = "E:/TestProject/Practice/";
		String fileName = null;
		Date d = new Date();
		SimpleDateFormat s = new SimpleDateFormat("MM-dd-YYYY-hh-mm-ss");
		String dateFormat = s.format(d);
//		fileName = folder+sc+"_"+dateFormat+".txt";
		fileName = folder+sc+".txt";
		Writer writer = new FileWriter(fileName,true);
		writer.write("Enter UserName,Successfully Entered UserName,PASS");
		writer.append(System.getProperty("line.separator"));
		writer.write("Enter Password,Successfully Entered Password,PASS");
		writer.append(System.getProperty("line.separator"));
		writer.write("Click Login,Successfully Clicked Login,PASS");
		writer.flush();
		writer.close();
		
		//summaryReport.genSumReport();
	}

}
