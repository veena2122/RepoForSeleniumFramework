package com.actitime.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//create one generic method to write data back
public class FileLib {

	/**
	 * 
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getPropertyData(String key) throws IOException {
		
		FileInputStream fis = new FileInputStream("E:\\Veena\\automation_project_KT\\Actitime\\src\\test\\resources\\data\\commondata.property");
		
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
		
	}
	/**
	 * 
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @return 
	 * @throws IOException 
	 * @throws EncryptedDocumentException 
	 */
	
	public String getExcelData(String sheetName , int row , int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("E:\\Veena\\automation_project_KT\\Actitime\\src\\test\\resources\\data\\TestScriptData.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return data;
		
	}
	
}
