package mainFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import utils.summaryReport;

public class getScenarios {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		XSSFWorkbook wb = null;
		XSSFSheet sheet = null;
		
		try{
		fis = new FileInputStream(new File("E:/TestProject/Practice/xlFiles/ScenariosList.xlsx"));
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(0);
		Iterator<Row> itrtr = sheet.iterator();
		Class clsArr[] = { };
		Class<?> cls = null;
		Object obj = null;
		Object ob[] = { };
		Method m = null;
		while(itrtr.hasNext()){
			Row row = itrtr.next();
			Iterator<Cell> itr = row.cellIterator();
			while(itr.hasNext()){
				Cell cell = itr.next();
				String cellValue = cell.getStringCellValue().trim();
				System.out.println("scenario Id "+cellValue);
				if(!(cellValue.equals("Scenario_Id"))){
					try{
						
						cls = Class.forName("scenarios."+cellValue);
						obj = cls.newInstance();
						m = cls.getDeclaredMethod("executeScript",null);
						m.invoke(obj, null);
					
					}catch(Exception e){
							e.printStackTrace();
					}
				}
			}
		}
//		wb.close();
		}
		
	catch(Exception e){
		e.printStackTrace();
	}finally{
		wb.close();
		summaryReport sumReport = new summaryReport();
		sumReport.genSumReport();
	}

}
}
