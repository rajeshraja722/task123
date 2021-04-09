import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadData {
public static void main(String[] args) throws IOException {
	File file=new File("C:\\Users\\Rajesh\\eclipse-workspace\\Excel\\Excel\\excel.xlsx");
	FileInputStream fileInputStream=new FileInputStream(file);
//    Workbook book=new HSSFWorkbook(fileInputStream);
	Workbook book = new XSSFWorkbook(fileInputStream);
    Sheet sheet = book.getSheet("Sheet1");
    Row row = sheet.getRow(0);
    Cell cell = row.getCell(0);
    System.out.println("0,0 valuve:"+cell);
    int cellType = cell.getCellType();
    
   int physicalNumberOfCells = row.getPhysicalNumberOfCells();
   System.out.println("cell count:"+physicalNumberOfCells);
   
   int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
   System.out.println("row count"+ physicalNumberOfRows);
   for (int i = 0; i < physicalNumberOfCells; i++) {
	   Cell cell2 = row.getCell(i);
	   System.out.println("all data :"+ cell2);
	   System.out.println("all data :"+ cell2);
	   System.out.println("all data :"+ cell2);
	   System.out.println("all data :"+ cell2);
	   System.out.println("all data :"+ cell2);
	   
	  
	   
	
}
   if(cellType==1) {
	   
	   String stringCellValue = cell.getStringCellValue();
	   System.out.println("if string"+stringCellValue);
	   
   }
   if(cellType==0){
	   Date dateCellValue = cell.getDateCellValue();
	   SimpleDateFormat simpleDateFormat=new SimpleDateFormat("MM-YYYY-DD");
	   String format = simpleDateFormat.format(dateCellValue);
	   System.out.println("else if"+format);
	   
	   
	   
   }
   else {
	   double numericCellValue = cell.getNumericCellValue();
	   long l=(long) numericCellValue;
	   String valueOf = String.valueOf(l);
	   System.out.println("else:"+valueOf);
	   System.out.println("else:"+valueOf);
	   System.out.println("else:"+valueOf);
	   System.out.println("else:"+valueOf);
	   
   }
   
    
	}
	
   
    
    
	
}

