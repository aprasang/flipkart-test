package com.flipkart.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class StoreData {
	public void toExcel(String fileName,String sheetName,int rowIndex,int CellIndex,String data)
	{
		File f=new File("./test-data/"+fileName+".xlsx");
		try{
			FileInputStream fis=new FileInputStream(f);
			Workbook wb=WorkbookFactory.create(fis);
			Sheet st =wb.getSheet(sheetName);
			Row r=st.getRow(rowIndex);
			Cell c=r.getCell(CellIndex);
			c.setCellValue(data);
			FileOutputStream fos=new FileOutputStream(f);
			wb.write(fos);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void toProperties(String fileName,String Key,String value,String comments)
	{
		File f=new File("./test-config/"+fileName+".properties");
		try
		{
			FileInputStream fis=new FileInputStream(f);
			Properties prop=new Properties();
			prop.load(fis);
			prop.setProperty(Key, value);
			FileOutputStream fos=new FileOutputStream(f);
			prop.store(fos, comments);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
