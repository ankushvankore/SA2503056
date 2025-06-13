package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class D11WriteToExcel {
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	//XSSF - XML Spreadsheet Format - .xlsx files
	//HSSF - Horrible spreadsheet format - .xls files
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	@Test
	public void f() {
		row = sheet.createRow(0);		//Create 1st row
		cell = row.createCell(0);		//Create 1st cell inside 1st row
		
		cell.setCellValue("Vyankatesh");
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File("MyFirstExcelFile.xlsx");
		fos = new FileOutputStream(file);
		wb = new XSSFWorkbook();
		sheet = wb.createSheet("My Sheet");
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos);
		//Write the data physically to the file
		wb.close();
		fos.close();
	}

}
