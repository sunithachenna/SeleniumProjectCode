package week6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestDataInfo {
	
	public static String[][] readExcel(String sheetName) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook("./testdata/TestDataLeafApps.xlsx");
		XSSFSheet ws = wb.getSheet(sheetName);
		int noOfRows = ws.getLastRowNum();
		int noOfCols = ws.getRow(0).getLastCellNum();
		String[][] value = new String[noOfRows][noOfCols];
		for (int i = 1; i <= noOfRows; i++) {
			for (int j = 0; j < noOfCols; j++) {
				value[i-1][j] = ws.getRow(i).getCell(j).getStringCellValue();
			}
		}
		wb.close();
	return value;
}
}