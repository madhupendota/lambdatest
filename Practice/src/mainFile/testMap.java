package mainFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class testMap {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		XSSFWorkbook wb = null;
		XSSFSheet sheet = null;
		String sid="",val="";
		Map<String, Map<String,String>> pMap = new HashMap<String, Map<String,String>>();
		List<String> lst ;
		Map<String,String> cMap = new HashMap<String, String>();
		
		String head ;
		String vl;
//		Row row ;
		

		fis = new FileInputStream(new File("E:/TestProject/Practice/xlFiles/excelRead.xlsx"));
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(0);
		
		Iterator<Row> itrtr = sheet.iterator();
		Cell cell;
//		for (int j=0; j<=1; j++) {
		Row row = sheet.getRow(0);
			for(int k=0;k<row.getPhysicalNumberOfCells();k++){
//				head = new String[row.getPhysicalNumberOfCells()];
//				vl = new String[row.getPhysicalNumberOfCells()];
//				if(j==0)
//					head[k]=row.getCell(k).getStringCellValue();
//				else
//					vl[k]=row.getCell(k).getStringCellValue();
//			}
			cMap.put(sheet.getRow(0).getCell(k).getStringCellValue(), sheet.getRow(1).getCell(k).getStringCellValue());
		}
		
		
		
		for(Map.Entry<String, String> entry : cMap.entrySet()){
			System.out.println(entry.getKey()+" : "+entry.getValue());
			
		}
wb.close();
}
}
