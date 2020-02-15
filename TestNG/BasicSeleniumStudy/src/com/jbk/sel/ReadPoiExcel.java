package com.jbk.sel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadPoiExcel {

	public static void main(String[] args)throws Exception {
		File f = new File("D:\\login.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh= wb.getSheet("m");
		int r = sh.getLastRowNum();
		int c= sh.getPhysicalNumberOfRows();
		for(int i=0;i<=r-1;i++) {
			for(int j=0;j<=c;j++) {
				System.out.print(sh.getRow(i).getCell(j).getStringCellValue()+"  ");
			}
			System.out.println();
		}
		wb.close();
		
	}
	}
