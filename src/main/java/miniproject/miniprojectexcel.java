package miniproject;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class miniprojectexcel {
		public static String[] readDataFromFile() throws IOException{
			
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\Data.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(file);
		
		String[] data = new String[2];
		
		data[0] = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		data[1] = wb.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
		
		wb.close();
		file.close();
		return data;
		
		}

//		public static String[] WriteDataFromFile() throws IOException{
//			
//			FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\utilityminiproject.xlsx");
//			XSSFWorkbook workbook = new XSSFWorkbook();
//			String [] deta = new String[2];
//			XSSFSheet sheet = workbook.createSheet();
//			XSSFRow row = sheet.createRow(1);
//			row.createCell(3).setCellValue("PASSED");
//			XSSFRow row1 = sheet.createRow(2);
//			row1.createCell(3).setCellValue("PASSED");			
//			
//			workbook.close();
//			return deta;
//			
//			
//			
//		}
//	FileInputStream file;
//	void printData() throws FileNotFoundException {
//		file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\utilityminiproject.xlsx");
//
//	}
//	
//	XSSFWorkbook wb = new XSSFWorkbook(file);
}
