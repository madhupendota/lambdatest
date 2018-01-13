package utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Csv {
	static String  fileName;
	static File file;
	static Writer writer;
	public void csvFile(String fileName) throws IOException{
		try{
		this.fileName = fileName;
		System.out.println("File Name in CSV Class "+fileName);
		file = new File("E:/TestProject/Practice/csv/"+fileName);
		System.out.println("file.exists()"+file.exists());

		if(file.exists()){
			System.out.println("file deleted");
			file.delete();
			file.createNewFile();
		}else{
			
			file.createNewFile();
			
		}
		}catch(Exception e){
			System.out.println(e);
		}
	}
	public void appendText(String s1,String s2,String s3) throws IOException{
//		String sc = "Demo_001";
//		String folder = "E:/TestProject/Practice/";
//		String fileName = null;
//		Date d = new Date();
//		SimpleDateFormat s = new SimpleDateFormat("MM-dd-YYYY-hh-mm-ss");
//		String dateFormat = s.format(d);
////		fileName = folder+sc+"_"+dateFormat+".txt";
//		fileName = folder+sc+".txt";
//		file = new File("E:/TestProject/Practice/csv/sc_001.txt");
		writer = new FileWriter(file,true);
		writer.write(s1+","+s2+","+s3);
		writer.append(System.getProperty("line.separator"));
//		writer.write("Enter Password,Successfully Entered Password,PASS");
//		writer.append(System.getProperty("line.separator"));
//		writer.write("Click Login,Successfully Clicked Login,PASS");
		writer.flush();
//		writer.close();
		
	}
	public void close() throws IOException{
		writer.flush();
		writer.close();
	}
}
