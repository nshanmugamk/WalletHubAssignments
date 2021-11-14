package com.assignment.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {	
	
	public static Object[][] getExcelData(String sheetName) throws IOException {
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\excel\\testdata.xlsx");
	XSSFWorkbook book = new XSSFWorkbook(fis);
	XSSFSheet sheet = book.getSheet(sheetName);
	XSSFRow row = null;
	XSSFCell cel = null;
	Map<String, String> map = null;

	
	row = sheet.getRow(0);
	String[] header = new String[row.getLastCellNum()];
	Object[][] data = new Object[sheet.getLastRowNum()][1];
	for(int j = row.getFirstCellNum(); j < row.getLastCellNum(); j++){
		cel = row.getCell(j);
		header[j] = cel.getStringCellValue();
	}
	
	for(int i = sheet.getFirstRowNum() + 1; i <= sheet.getLastRowNum(); i++){
		row = sheet.getRow(i);
		map = new LinkedHashMap<String, String>();
		for(int j = row.getFirstCellNum(); j < row.getLastCellNum(); j++){
			cel = row.getCell(j);
			
			DataFormatter dataformater = new DataFormatter();
			dataformater.formatCellValue(cel);				
			map.put(header[j], cel.getStringCellValue());
			}
		
		data[i-1][0] = map;
		
	}
	book.close();
	
	return data;
	

}
	
}