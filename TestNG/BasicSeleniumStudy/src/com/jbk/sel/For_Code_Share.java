package com.jbk.sel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;


public class For_Code_Share {
	public static WebDriver driver;
	public static XSSFWorkbook workbook;
	public static XSSFSheet worksheet;
    public static void main(String[] args)throws Exception {
    	
    	
    	// Code for JXL Reading
	FileInputStream fis = new FileInputStream("D:\\login.xls");
	Workbook wb = Workbook.getWorkbook(fis);
	Sheet sh = wb.getSheet("m");
	int rows = sh.getRows();
	int col = sh.getColumns();
		for(int i=0;i<=rows-1;i++) {
		   for(int j=0;j<=col-1;j++) {
			Cell cell = sh.getCell(j, i);
			System.out.print(cell.getContents()+"  ");
		}}
	      
		         // code for JXL Write
		WritableWorkbook mywork = null;
			mywork = Workbook.createWorkbook(new File(" "));
			WritableSheet excelSheet = mywork.createSheet("Sheet1",0);
			Label lable = new Label (0,0,"Test count");
			excelSheet.addCell(lable);
			Number num = new Number(0,1,1);
			excelSheet.addCell(num);
			Label lab = new Label (1,0,"Result");
			excelSheet.addCell(lab);
			Label lable1 = new Label (1,1,"passed");
			excelSheet.addCell(lable1);
			Number num1 = new Number(0,2,2);
			excelSheet.addCell(num1);
			Label lable2 = new Label (1,2,"passed 2");
			excelSheet.addCell(lable2);
			mywork.write();
			
			
			// Code for XLSX Read (POI)
			FileInputStream fileInputStream= new FileInputStream("D:\\login.xlsx"); //Excel sheet file loc
	        workbook = new XSSFWorkbook (fileInputStream); //get my workbook 
	        worksheet=workbook.getSheet("m");// get my sheet from workbook
	        XSSFRow Row=worksheet.getRow(0);     //get my Row which start from 0   
	        int RowNum = worksheet.getPhysicalNumberOfRows();// count my number of Rows 
	        int ColNum= Row.getLastCellNum(); // get last ColNum 
	            for(int i=0; i<RowNum-1; i++) { //Loop work for Rows
	                XSSFRow row= worksheet.getRow(i);
	                for (int j=0; j<ColNum; j++) { //Loop work for colNum
	                XSSFCell cell = row.getCell(j);
	               String s=  cell.getStringCellValue();
	                System.out.println(s);
	                }}
	         // Code for XLSX Write (POI)
	            /*int num=0;
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
	            wb.close();*/
	            
		
		
		
		
		
		
		
		
		
		
		

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }}

