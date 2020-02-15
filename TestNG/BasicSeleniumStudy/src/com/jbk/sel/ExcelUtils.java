package com.jbk.sel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public static String getData(String sheetName, int row, int col) throws Exception {
		File f = new File("D:\\ExcelSheet\\login..xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh= wb.getSheet(sheetName);
		String Data= sh.getRow(row).getCell(col).getStringCellValue();
		return Data ;
	}
	
	
	/* You can use above code your project as follows
	 * 
	 * ExcelUtils.getData("sheet_Name,int Row_Num, int Col_Num)
	 */
	
	
	
}
