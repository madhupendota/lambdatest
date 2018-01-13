package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Reporter {
//	public static void main(String[] args) throws IOException{
//	boolean globalFlag  = true;
		public static String report(String txtfileName) throws IOException{
	 int i =1;
	 Writer writer;
	 String fileName = "";//"Reporter_123.html";
	 File file = null;//new File(fileName);;
	 String folderPath = "E:/TestProject/Practice/csv/";
	 String nonCsvfolderPath = "E:/TestProject/Practice/";
	 Double num = Math.random();
	 boolean globalFlag = true;
	 
	 
//	public static void generateReport(String scId,String Desc,String result) throws IOException {
	 System.out.println("txtfileName"+txtfileName);
	 	FileReader fr  = new FileReader(new File(folderPath+txtfileName));
		BufferedReader br = null;
		String line = "";
		br = new BufferedReader(fr);
		
		
		Date d = new Date();
		SimpleDateFormat s = new SimpleDateFormat("MM-dd-YYYY-hh-mm-ss");
		String dateFormat = s.format(d);
//		System.out.println("txtfileName.split()[0] "+txtfileName.split("."));
//		fileName = "Reporter_"+dateFormat+num+".html";
		fileName = (txtfileName+".html").replace(".txt","");;
		System.out.println("filename "+fileName);
		file = new File("E:/TestProject/Practice/"+fileName);
		
		try{
//			for(File f:new File(nonCsvfolderPath).listFiles()){
//				if(f.getName().startsWith("Reporter_")){
//					f.delete();
//				}
//			}
			if(file.exists()){
				file.delete();
			}else{
				file.createNewFile();
			}
			writer = new FileWriter(file,true);
			writer.write("<html>");
			writer.write("<body>");
			writer.write("<div class='header'>");
			writer.write("<h3 align='center'>Detailed Report</h3>");
			writer.write("</div>");
//			writer.write("<h1>Total Cases Passed</h1>");
			writer.write("<table align='center' border='1' cellpadding='10' cellspacing='1'><tbody><th>Sl_No</th><th>Scenario_ID</th>");
			writer.write("<th>Description</th>");
			writer.write("<th>Result</th>");
			while((line=br.readLine())!=null){
				String[] str = line.split(",");
				String bgColor ;
				boolean isFail = false;
//				globalFlag = true;
				if(str[2].toUpperCase().trim().equals("FAIL")){
					isFail = true;
					globalFlag = false;
					bgColor = "#FF0000";
				}else{
					bgColor = "#00FF00";
//					globalFlag = true;
					isFail = false;
				}
			writer.write("<tr align='center'><td>"+i+"</td><td>"+str[0]+"</td><td>"+str[1]+"</td><td bgcolor="+bgColor+">"+str[2].toUpperCase().trim()+"</td></tr></tbody>");
			i++;
			}
			writer.write("</table>");
//			writer.write("<h1>Total Cases Passed</h1>");
			writer.write("</body></html>");
			writer.flush();
			writer.close();
			
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println(nonCsvfolderPath+fileName+"$"+globalFlag);
		return nonCsvfolderPath+fileName+"__"+globalFlag;
	}
		
}
//	public static void createReport(){
//		String folderPath = "E:/TestProject/Practice/";
//		Date d = new Date();
//		SimpleDateFormat s = new SimpleDateFormat("MM-dd-YYYY-hh-mm-ss");
//		String dateFormat = s.format(d);
////		String fileName = "Reporter_"+dateFormat+".html";
////		String fileName = "Reporter_123.html";
//		System.out.println("filename "+fileName);
////		File file = new File(folderPath+fileName);
//		try{
//			if(file.exists()){
//				file.delete();
//			}else{
//				file.createNewFile();
//			}
//			writer = new FileWriter(file,true);
//			writer.write("<html>");
//			writer.write("<body>");
//			writer.write("<h3 align='center'>Automation Report</h3>");
//			writer.write("<table align='center' border='1' cellpadding='10' cellspacing='1'><tbody><th>Sl_No</th><th>Scenario_ID</th>");
//			writer.write("<th>Description</th>");
//			writer.write("<th>Result</th>");
//			writer.flush();
//		}catch(Exception e){
//			
//	}
//	
//}
//}

