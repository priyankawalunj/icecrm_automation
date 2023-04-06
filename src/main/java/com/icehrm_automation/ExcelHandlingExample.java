package com.icehrm_automation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;



public class ExcelHandlingExample {

	public static void main(String[] args) {
		String filepath =" C:/Automation tool/Testdata.xlsx";
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
			Sheet sheet =workbook.getSheet("Orangehrm");
			if (sheet==null)
			{
				sheet=workbook.createSheet("Orangehrm");
//				List<WebElement>headerElement=driver.findElements(By.xpath("//div[@class='oxd-table-header']/div/div"));
//				for (int i=1;i<2;i++)
//				{
//					for (int j=1;j<headerElement.size();j++)
//					{
//						String hpath="//div[@class='oxd-table-header']div["+i+"]/div["+j+"]";
//						WebElement hElement =driver.findElement(By.xpath(hpath));
//						String headerText =hElement.getText();
//						Cell cell =sheet.createRow(i-1).createCell(j-i);
//						cell.setCellValue(headerText);
//						FileOutputStream outstream =new FileOutputStream(filepath);
//						workbook.write(outstream);
					}
				//}
				
			//}
			
			
			
//			int totalRows =sheet.getPhysicalNumberOfRows();
//			int totalColumns =sheet.getRow(0).getPhysicalNumberOfCells();
//			 for (int i=1; i<totalRows;i++) {
//				 for (int j=0; i<totalColumns;i++) {
//					 Cell cell =sheet.getRow(i).getCell(j);
//					 CellType cellType =cell.getCellType();
//					 if(cellType.equals(cellType.NUMERIC)) {
//						 System.out.print(cell.getNumericCellValue()+" ");
//					 }else if (cellType.equals(cellType.STRING)) {
//						 System.out.print(cell.getStringCellValue()+" ")	;
//					 }else if (cellType.equals(cellType._NONE)) {
//						 System.out.println();
//					 }else if (cellType.equals( CellType.ERROR)) {
//						 System.out.print(cell.getErrorCellValue());
//						 
//					 }
//				 }
			//	 System.out.println();
			// }
			
		workbook.close();
		}catch(IOException e) {
			throw new RuntimeException(e);
		}
		
		}
		// TODO Auto-generated method stub
	}


