package week6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
public static void main(String[] args) throws IOException {
	//locate the excel
	XSSFWorkbook wb = new XSSFWorkbook("./testdata/Lead.xlsx");
	//locate the sheet
	XSSFSheet ws = wb.getSheet("CreateLead");
	//locate the row and cell data
	int lastRowNum = ws.getLastRowNum();
	int lastCellNum = ws.getRow(0).getLastCellNum();
	for (int i = 1; i <= lastRowNum; i++) {
		for (int j = 0; j < lastCellNum; j++) {
			 String value = ws.getRow(i).getCell(j).getStringCellValue();
			System.out.println(value);
			
		}
		
	}
	wb.close();
}
}
