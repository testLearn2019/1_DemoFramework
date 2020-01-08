package Reusables;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


 public class Reusable1{

	
	   String data;
	   String CellData;

		public String readProperties(String Property){
			File file = new File("C:\\Users\\user\\OneDrive\\Documents\\Harika\\Framework\\ObjectRespository\\Object.properties");
			try {
			FileInputStream inputstrm = new FileInputStream (file);
			
			Properties prop = new Properties();
			prop.load(inputstrm);
			data = prop.getProperty(Property);
			}
			catch(Exception e) {
				
			}
			return data;
		}
		
		public String readExcel(int RowNum, int ColNum) {
			XSSFSheet ExcelWSheet;		 
			XSSFWorkbook ExcelWBook;
			XSSFCell Cell;
			
			File file = new File ("C:\\Users\\user\\OneDrive\\Documents\\Harika\\Framework\\Testdata\\hybrid.xlsx");
			try {
				FileInputStream ExcelFile = new FileInputStream(file);
				ExcelWBook = new XSSFWorkbook(ExcelFile);
				ExcelWSheet = ExcelWBook.getSheetAt(0);
				//ExcelWSheet.getR
				  Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
		          CellData = Cell.getStringCellValue();
		 
			} catch (Exception e) {
				e.printStackTrace();
			}
			 return CellData;
		

	}
}
