package com.icehrm_automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EnterDataExample {

	public static void main(String[] args) {
		
			String filepath = " C:/Automation tool/Testdata.xlsx";
			String extension=filepath.substring(filepath.indexOf(".") + 1);
			System.out.println(filepath);
			Workbook workbook =null;
			try {
				FileInputStream inputstream = new FileInputStream(filepath);
				if(extension.equals("xlsx")) {
					workbook =new XSSFWorkbook(inputstream);
				}else if (extension.equals("xlx")) {
					workbook =new HSSFWorkbook(inputstream);	
				}
				Sheet sheet =workbook.getSheet("TestData1");
				if (sheet ==null) {
					sheet =workbook.createSheet("TestData1");
				}
				Cell cell =sheet.createRow(0).createCell(0);
				cell.setCellValue("Cyber Success");
				FileOutputStream outputstream =new FileOutputStream(filepath);
				workbook.write(outputstream);
				workbook.close();
			
			
			}catch(FileNotFoundException e) {
				throw new RuntimeException(e);
			}catch(IOException e) {
				throw new RuntimeException(e);
			}
			
			
	}
}
				

		// TODO Auto-generated method stub

	


