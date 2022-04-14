package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_All_Data {
	public static void AllData() throws IOException {
		File a=new File("C:\\Users\\N S Natesh\\eclipse-workspace\\ProjectClass\\Excel\\general details.xlsx");
		FileInputStream b=new FileInputStream(a);
		Workbook wbs=new XSSFWorkbook(b);
		Sheet sheetAt = wbs.getSheetAt(0);
		int  nor= sheetAt.getPhysicalNumberOfRows();
		for(int i=0;i<nor;i++) {
			Row row = sheetAt.getRow(i);
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			for(int j=0;j<physicalNumberOfCells;j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if (cellType.equals(cellType.STRING)){
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);}
				else if(cellType.equals(cellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					int d=(int) numericCellValue;
					System.out.println(d);
				}
			}	
				}
		
			}
	public static void main(String[] args) throws IOException {
		AllData();
	}
			
			
		
		
		
	}


