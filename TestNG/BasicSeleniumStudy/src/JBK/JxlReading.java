package JBK;

import java.io.FileInputStream;

import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class JxlReading {
	static String[] ExpStr;
	
	public static void ExcelRead() throws Exception {
		int z=0;
		FileInputStream fis = new FileInputStream("D:\\ExcelSheet\\TestData.xls");
		Workbook wb= Workbook.getWorkbook(fis);
		Sheet sh= wb.getSheet(0);
		 int row= sh.getRows();
		int col=sh.getColumns();
	//	System.out.println(row+"  "+col);
		ExpStr=new String[row+1];
		for(int c=0;c<=col-1;c++) {
		for(int r=0;r<=row-1;r++) {
			
				Cell cell =sh.getCell(c,r);
				String name=cell.getContents();
				ExpStr[z]=name;
			    z++;
				}}}}
