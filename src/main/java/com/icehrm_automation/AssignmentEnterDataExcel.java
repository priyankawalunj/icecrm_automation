package com.icehrm_automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentEnterDataExcel {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchButton = driver.findElement(By.xpath("//button[@type='reset']/following-sibling::button"));
	   if(searchButton.isDisplayed()) {
	    	System.out.println("Successfully able to navigate on pIM module");
	    }else {
	    	System.out.println("unable to navigate on PIM module");
	    }
	   String filepath = "C:\\Users\\MAHESH\\Desktop\\TestData.xlsx";
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
			Sheet sheet =workbook.getSheet("employee status");
			if (sheet ==null) {
				sheet =workbook.createSheet("employee status");
			}
			int totalRows =sheet.getPhysicalNumberOfRows();
			int totalColumns =sheet.getRow(0).getPhysicalNumberOfCells();
			for(int i=1;i<=38;i++) {
				Row row =sheet.createRow(i-1);
				for(int j=2;j<=9;j++) {
					String xpath="//div[@role=\"row\"]["+i+"]/div["+j+"]";
	WebElement value = driver.findElement(By.xpath("//div[@role=\"row\"]"));
						Cell cell=row.createCell(j-2);
						CellType setCellValue = cell.getCellType();
						 if(setCellValue.equals(setCellValue.NUMERIC)) {
							 System.out.print(cell.getNumericCellValue()+" ");
						 }else if (setCellValue.equals(setCellValue.STRING)) {
							 System.out.print(cell.getStringCellValue()+" ");
						 }else if (setCellValue.equals(setCellValue._NONE)) {
							 System.out.println();
						 }else if (setCellValue.equals( CellType.ERROR)) {
							 System.out.print(cell.getErrorCellValue());
							 
						 }
					 }
					 System.out.println();
				 }
			workbook.close();
				
			
		
		
		// TODO Auto-generated method stub
		}catch(FileNotFoundException e) {
			throw new RuntimeException(e);
		}catch(IOException e) {
			throw new RuntimeException(e);
		}
		}
	}






