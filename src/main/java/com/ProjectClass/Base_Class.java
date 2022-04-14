package com.ProjectClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	public static WebDriver driver;
	public static WebDriver set(String text) {
		if (text.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\driver\\chromedriver.exe" );
			 driver=new ChromeDriver();
	}
		else if (text.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir")+"\\driver\\geckodriver.exe" );
				 driver=new FirefoxDriver();
		}
		return driver;
	
	}
	public static void get(String URL) {
		driver.get(URL);
	}
	public static void input(WebElement wer,String Value) {
		wer.sendKeys(Value);
	}
	public static void clickbtn(WebElement Element) {
		Element.click();
		
	}
	public static void close() {
		driver.close();
	}
	public static void quit() {
		driver.quit();
	}
	public static void dropdown(WebElement Element,String type,String value) {
		Select s=new Select(Element);
		if (type.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		}
			else if (type.equalsIgnoreCase("index")) {
				int parseIntt = Integer.parseInt(value);
				s.selectByIndex(parseIntt);
				
				
			}
			else if(type.equalsIgnoreCase("Visible text")) {
				s.selectByVisibleText(value);
			}
		
		
		}
	public static void waits() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public static String value;
	public static String read_automation_data(String path,int sheet_index,int row_index,int cell_index) throws IOException {
		File f=new File(path);
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheetAt(sheet_index);
		Row row = sheet.getRow(row_index);
		Cell cell = row.getCell(cell_index);
		CellType cellType = cell.getCellType();
		if(cellType.equals(cellType.STRING)) {
			 value = cell.getStringCellValue();}
		//	System.out.println(value);}
		else if(cellType.equals(cellType.NUMERIC)) {
			double value1 = cell.getNumericCellValue();
			int a=(int) value1;
			 value = String.valueOf(a);
		}
		return value;
		
		
		
		
		
		
	}
		

		
		
				
			}
		
		
	
	
	
	

