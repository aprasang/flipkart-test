package com.flipkart.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetData {

	public static String FromExcel(String fileName,String sheetName, int rowIndex,int cellIndex)
	{
		String value=null;
	File f=new File("./test-data/"+fileName +".xlsx");
		try
		{
			FileInputStream fis=new FileInputStream(f);
			Workbook wb=WorkbookFactory.create(fis);
		Sheet st=wb.getSheet(sheetName);
		Row r=st.getRow(rowIndex);
		Cell c=r.getCell(cellIndex);
		value= c.toString();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return value;
	}
	
	public static String FromProperties(String filename,String key)
	{
		String data=null;
		File f=new File("./test-config/"+filename+".properties");
		try
		{
			FileInputStream fis=new FileInputStream(f);
			Properties prop=new Properties();
			prop.load(fis);
			data = (String)prop.get(key);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return data;
	}
}