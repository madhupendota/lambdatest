package mainFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import utils.summaryReport;

public class excelRead {
	static int reqRow;
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		XSSFWorkbook wb = null;
		XSSFSheet sheet = null;
		String sid="";
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		List<String> lst ;
		String scn="sc_002";
		Map<String, Map<String,String>> pMap = new HashMap<String, Map<String,String>>();
		Map<String,String> cMap = new HashMap<String, String>();

		fis = new FileInputStream(new File("E:/TestProject/Practice/xlFiles/excelRead.xlsx"));
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(0);
		Iterator<Row> itrtr = sheet.iterator();
		while(itrtr.hasNext()){
			Row row = itrtr.next();
			Iterator<Cell> cell =row.iterator();
			while(cell.hasNext()){
				Cell c = cell.next();
				if(c.getStringCellValue().equals(scn)){
					
					reqRow = c.getRowIndex();
					System.out.println("Req Row : "+reqRow);
				}
			}
		}
		
		Row row = sheet.getRow(reqRow-1);
			for(int k=0;k<row.getPhysicalNumberOfCells();k++){
			cMap.put(sheet.getRow(reqRow-1).getCell(k).getStringCellValue(), sheet.getRow(reqRow).getCell(k).getStringCellValue());
			pMap.put(scn, cMap);
		}
			System.out.println("Key Value +++"+pMap.get("sc_002").get("browser"));
			for(Map.Entry<String, Map<String, String>> entry : pMap.entrySet()){
				System.out.println(entry.getKey()+" : "+entry.getValue());
				System.out.println((entry.getValue()).get("browser"));
			}
		wb.close();
}
}
