package edu.Factory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataFactory {
	String dataFile = System.getProperty("user.dir")+ File.separatorChar+"src"+File.separatorChar+"main"+File.separatorChar+"resources"+
					File.separatorChar+"TestData.xlsx";
	public void readData() throws IOException {
		FileInputStream fis = new FileInputStream(new File(dataFile));
		XSSFWorkbook workbook = new XSSFWorkbook(fis); 
		
		Sheet sheet = workbook.getSheet("Test");
		
		for(Row row : sheet) {
			for(Cell cell : row) {
				String cellValue = cell.getStringCellValue();
				System.out.println(cellValue +"\t");
			}
			System.out.println();
		}
		workbook.close();
	}
}
