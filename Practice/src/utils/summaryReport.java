package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class summaryReport {

//	public static void main(String[] args) throws IOException {
		public void genSumReport() throws IOException {
		int i =1;
		 Writer writer;
		 String fname;
		 String fileName = "E:/TestProject/Practice/SummaryReport.html";
		 File file= new File(fileName);
		 int passCnt = 0, failCnt = 0;
//		public static void generateReport(String scId,String Desc,String result) throws IOException {
//		 	FileReader fr  = new FileReader(new File("E:/TestProject/Practice/summaryreport.txt"));
//			BufferedReader br = null;
//			String line = "";
//			br = new BufferedReader(fr);
//			file.delete();
		 
				if(file.exists()){
					file.delete();
				}
					file.createNewFile();
				writer = new FileWriter(file,true);
				writer.write("<html>");
				writer.write("<body>");
				writer.write("<div class='header' style='color:#0000FF'>");
				writer.write("<h3 align='center'>Summary Report</h3>");
				writer.write("</div>");
				writer.write("<table class='header' align='center' border='1' cellpadding='10' cellspacing='1' bgcolor='#FFFFFF'><tbody>");
				writer.write("<tr><td>URL: </td><td>Browser: </td></tr>");
				writer.write("<tr><td>Build#: </td><td>OS: </td></tr>");
				writer.write("<tr><td>StartTime#: </td><td>EndTime: </td></tr>");
				writer.write("</tbody></table><br><br>");
				writer.write("<table align='center' border='1' cellpadding='10' cellspacing='1' bgcolor='#D2E6D1'><tbody><th>Sl_No</th><th>Scenario_ID</th>");
				writer.write("<th>Result</th>");
//				while((line=br.readLine())!=null){
//					String[] str = line.split(",");
		
				File folder = new File("E:/TestProject/Practice/csv/");
				 File[] listOfFiles = folder.listFiles();
				 
				for (int j = 0; j < listOfFiles.length; j++,i++) {
				      if (listOfFiles[j].isFile()) {
				         
				        fname = listOfFiles[j].getName();
				        System.out.println("File " + fname);
				        String reportOut = Reporter.report(fname);
				        System.out.println("reportOut :" +reportOut);
				        String reportFile = reportOut.split("__")[0];
				        String flagS = reportOut.split("__")[1];
				        String bg,Flag,img ;
				        if(flagS.equals("true")){
				        	bg = "#00FF00";
//				        	Flag = "PASS";
				        	img = "E:/TestProject/Practice/images/pass.png";
				        	passCnt++;
				        }else{
				        	bg = "#FF0000";
//				        	Flag = "FAIL";
				        	img = "E:/TestProject/Practice/images/fail.png";
				        	failCnt++;
				        }
				        fname = fname.replace(".txt","");
				        writer.write("<tr align='center'><td>"+i+"</td><td><a href="+reportFile+" target=_blank>"+fname+"</a></td><td><img src="+img+" height='25' width='25'/></td></tr>");
				        //><img src='E:/TestProject/Practice/images/pass.png' height='25' width='25'> 
				    }
				 }
				
//				i++;
//				}
				writer.write("</tbody></table>");
				writer.write("<p align='center' style='color:#819C4C'>Total # of Cases Passed :<span style='color:#00FF00;font-weight:bold'>"+passCnt+"</span></p>");
				writer.write("<p align='center' style='color:#819C4C'>Total # of Cases Failed :<span style='color:#FF0000;font-weight:bold'>"+failCnt+"</span></p>");
				writer.write("</body></html>");
				writer.flush();
				writer.close();
				
//			
			
		}
}