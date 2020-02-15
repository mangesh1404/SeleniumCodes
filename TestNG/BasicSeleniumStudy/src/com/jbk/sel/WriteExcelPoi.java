package com.jbk.sel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// prog. for write Excel sheet by poi xlsx format
public class WriteExcelPoi {
    
	public static void main(String[] args) throws IOException {
		int num=0;
    File file = new File("D:\\mangesh.xlsx");
    FileInputStream fis = new FileInputStream(file);
    		
    XSSFWorkbook wb = new XSSFWorkbook(fis);
    
    XSSFSheet sh = wb.createSheet("data");
    Row row=sh.createRow(num);
    row.createCell(1).setCellValue("Pass");
    row.createCell(2).setCellValue("Fail");

    //sh.getRow(1).createCell(4).setCellValue("Mangesh");
    FileOutputStream fout = new FileOutputStream(file);
    wb.write(fout);
    wb.close();
	}

}
