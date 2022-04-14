package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	public static void dataWrite() throws IOException {
		File a=new File("C:\\Users\\N S Natesh\\Desktop\\general details.xlsx");
		FileInputStream f=new FileInputStream(a);
		Workbook wbb=new XSSFWorkbook(f);
		wbb.createSheet("company details").createRow(0).createCell(0).setCellValue("Employeenid");
		wbb.getSheet("company details").getRow(0).createCell(1).setCellValue("employee name");
		wbb.getSheet("company details").createRow(1).createCell(0).setCellValue("2122307");
		wbb.getSheet("company details").getRow(1).createCell(1).setCellValue("Natesh");
		FileOutputStream ff=new FileOutputStream(a);
		wbb.write(ff);
		wbb.close();
		System.out.println("Everything written Successfully");
		
		
	}
	public static void main(String[] args) throws IOException {
		dataWrite();
	}
		
		
		
		
		
		
	}
	


