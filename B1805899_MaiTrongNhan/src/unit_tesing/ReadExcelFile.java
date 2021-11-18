package unit_tesing;
import java.io.File; 
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet; 
import org.apache.poi.xssf.usermodel.XSSFWorkbook; 

public class ReadExcelFile { 

	XSSFWorkbook wb; 
	XSSFSheet sheet; 
	 
	public ReadExcelFile(String excelPath) 
	{ 
	 	try { 
	 	 	File src = new File(excelPath); 
	 	 	FileInputStream fis = new FileInputStream(src); 
	 	 	wb = new XSSFWorkbook(fis); 
	 	} catch (FileNotFoundException e) {  	 	 	
	 		// TODO Auto-generated catch block  	 	 	
	 		e.printStackTrace(); 
	 	} catch (IOException e) { 
	 	 	// TODO Auto-generated catch block  	 	 	
	 		e.printStackTrace(); 
	 	} 
	} 
	 
	public float getData(int sheetnumber, int row, int column) 
	{ 
	 	sheet = wb.getSheetAt(sheetnumber); 
	 	DataFormatter formatter = new DataFormatter();
	 	String data = formatter.formatCellValue(sheet.getRow(row).getCell(column));
	 	float result = Float.parseFloat(data);
	 	return result; 
	 
	} 
	
	public int getSheetCount ()
	{
		int Sheet = wb.getNumberOfSheets();
		Sheet += 1;
		return Sheet;
	}
	
	public int getRowCount(int sheetIndex) 
	{ 
	 	int row = wb.getSheetAt(sheetIndex).getLastRowNum(); 
	 	row = row +1; 
	 	return row; 
	} 
} 

