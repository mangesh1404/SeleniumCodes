package com.jbk.sel;

//prog. for write Excel sheet by jxl xls format
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import java.io.File;
import java.io.IOException;

public class WriteExcel {
	private static final String Excel_file_loc = "D:/abc.xls";
	public static void main(String[] args) {
		WritableWorkbook mywork = null;
		try {
			mywork = Workbook.createWorkbook(new File(Excel_file_loc));
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
		}catch(IOException e) {
			e.printStackTrace();
		}catch(WriteException e) {
			e.printStackTrace();
		}finally {
			if(mywork != null) {
				try {
					mywork.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
	}
}
