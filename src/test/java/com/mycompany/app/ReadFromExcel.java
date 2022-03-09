package com.mycompany.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadFromExcel {
	public static void main(String[] args) throws IOException
	{
	FileInputStream file = new FileInputStream("C:\\Users\\kpran\\OneDrive\\Desktop\\TestData.xlsx");
	XSSFWorkbook userdata = new XSSFWorkbook(file);	
	
	XSSFSheet sheet1 = userdata.getSheet("Sheet1");
	System.out.println(sheet1.getRow(0).getCell(0).getStringCellValue() + "	" + sheet1.getRow(0).getCell(1).getStringCellValue());
	System.out.println(sheet1.getRow(1).getCell(0).getStringCellValue() + "	" + sheet1.getRow(1).getCell(1).getNumericCellValue());

	System.out.println("");
	
	XSSFSheet sheet2 = userdata.getSheet("sheet2");
	System.out.println(sheet2.getRow(0).getCell(0).getStringCellValue() + "		" + sheet2.getRow(0).getCell(1).getStringCellValue());
	System.out.println(sheet2.getRow(1).getCell(0).getStringCellValue() + "	" + sheet2.getRow(1).getCell(1).getNumericCellValue());
	
	Row row = sheet1.createRow(2);
	Cell cell = row.createCell(2);
	cell.setCellValue("pin");
	FileOutputStream fileOut = new FileOutputStream("C:\\Users\\kpran\\OneDrive\\Desktop\\TestData.xlsx");
	userdata.write(fileOut);
	fileOut.close();
	}
}
